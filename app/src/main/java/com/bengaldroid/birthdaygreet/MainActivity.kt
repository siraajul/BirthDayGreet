package com.bengaldroid.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Birthdaybutton = findViewById<Button>(R.id.createBirthdayButton)
        val name = findViewById<EditText>(R.id.inputText)

        Birthdaybutton.setOnClickListener {
            name.editableText.toString()

            Toast.makeText(this@MainActivity, "name is ${name.text}",Toast.LENGTH_LONG).show()
        }

    }
}