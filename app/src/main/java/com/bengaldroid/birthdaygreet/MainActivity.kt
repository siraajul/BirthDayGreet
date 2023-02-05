package com.bengaldroid.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameInput = findViewById<EditText>(R.id.inputText)

        val name = nameInput.editableText.toString()

        val intent = Intent(this, GreetingActivity::class.java)
        intent.putExtra(GreetingActivity.NAME_EXTRA, name)
        startActivity(intent)
    }
}
