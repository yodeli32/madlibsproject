package com.example.madlibsproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView

class FinalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        val message1 = intent.getStringExtra("message_one")
        val message2 = intent.getStringExtra("message_two")
        val message3 = intent.getStringExtra("message_three")
        val message4 = intent.getStringExtra("message_four")
        val message5 = intent.getStringExtra("message_five")
        val message6 = intent.getStringExtra("message_six")
        val message7 = intent.getStringExtra("message_seven")
        val message8 = intent.getStringExtra("message_eight")
        val message9 = intent.getStringExtra("message_nine")
        val message10 = intent.getStringExtra("message_ten")
        val message11 = intent.getStringExtra("message_eleven")
        val message12 = intent.getStringExtra("message_twelve")
        val message13 = intent.getStringExtra("message_thirteen")
        val message14 = intent.getStringExtra("message_fourteen")
        val message15 = intent.getStringExtra("message_fifteen")

        val textView = findViewById<TextView>(R.id.tv_1).apply {
            text = message1
        }
        val textView1 = findViewById<TextView>(R.id.tv_2).apply{
            text = message2
        }
        val textView2 = findViewById<TextView>(R.id.tv_3).apply{
            text = message3
        }
        val textView3 = findViewById<TextView>(R.id.tv_4).apply{
            text = message4
        }
        val textView4 = findViewById<TextView>(R.id.tv_5).apply{
            text = message5
        }
        val textView6 = findViewById<TextView>(R.id.tv_6).apply{
            text = message6
        }
        val textView7 = findViewById<TextView>(R.id.tv_7).apply{
            text = message7
        }
        val textView8 = findViewById<TextView>(R.id.tv_8).apply{
            text = message8
        }
        val textView9 = findViewById<TextView>(R.id.tv_9).apply{
            text = message9
        }
        val textView10 = findViewById<TextView>(R.id.tv_10).apply{
            text = message10
        }
        val textView11 = findViewById<TextView>(R.id.tv_11).apply{
            text = message11
        }
        val textView12 = findViewById<TextView>(R.id.tv_12).apply{
            text = message12
        }
        val textView13 = findViewById<TextView>(R.id.tv_13).apply{
            text = message13
        }
        val textView14 = findViewById<TextView>(R.id.tv_14).apply{
            text = message14
        }
        val textView15 = findViewById<TextView>(R.id.tv_15).apply{
            text = message15
        }
    }
}
