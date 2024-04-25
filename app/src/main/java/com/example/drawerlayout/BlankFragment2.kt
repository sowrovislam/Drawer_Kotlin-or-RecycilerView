package com.example.drawerlayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BlankFragment2 : Fragment() {


 lateinit var rvAdapter: RvAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       val view = inflater.inflate(R.layout.fragment_blank2, container, false)

        var RecleerView=view.findViewById<RecyclerView>(R.id.RecleerView)









rvAdapter= context?.let { RvAdapter(Constent.getdata(), it) }!!




//     rvAdapter= context?.let { RvAdapter(datalist, it) }!!




        RecleerView.layoutManager= LinearLayoutManager(context, LinearLayoutManager.VERTICAL
            ,false)
        RecleerView.adapter=rvAdapter





















        // Inflate the layout for this fragment
        return view
    }

}