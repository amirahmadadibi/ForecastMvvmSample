package net.codeinreal.projects.forecastmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navController = Navigation.findNavController(this, R.id.navHostFragment)
        bottomNavigationView.setupWithNavController(navController)

        setSupportActionBar(toolbar)
        NavigationUI.setupActionBarWithNavController(this,navController)



    }

    //hanlde up(simple back flash in toolbar) to be handle in navcontroller. backpress
    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController,null)
    }
}