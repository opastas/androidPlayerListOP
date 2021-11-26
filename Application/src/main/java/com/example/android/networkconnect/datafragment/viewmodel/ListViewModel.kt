package com.example.android.networkconnect.datafragment.viewmodel

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android.networkconnect.datafragment.datainj.DaggerApiComponent
import com.example.android.networkconnect.datafragment.model.Character
import com.example.android.networkconnect.datafragment.model.DataResponse
import com.example.android.networkconnect.datafragment.model.DataService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.item_character.view.*
import javax.inject.Inject

class ListViewModel: ViewModel() {
    @Inject
    lateinit var dataService: DataService
    init {
        DaggerApiComponent.create().inject(this)
    }

    @Inject
    lateinit var disposable: CompositeDisposable

    var searchQuery = ""

    val characters by lazy { MutableLiveData<List<Character>>() }

    val loading by lazy { MutableLiveData<Boolean>() }
    val characterLoadError by lazy { MutableLiveData<Boolean>() }
    val listIsEmptyError by lazy { MutableLiveData<Boolean>() }
    private val selectedCharacter by lazy { MutableLiveData<Character>() }
    val changeFragment by lazy { MutableLiveData<Boolean>() }
    private val mutableSelectedItem = MutableLiveData<Character>()
    val selectedItem: LiveData<Character> get() = mutableSelectedItem

    private val mutableToast = MutableLiveData<Boolean>()
    val showToastApp: MutableLiveData<Boolean> get() = mutableToast

    fun refresh(searchText: String) {
        fetchCharacters(searchText)
    }

    private fun fetchCharacters(searchText: String) {
        loading.value = true
        listIsEmptyError.value = false
        disposable.add(
            dataService.getCharacters()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSingleObserver<DataResponse>() {
                    override fun onSuccess(value: DataResponse?) {
                        val matchPattern = searchQuery.matches(Regex("[0-9]+"))
                        if (searchQuery.isNotEmpty() && searchQuery.toIntOrNull() != null &&
                            matchPattern) {
                            characters.value = value?.values?.filter {
                                if (it?.h_in != null) {
                                    ((it.h_in.toIntOrNull() ?: 0) > (searchQuery.toIntOrNull()
                                        ?: 0))
                                } else {
                                    return
                                }
                            }
                        }
                        characterLoadError.value = false
                        listIsEmptyError.value =
                            (characters.value == null) || (characters.value != null && characters.value!!.isEmpty()) ||
                                    !matchPattern
                        changeFragment.value = false
                        loading.value = false
                    }

                    override fun onError(e: Throwable?) {
                        characterLoadError.value = true
                        listIsEmptyError.value = false
                        loading.value = false
                        changeFragment.value = false
                    }
                })
        )
    }

    fun navigateItemDetail(character: View) {
        val clickedCharacter = characters.value?.filter {
            if(it.first_name != null && it.first_name.isNotEmpty()) {
                it.first_name.contains(character.name.text)} else {
                return
            } }
        if (clickedCharacter != null && clickedCharacter.size == 1) mutableSelectedItem.value = clickedCharacter[0]
        else mutableSelectedItem.value = null
        changeFragment.value = true
    }

    fun showToast(){
        showToastApp.value = true
    }

    override fun onCleared() {
        super.onCleared()
        disposable.clear()
    }
}