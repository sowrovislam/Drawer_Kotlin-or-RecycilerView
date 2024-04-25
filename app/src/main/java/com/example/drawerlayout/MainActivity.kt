package com.example.drawerlayout

import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    lateinit var drawerLayout:DrawerLayout
    lateinit var materialToolbar:MaterialToolbar
    lateinit var navigationView:NavigationView
    lateinit var BottomNavaigation:BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout=findViewById(R.id.DrawerLayout)

         materialToolbar=findViewById(R.id.MaterialToolbar)

        navigationView=findViewById(R.id.navigationView)

         BottomNavaigation=findViewById(R.id.BottomNavaigation)





//>>>>>>>>>>>>> Hadar in Layout Kotlin  DawerLayout      >>>>>>   START      >>>>>>>>>>>>>>>>>>>>>>>>>>>



        val headerView: View = navigationView.getHeaderView(0)

        val profile_image:ImageView = headerView.findViewById(R.id.profile_image)

         val pic:Button = headerView.findViewById(R.id.pic)




        

        //>>>>>>>>>>>>> Hadar in Layout Kotlin  DawerLayout      >>>>>>   END      >>>>>>>>>>>>>>>>>>>>>>>>>>>




        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.FremLayout,BlankFragment())
        fragmentTransaction.commit()












        val actionBarDrawerToggle=ActionBarDrawerToggle(
            this,
            drawerLayout,
            materialToolbar,
            R.string.open_drawer,
            R.string.close_drawer
        )
        drawerLayout.addDrawerListener(actionBarDrawerToggle)


        navigationView.setNavigationItemSelectedListener {

            when(it.itemId){

                R.id.profile->{




                    val fragmentManager = supportFragmentManager
                    val fragmentTransaction = fragmentManager.beginTransaction()
                    fragmentTransaction.add(R.id.FremLayout,BlankFragment2())
                    fragmentTransaction.commit()




                    Toast.makeText(this,"profile",Toast.LENGTH_LONG).show()
                }
                 R.id.about->{

                    Toast.makeText(this,"about",Toast.LENGTH_LONG).show()
                }
                 R.id.cloud->{

                    Toast.makeText(this,"cloud",Toast.LENGTH_LONG).show()
                }
                 R.id.emoji->{

                    Toast.makeText(this,"emoji",Toast.LENGTH_LONG).show()
                }

                else->{
                    Toast.makeText(this,"not Work",Toast.LENGTH_LONG).show()

                }

            }

            true
        }









    }
}