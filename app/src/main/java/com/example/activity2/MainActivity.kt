package com.example.activity2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val but1 = findViewById<Button>(R.id.idBtn1);
        val but2 = findViewById<Button>(R.id.button2);
        val but3 = findViewById<Button>(R.id.button3);

        val text1 = findViewById<EditText>(R.id.E1);
        val Tv1 = findViewById<TextView>(R.id.TV1);

        val text2 = findViewById<TextView>(R.id.OutputE);

        but1.setOnClickListener{
            val val1 = text1.text.toString().toFloat();
            val total= ((val1-32)*5)/9;
            val toast = Toast.makeText(this, total.toString(), Toast.LENGTH_SHORT) // in Activity
            toast.show()
            text2.setText(total.toString()+"°C");
            Tv1.setText("Fahrenheit");
        }

        but2.setOnClickListener{
            val val1 = text1.text.toString().toFloat();
            val total= (val1*9/5)+32;
            val toast = Toast.makeText(this, total.toString(), Toast.LENGTH_SHORT) // in Activity
            toast.show()
            text2.setText(total.toString()+"°F");
            Tv1.setText("Celsius");
        }

        but3.setOnClickListener{
            val val1 = text1.text.toString().toFloat();
            val total= val1+273.15;
            val toast = Toast.makeText(this, total.toString(), Toast.LENGTH_SHORT) // in Activity
            toast.show()
            text2.setText(total.toString()+"K");
            Tv1.setText("Celsius");
        }

    }
}