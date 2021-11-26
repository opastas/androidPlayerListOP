/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.networkconnect

import androidx.lifecycle.Observer
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.ViewModelProviders
import com.example.android.networkconnect.datafragment.DataFragment
import com.example.android.networkconnect.datafragment.datainj.DaggerApiComponent
import com.example.android.networkconnect.datafragment.viewmodel.ListViewModel
import com.example.android.networkconnect.datafragment.viewmodel.ViewModelHolder
import com.example.android.networkconnect.itemdetail_ui.ItemDetailFragment
import com.example.android.networkconnect.util.addFragmentToActivity
import kotlinx.android.synthetic.main.data_fragment.*

/**
 * Sample Activity demonstrating how to connect to the network and fetch raw
 * HTML. It uses a Fragment that encapsulates the network operations on an AsyncTask.
 *
 * This sample uses a TextView to display output.
 */
class MainActivity : AppCompatActivity(), ActivityNavigation {

    // lateinit var searchView: SearchView

    companion object {
        const val TASKS_VIEWMODEL_TAG = "TASKS_VIEWMODEL_TAG"
    }

    lateinit var viewModel: ListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        // viewModel = findOrCreateViewModel()
        viewModel = ViewModelProviders.of(this).get(ListViewModel::class.java)
        DaggerApiComponent.create().inject(this)
        if (savedInstanceState == null) {
            findOrCreateViewFragment()
        }
        val toolbar = findViewById<Toolbar>(R.id.my_toolbar)
        setSupportActionBar(toolbar)
        toolbar.title = "Prueba de ingreso"
        supportActionBar?.setDisplayHomeAsUpEnabled(false);
        observeViewModel()
    }

    fun observeViewModel() {
//        viewModel?.changeFragment?.observe(this, Observer { goToDetail ->
//            goToDetail?.let {
//                if(it) navigateToFragment()
//            }
//        })

        viewModel.selectedItem.observe(this, Observer { item ->
            if (item != null) navigateToFragment()
        })

        viewModel.showToastApp.observe(this, Observer { item ->
            if (item) displayMessage()
        })
    }

    private fun displayMessage() {
        Toast.makeText(applicationContext, getString(R.string.dev_name), Toast.LENGTH_LONG).show()
    }

    override fun onSupportNavigateUp(): Boolean {
        findOrCreateViewFragment()
        supportActionBar?.setDisplayHomeAsUpEnabled(false);
        return false
    }

    private fun findOrCreateViewModel(): ListViewModel? {
        // In a configuration change we might have a ViewModel present. It's retained using the
        // Fragment Manager.
        val retainedViewModel = supportFragmentManager
            .findFragmentByTag(TASKS_VIEWMODEL_TAG) as ViewModelHolder<ListViewModel?>?
        return if (retainedViewModel?.viewmodel != null) {
            // If the model was retained, return it.
            retainedViewModel.viewmodel
        } else {
            // There is no ViewModel yet, create it.
            val viewModel = ViewModelProviders.of(this).get(ListViewModel::class.java)
            // and bind it to this Activity's lifecycle using the Fragment Manager.
            addFragmentToActivity(
                supportFragmentManager,
                ViewModelHolder.createContainer(viewModel),
                TASKS_VIEWMODEL_TAG)
            viewModel
        }
    }

    override fun navigateToFragment() {
        findOrCreateItemViewFragment()
        supportActionBar?.setDisplayHomeAsUpEnabled(true);
    }

    private fun findOrCreateItemViewFragment(): ItemDetailFragment? {
        var itemDetailFragment: ItemDetailFragment? =
            supportFragmentManager.findFragmentById(R.id.item_detail) as ItemDetailFragment?
        if (itemDetailFragment == null) {
            // Create the fragment
            itemDetailFragment = ItemDetailFragment.newInstance()
            addFragmentToActivity(supportFragmentManager, itemDetailFragment, R.id.main_act_container)
        }
        return itemDetailFragment
    }

    private fun findOrCreateViewFragment(): DataFragment? {
        var dataFragment: DataFragment? =
            supportFragmentManager.findFragmentById(R.id.data_fragment) as DataFragment?
        if (dataFragment == null) {
            // Create the fragment
            dataFragment = DataFragment.newInstance()
            addFragmentToActivity(supportFragmentManager, dataFragment, R.id.main_act_container)
        }
        return dataFragment
    }

    override fun onDestroy() {
        super.onDestroy()
    }

//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.main, menu)
//        searchView = menu?.findItem(R.id.searchView)?.actionView as SearchView
//        configureSearch(searchView)
//        return true
//    }

    // private fun configureSearch(searchView: SearchView)  {
//        searchView.setOnSearchClickListener { toggleTabs(true) }
//        searchView.setOnCloseListener {
//            toggleTabs(false)
//            // viewModel.resetList()
//            return@setOnCloseListener false
//        }
//        searchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener {
//            override fun onQueryTextSubmit(query: String?): Boolean { return true }
//
//            override fun onQueryTextChange(newText: String?): Boolean {
//                    searchText(newText?.toLowerCase() ?: "");
//                return true
//            }
//        })
//    }
//
//    private fun searchText(searchString: String) {
//        viewModel.searchTextFilter(searchString);
//    }
//    private fun toggleTabs(show: Boolean) {
//        searchView.visibility = if (show) View.VISIBLE else View.GONE
//    }
}
