package com.example.drawerlayout

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts


class BlankFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

      var  view=inflater.inflate(R.layout.fragment_blank, container, false)

       var a = view.findViewById<ImageView>(R.id.pic11)



       var button = view.findViewById<Button>(R.id.button)
















            val galleryLauncher = registerForActivityResult(ActivityResultContracts.GetContent()) {
                val galleryUri = it
                try{


                    a.setImageURI(galleryUri)








                }catch(e:Exception){
                    e.printStackTrace()
                }

            }



            button.setOnClickListener {


                galleryLauncher.launch("image/*")

            }


            Toast.makeText(context,"profile", Toast.LENGTH_LONG).show()














        return view





    }


}