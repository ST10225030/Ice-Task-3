package com.example.icetask3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculateButton.setOnClickListener {
            // Get user input from EditText
            val number = numberEditText.text.toString().toIntOrNull()

            if (number != null) {
                // Generate multiplication table
                val table = generateMultiplicationTable(number)
                // Display multiplication table
                resultTextView.text = table
            } else {
                resultTextView.text = "Please enter a valid number."
            }
        }
    }

    private fun generateMultiplicationTable(number: Int): String {
        val builder = StringBuilder()

        for (i in 1..10) {
            val result = number * i
            builder.append("$number x $i = $result\n")
        }

        return builder.toString()
    }
}
        }
    }
}