package com.example.ovningproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StartFragment : Fragment() {
    lateinit var contactadapter : ContactAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        contactadapter = ContactAdapter {
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, DetailFragment()).addToBackStack(null).commit()
        }

        val ContactrecyclerV = view.findViewById<RecyclerView>(R.id.contactRecView)
        ContactrecyclerV.adapter=contactadapter
        ContactrecyclerV.layoutManager= LinearLayoutManager(requireContext())



    }
}