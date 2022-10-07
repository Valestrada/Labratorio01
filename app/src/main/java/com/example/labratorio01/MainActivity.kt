package com.example.labratorio01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*


class MainActivity : AppCompatActivity() {
    lateinit var etnNombre: EditText
    lateinit var etnEdad: EditText
    lateinit var etnDepartamento: EditText
    private var tvresultado: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etnNombre = findViewById(R.id.etn_nombre)
        etnEdad = findViewById(R.id.etn_edad)
        etnDepartamento = findViewById(R.id.etn_departamento)
        tvresultado = findViewById(R.id.tv_seleccion)

    }

    fun ingresar(Vista: View) {
        val nombre = etnNombre.text.toString()
        val edad = etnEdad.text.toString()
        val departamento = etnDepartamento.toString()


        if (nombre.length == 0) {
            Toast.makeText(this, "Ingresar nombre", Toast.LENGTH_LONG).show()
        }
        if (edad.length == 0) {
            Toast.makeText(this, "Ingresar edad", Toast.LENGTH_LONG).show()
        }
        if (departamento.length == 0) {
            Toast.makeText(this, "Ingresar departamento", Toast.LENGTH_LONG).show()
        }
        if (nombre.length != 0 && edad.length != 0 && departamento.length != 0) {
            Toast.makeText(this, "Registro en proceso...", Toast.LENGTH_LONG).show()
        }

        tvresultado?.text = ("Su nombre es" + nombre + "de" + edad + "del departamento " + departamento)
    }
}





