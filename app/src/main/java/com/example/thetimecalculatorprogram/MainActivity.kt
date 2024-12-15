package com.example.thetimecalculatorprogram

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var enterTimeOne: EditText
    private lateinit var enterTimeTwo: EditText
    private lateinit var buttonDifBTN: Button
    private lateinit var buttonPlusBTN: Button
    private lateinit var resultTV: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        enterTimeOne = findViewById(R.id.input_timeOne)
        enterTimeTwo = findViewById(R.id.input_timeTwo)
        buttonDifBTN = findViewById(R.id.buttonDifBTN)
        buttonPlusBTN = findViewById(R.id.buttonPlusBTN)
        resultTV = findViewById(R.id.resultTE)

        enterTimeOne.setOnClickListener(this)
        enterTimeTwo.setOnClickListener(this)


    }


    override fun onClick(v: View) {
        var enterTimeOne = enterTimeOne.text.toString()
        var enterTimeTwo = enterTimeTwo.text.toString()
        var result = when (v.id) {
            R.id.buttonPlusBTN -> Operation(enterTimeOne, enterTimeTwo).sum()
            R.id.buttonDifBTN -> Operation(enterTimeOne,enterTimeTwo).div()
            else -> 0
        }
        resultTV.text = result.toString()
    }
}
