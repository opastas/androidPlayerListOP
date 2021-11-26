package com.example.android.networkconnect.datafragment.viewmodel

import android.os.Bundle

import androidx.fragment.app.Fragment

/**
 * Non-UI Fragment used to retain ViewModels.
 */
class ViewModelHolder<VM> : Fragment() {
    var viewmodel: VM? = null
        private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    fun setViewModel(viewModel: VM) {
        viewmodel = viewModel
    }

    companion object {
        fun <M> createContainer(viewModel: M): ViewModelHolder<*> {
            val viewModelContainer = ViewModelHolder<M>()
            viewModelContainer.setViewModel(viewModel)
            return viewModelContainer
        }
    }
}