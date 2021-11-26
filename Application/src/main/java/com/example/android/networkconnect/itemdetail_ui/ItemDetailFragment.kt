package com.example.android.networkconnect.itemdetail_ui

import android.os.Bundle
import android.view.*
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.example.android.networkconnect.R
import com.example.android.networkconnect.datafragment.DataFragment
import com.example.android.networkconnect.datafragment.viewmodel.ListViewModel
import com.example.android.networkconnect.util.getProgressDrawable
import com.example.android.networkconnect.util.loadImage
import kotlinx.android.synthetic.main.data_fragment.*
import kotlinx.android.synthetic.main.item_character.*
import kotlinx.android.synthetic.main.item_character_detail.*
import kotlinx.android.synthetic.main.item_character_detail.view.*
import kotlinx.android.synthetic.main.main_activity.*

class ItemDetailFragment : Fragment() {
    // instance of fragment
    companion object {
        fun newInstance() = ItemDetailFragment()
    }

    lateinit var viewModel: ListViewModel
    private var progressDrawable: CircularProgressDrawable? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val toolbar = requireActivity().findViewById<Toolbar>(R.id.my_toolbar)
        toolbar.title = "Detalle"
        setHasOptionsMenu(false)

        return inflater.inflate(R.layout.item_character_detail, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = activity?.let { ViewModelProviders.of(it).get(ListViewModel::class.java) }!!

        bindValues(view)
    }

    fun bindValues(view: View) {
        if (viewModel.selectedItem.value != null) {
            progressDrawable = getProgressDrawable(view.context)
            view.nameDetail.text = viewModel.selectedItem.value!!.first_name
            imagePhoneViewDetail.loadImage(R.drawable.phone_icon, progressDrawable!!)
            imageEmailViewDetail.loadImage(R.drawable.email_icon, progressDrawable!!)
        }
    }

}