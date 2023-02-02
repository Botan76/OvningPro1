package com.example.ovningproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(val onItemClicked: ()-> Unit) : RecyclerView.Adapter<ContactAdapter.ViewHolder>() {

    var contacts = mutableListOf<String>("AS","BB","CC","WE","DF")

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        val contactName: TextView

        init {
            contactName = view.findViewById<TextView>(R.id.PeronNameTV)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contacts_item, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.contactName.text=contacts[position].toString()

        holder.itemView.setOnClickListener {
            onItemClicked()
        }
    }
}