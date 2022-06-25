package com.elchinasgarov.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button_2 = findViewById<Button>(R.id.button_2)
        val edit_text_2 = findViewById<EditText>(R.id.edit_text_2)
        val text_view_2 = findViewById<TextView>(R.id.text_view_2)
        val messagee_1 = intent.getStringExtra("message_1")
        val person = intent.getSerializableExtra("person")
        text_view_2.text = person.toString()



        button_2.setOnClickListener {
            val message_2 = edit_text_2.text.toString()

            Intent(this,MainActivity::class.java).also {
                it.putExtra("message_2",message_2)
                startActivity(it)
            }
        }

    }
}