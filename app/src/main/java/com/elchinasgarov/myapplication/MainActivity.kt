package com.elchinasgarov.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button_1 = findViewById<Button>(R.id.button_1)
        val edit_text_1 = findViewById<EditText>(R.id.edit_text_1)
        val text_view_1 = findViewById<TextView>(R.id.text_view_1)
        val messagee_2 = intent.getStringExtra("message_2")
        text_view_1.text = messagee_2
        val person = Person("Elchin","Asgarov",20)


        button_1.setOnClickListener {
            val message_1 = edit_text_1.text.toString()
            Intent(this, MainActivity2::class.java).also {
                it.putExtra("message_1", message_1)
                it.putExtra("person",person)
                startActivity(it)
            }
        }
    }
}