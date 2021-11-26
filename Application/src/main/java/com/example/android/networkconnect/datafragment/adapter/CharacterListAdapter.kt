package com.example.android.networkconnect.datafragment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.networkconnect.R

import androidx.recyclerview.widget.RecyclerView
import com.example.android.networkconnect.datafragment.model.Character
import com.example.android.networkconnect.datafragment.viewmodel.ItemClickNavigation
import com.example.android.networkconnect.util.getProgressDrawable
import com.example.android.networkconnect.util.loadImage
import kotlinx.android.synthetic.main.item_character.view.*

class CharacterListAdapter(var characters: ArrayList<Character>, private val mNavigation: ItemClickNavigation): RecyclerView.Adapter<
        CharacterListAdapter.CharacterViewHolder>() {


    fun updateCharacters(newCharacters: List<Character>) {
        characters.clear()
        characters.addAll(newCharacters)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int) = CharacterViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_character, parent, false)
    )

    override fun getItemCount() = characters.size

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.bind(characters[position])
    }

    inner class CharacterViewHolder(view: View): RecyclerView.ViewHolder(view) {
        private val imageView = view.imageView
        private val imagePhoneView = view.imagePhoneView
        private val imageEmailView = view.imageEmailView
        private val characterName = view.name
        private val characterPhone = view.phone
        private val characterEmail= view.email
        private val progressDrawable = getProgressDrawable(view.context)

        init {
            view.apply {
                view.setOnClickListener {
                    val position = adapterPosition
                    if (position != RecyclerView.NO_POSITION) {
                        mNavigation.onItemClick(it)
                    }
                }
            }
        }


        fun bind(character: Character) {
            characterName.text = character.first_name + " " + character.last_name
            characterPhone.text = "Height (inches): " + character.h_in
            characterEmail.text = "Height (meters): " + character.h_meters
            imagePhoneView.loadImage(R.drawable.phone_icon, progressDrawable)
            imageEmailView.loadImage(R.drawable.email_icon, progressDrawable)
            imageView.loadImage(R.mipmap.ic_launcher, progressDrawable)
        }
    }
}