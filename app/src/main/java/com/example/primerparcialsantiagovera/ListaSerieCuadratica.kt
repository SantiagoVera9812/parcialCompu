package com.example.primerparcialsantiagovera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.primerparcialsantiagovera.databinding.ActivityListaSerieCuadraticaBinding

class ListaSerieCuadratica : AppCompatActivity() {

    private lateinit var binding: ActivityListaSerieCuadraticaBinding
    private lateinit var serieDeNumeros: IntArray
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityListaSerieCuadraticaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        serieDeNumeros = intent.getIntArrayExtra("serieCuadratica") ?: intArrayOf()

        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,serieDeNumeros)


    }
}