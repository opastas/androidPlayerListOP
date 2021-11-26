package com.example.android.networkconnect.datafragment

import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android.networkconnect.R
import com.example.android.networkconnect.datafragment.adapter.CharacterListAdapter
import com.example.android.networkconnect.datafragment.viewmodel.ItemClickNavigation
import com.example.android.networkconnect.datafragment.viewmodel.ListViewModel
import kotlinx.android.synthetic.main.data_fragment.*


class DataFragment : Fragment(), ItemClickNavigation {

    // instance of fragment
    companion object {
        fun newInstance() = DataFragment()
    }

    lateinit var viewModel: ListViewModel
    private var charactersAdapter = CharacterListAdapter(arrayListOf(), this)

    private lateinit var searchView: SearchView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val toolbar = requireActivity().findViewById<Toolbar>(R.id.my_toolbar)
        toolbar.title = "Prueba de ingreso"

        if (toolbar.menu != null) setHasOptionsMenu(true)

        return inflater.inflate(R.layout.data_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = activity?.let { ViewModelProviders.of(it).get(ListViewModel::class.java) }!!
        viewModel.refresh(viewModel.searchQuery)

        charactersList.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = charactersAdapter
        }

        swipeRefreshLayout.setOnRefreshListener {
            swipeRefreshLayout.isRefreshing = false
            viewModel.refresh(viewModel.searchQuery)
        }



        observeViewModel()
    }

    fun observeViewModel() {

        viewModel.characters.observe(viewLifecycleOwner, Observer { characters ->
            characters?.let {
                charactersList.visibility = View.VISIBLE
                charactersAdapter.updateCharacters(it)
            }
        })

        viewModel.characterLoadError.observe(viewLifecycleOwner, Observer { isError ->
            isError?.let { list_error.visibility = if(it) View.VISIBLE else View.GONE }
        })

        viewModel.listIsEmptyError.observe(viewLifecycleOwner, Observer { isError ->
            isError?.let { empty_list_error.visibility = if(it) View.VISIBLE else View.GONE }
        })

        viewModel.loading.observe(viewLifecycleOwner, Observer { isLoading ->
            isLoading?.let {
                loading_view.visibility = if(it) View.VISIBLE else View.GONE
                if(it) {
                    list_error.visibility = View.GONE
                    charactersList.visibility = View.GONE
                }
            }
        })

//        viewModel.selectedItem.observe(viewLifecycleOwner, Observer { goToDetail ->
//            goToDetail?.let {
//                if(it != null) {
//                    // activity.
//                }
//            }
//        })
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.main, menu)

        val searchItem = menu.findItem(R.id.searchView)
        searchView = searchItem.actionView as SearchView

        val pendingQuery = viewModel.searchQuery
        if (pendingQuery != null && pendingQuery.isNotEmpty()) {
            searchItem.expandActionView()
            searchView.setQuery(pendingQuery, false)
        }

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                viewModel.searchQuery = newText?.toLowerCase() ?: ""
                viewModel.refresh(viewModel.searchQuery)
                return true
            }
        })

        val informationButton = menu.findItem(R.id.fetch_action)

        informationButton.setOnMenuItemClickListener {
            showToast()
        }

    }

    private fun showToast(): Boolean {
        viewModel.showToast()
        return true
    }

    override fun onDestroyView() {
        super.onDestroyView()
        // searchView.setOnQueryTextListener(null)
    }

    override fun onItemClick(character: View) {
        viewModel.navigateItemDetail(character)
    }
}