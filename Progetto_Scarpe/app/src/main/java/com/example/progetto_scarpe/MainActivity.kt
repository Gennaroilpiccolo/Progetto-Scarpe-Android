package com.example.progetto_scarpe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import com.example.progetto_scarpe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.Login -> {

                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainer, RegisterFragment())
                        commit()
                    }
                    // Gestisci il clic sul pulsante 1 (Item 1)
                    // Esegui l'azione desiderata
                    true
                }
                R.id.Search -> {
                    // Gestisci il clic sul pulsante 2 (Item 2)
                    // Esegui l'azione desiderata
                    true
                }
                // Aggiungi ulteriori casi per altri pulsanti, se necessario
                else -> false
            }
        }


    }
}
