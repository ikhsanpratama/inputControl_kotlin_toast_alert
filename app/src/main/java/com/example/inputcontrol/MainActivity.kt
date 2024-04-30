package com.example.inputcontrol

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1 = findViewById<Button>(R.id.button1) as Button;
        val button = findViewById<Button>(R.id.button) as Button;
        button1.setOnClickListener(){
            Toast.makeText(applicationContext,"Contoh pesan TOAST",Toast.LENGTH_SHORT).show()

            val toast = Toast.makeText(applicationContext, "Ikhsan Pratama / 23552012008", Toast.LENGTH_SHORT)
            toast.show()
        }

        button.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle(R.string.judulDialog)
            builder.setMessage(R.string.pesanDialog)
            builder.setIcon(android.R.drawable.ic_dialog_alert)

            builder.setPositiveButton("OK"){dialogInterface, which ->
                Toast.makeText(applicationContext,"Tombol OK - Klik",Toast.LENGTH_LONG).show()
            }
            builder.setNeutralButton("Cancel"){dialogInterface , which ->
                Toast.makeText(applicationContext,"Tombol Cancel - Klik",Toast.LENGTH_LONG).show()
            }
            builder.setNegativeButton("No"){dialogInterface, which ->
                Toast.makeText(applicationContext,"Tombol No - Klik",Toast.LENGTH_LONG).show()
            }
            val alertDialog: AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
    }
}