package com.living2learn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button2)
        val button2: Button = findViewById(R.id.button3)
        val button3: Button = findViewById(R.id.button4)
        val button4: Button = findViewById(R.id.button5)
        val button5: Button = findViewById(R.id.button6)
        val button6: Button = findViewById(R.id.button7)

        button.setOnClickListener {
            startActivity(Intent(this, Level1Activity::class.java))
        }

        button2.setOnClickListener {
            startActivity(Intent(this, Level2Activity::class.java))
        }

        button3.setOnClickListener {
            startActivity(Intent(this, Level3Activity::class.java))
        }

        button4.setOnClickListener {
            startActivity(Intent(this, Level4Activity::class.java))
        }
        button5.setOnClickListener {
            startActivity(Intent(this, Level5Activity::class.java))
        }

        button6.setOnClickListener {
            startActivity(Intent(this, Level6Activity::class.java))
        }

        }

    }
