package com.example.android.networkconnect.util

import android.content.Context
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.android.networkconnect.R

fun getProgressDrawable(context: Context): CircularProgressDrawable {
    return CircularProgressDrawable(context).apply {
        strokeWidth = 10f
        centerRadius = 50f
        start()
    }
}

fun ImageView.loadImage(uri: Int, progressDrawable: CircularProgressDrawable) {
    val options = RequestOptions()
        .placeholder(progressDrawable)
        .error(R.mipmap.ic_launcher_round)
    Glide.with(this.context)
        .setDefaultRequestOptions(options)
        .load(uri)
        .into(this)
}

fun addFragmentToActivity(fragmentManager: FragmentManager,
                          fragment: Fragment, frameId: Int) {
    val transaction = fragmentManager.beginTransaction()
    transaction.replace(frameId, fragment)
    transaction.commit()
}

fun addFragmentToActivity(fragmentManager: FragmentManager,
                          fragment: Fragment, tag: String?) {
    val transaction = fragmentManager.beginTransaction()
    transaction.add(fragment, tag)
    transaction.commit()
}