package com.example.simpletextapp
import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceDigitsBtn.setOnClickListener {
        val input: String = inputDigits.text?.toString()?:""
            val transformationResult = replaceOddDigitsInstring(input)

        }
    }

    private fun replaceOddDigitsInstring(digits: String): String {
        var resultString = ""

        digits.forEach {
        if (it.toString().toInt()%2 == 0)
        {
            resultString += it.toString()
        }else {
            resultString += "A"
        }
        }
        return resultString
    }
}