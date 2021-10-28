package com.example.android_02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()


    }

    fun signin(view: View) {

        val name = findViewById<EditText>(R.id.name)
        val email = findViewById<EditText>(R.id.email)
        val pass = findViewById<EditText>(R.id.pass)


        val msgN: String = name.text.toString()
        val msgE: String = email.text.toString()
        val msgP: String = pass.text.toString()






        if ((msgN.trim().length>0) && (msgE.trim().length>0) && (msgP.trim().length>0)) {


            val intent = Intent(this@MainActivity, sec::class.java) // (1) (2)
            startActivity(intent)


        }

        else {
            Toast.makeText(applicationContext, "Please enter some message! ", Toast.LENGTH_SHORT).show()
        }
    }
}