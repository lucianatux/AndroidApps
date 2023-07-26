package com.curso.android.someapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.curso.android.someapps.R.id.btnIMC
import com.curso.android.someapps.imcCalculator.ImcCalculatorActivity
import com.curso.android.someapps.saludar.SaludarActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludar = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btnSaludar)
        btnSaludar.setOnClickListener { navigateToSaludar() }
        val btnIMC = findViewById<androidx.appcompat.widget.AppCompatButton>(btnIMC)
        btnIMC.setOnClickListener { navigateToIMC() }

    }

    private fun navigateToIMC() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludar(){
        val intent = Intent(this, SaludarActivity::class.java)
        startActivity(intent)
    }
}