package com.example.thetimecalculatorprogram

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var enter_timeOne: EditText
    private lateinit var enter_timeTwo: EditText
    private lateinit var buttonDifBTN: Button
    private lateinit var buttonPlusBTN: Button
    private lateinit var resultTV: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        enter_timeOne = findViewById(R.id.input_timeOne)
        enter_timeTwo = findViewById(R.id.input_timeTwo)
        buttonDifBTN = findViewById(R.id.buttonDifBTN)
        buttonPlusBTN = findViewById(R.id.buttonPlusBTN)
        resultTV = findViewById(R.id.resultTE)

        enter_timeOne.setOnClickListener(this)

    }


    override fun onClick(v: View) {
        var enter_timeOne = enter_timeOne.text.toString()
        var enter_timaTwo = enter_timeTwo.text.toString()
        var result = when (v.id) {
            R.id.buttonPlusBTN -> Operation(enter_timeOne, enter_timaTwo).sum()
            else -> 0
        }
        resultTV.text = result.toString()
    }
}
