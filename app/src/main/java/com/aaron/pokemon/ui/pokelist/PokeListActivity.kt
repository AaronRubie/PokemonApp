package com.aaron.pokemon.ui.pokelist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.aaron.pokemon.R
import com.aaron.pokemon.ui.pokeinfo.PokeInfoActivity
import kotlinx.android.synthetic.main.activity_main.*

class PokeListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_poke)

        initUI()
    }

    private fun initUI(){
        recyclerVpokemon.layoutManager = LinearLayoutManager(this)
        recyclerVpokemon.adapter = PokeListAdapter{
            val intent = Intent(this,PokeInfoActivity::class.java)
            intent.putExtra("id",it)
            startActivity(intent)
        }
    }
}