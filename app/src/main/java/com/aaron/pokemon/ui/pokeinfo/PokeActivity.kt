package com.aaron.pokemon.ui.pokeinfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.aaron.pokemon.R

class PokeInfoActivity : AppCompatActivity() {

    lateinit var viewModel: PokeinfoViweModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_poke_info_viwe_model)

        viewModel = ViewModelProvider(this).get(PokeinfoViweModel::class.java)

        initUI()
    }

    private fun initUI(){
        val id = intent.extras?.get("id") as Int

        viewModel.getPokemonInfo(id)

        viewModel.pokemonInfo.observe(this, Observer { pokemon ->
            name.text = pokemon.name
            base_Happiness.text = "Felicidad: ${pokemon.happiness}"
            capture_Rate.text = "Radio de captura: ${pokemon.rate}"
            Color.text = "Color: ${pokemon.color}"
            egg_Groups.text = "Grupo de Huevos: ${pokemon.egggroups}"

        })
    }
}