package com.example.primerparcialsantiagovera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.primerparcialsantiagovera.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var listaNumeros: IntArray
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calcular.setOnClickListener {
            val numero = binding.numero.editText?.text.toString().toInt()

            if(numero in 0..20) {
                crearSerieCuadratica(it)
                val intent = Intent(this, ListaSerieCuadratica::class.java)
                intent.putExtra("serieCuadratica", listaNumeros)
                startActivity(intent)
            }else{
                crearSerieCuadratica(it)
            }
        }
    }

    fun crearSerieCuadratica(view: View){
        val numero = binding.numero.editText?.text.toString().toInt()

        if(numero in 0..20){

            listaNumeros = IntArray(numero+1){it*it*it}

            for(numeroDado in listaNumeros){
                Log.d("Serie cuadratica",numeroDado.toString())
            }

        }else{
            Toast.makeText(this,"Numero invalido",Toast.LENGTH_SHORT).show()
        }



    }
}