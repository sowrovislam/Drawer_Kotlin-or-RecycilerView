package com.example.drawerlayout

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputBinding
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RvAdapter (var datalist:ArrayList<RvMoel>,var context: Context):RecyclerView.Adapter<RvAdapter.MyViewHolder>(){




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        var view= LayoutInflater.from(context).inflate(R.layout.itemlayout,parent,false)

        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
     return   datalist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

       var profilepic= holder.view.findViewById<ImageView>(R.id.profilepic)

        var name= holder.view.findViewById<TextView>(R.id.name)

        var address= holder.view.findViewById<TextView>(R.id.address)

        profilepic.setImageResource(datalist.get(position).profile)


          name.text=datalist.get(position).name
        address.text=datalist. get(position).address









    }


    inner class MyViewHolder(var view:View): RecyclerView.ViewHolder(view)
}