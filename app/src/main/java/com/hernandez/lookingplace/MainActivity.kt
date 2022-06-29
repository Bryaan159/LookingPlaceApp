package com.hernandez.lookingplace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.*
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.navigation.NavigationView
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    // Variables utilizadas para el manejo del Menu lateral
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var navigationView: NavigationView
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //funciones para setear el menu
        setupNavigation()
        setupNavigationView()
    }

    private fun setupNavigationView() {
        navigationView = findViewById(R.id.nav_vista)
        navigationView.setupWithNavController(navController)
        navigationView.setNavigationItemSelectedListener(this)
        fillNavigationView()
    }

    private fun fillNavigationView() {
        // llamamos a la cabezera y obtenemos los valores que se alojan en ella
        val cabezera = navigationView.getHeaderView(0)
        val nombre_usuario: TextView = cabezera.findViewById(R.id.nombre_usuario_text_view)
        nombre_usuario.text = "Bienvenido Ariel"
        // aqui se realiza el cambio de nombre y se llena el espacio de la cabezera
        navigationView.menu.clear()
        navigationView.inflateMenu(R.menu.main_menu)
    }

    private fun setupNavigation() {
        val toolBar: MaterialToolbar = findViewById(R.id.main_toolbar)
        setSupportActionBar(toolBar)
        // llamamos al fragmento Host y utilizamos sus propiedades para trabajar con el controlador
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment)
                as NavHostFragment
        navController = navHostFragment.navController
        drawerLayout =findViewById(R.id.main_drawer)
        // Seteamos donde queremos que aparezca el menu de hamburguesa
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.tablaCategoria, R.id.configuracion, R.id.buscador
            ),
            drawerLayout
        )
        // Mandamos la configuraciòn guiada por el Controlador
        setupActionBarWithNavController(navController, appBarConfiguration)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.accesoFragment -> {
                finish()
                true
            } else -> {
                val handle = NavigationUI.onNavDestinationSelected(item, navController)
                if(handle) drawerLayout.close()
                handle
            }
        }
    }
}