package com.example.practice13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun convertButton(view: View){
        val textViewOut: TextView = findViewById(R.id.textViewOutInfo)
        val editTextDollarExchangeRate: EditText = findViewById(R.id.editTextDollarExchangeRate)
        val editTextDollarsInputToChange: EditText = findViewById(R.id.editTextDollarsInputToChange)
        if(editTextDollarsInputToChange.text.toString() != "" && editTextDollarExchangeRate.text.toString() != "") {
            val a: String = editTextDollarsInputToChange.text.toString()
            val b: String = editTextDollarExchangeRate.text.toString()
            var convertedRubles: Double = a.toDouble() * b.toDouble()
            textViewOut.text = "${editTextDollarsInputToChange.text} $ это $convertedRubles Рублей"
        }
        else{
            val checkDataToast = Toast.makeText(this, "Проверьте корректность введённых данных", Toast.LENGTH_SHORT)
            checkDataToast.show()
        }
    }
}