package com.example.madlibsproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_create.*

class CreateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)
    }

    fun sendMessage(view: View) {
        val editText1 = findViewById<EditText>(R.id.noun_1)
        val editText2 = findViewById<EditText>(R.id.pir)
        val editText3 = findViewById<EditText>(R.id.verb)
        val editText4 = findViewById<EditText>(R.id.body_part)
        val editText5 = findViewById<EditText>(R.id.adjetive_1)
        val editText6 = findViewById<EditText>(R.id.noun_2)
        val editText7 = findViewById<EditText>(R.id.noun_3)
        val editText8 = findViewById<EditText>(R.id.pluralN_1)
        val editText9 = findViewById<EditText>(R.id.liquid_1)
        val editText10 = findViewById<EditText>(R.id.adjetive_2)
        val editText11 = findViewById<EditText>(R.id.noun_4)
        val editText12 = findViewById<EditText>(R.id.noun_5)
        val editText13 = findViewById<EditText>(R.id.noun_6)
        val editText14 = findViewById<EditText>(R.id.pluralN_2)
        val editText15 = findViewById<EditText>(R.id.body_part_2)


        val message1 = editText1.text.toString()
        val message2 = editText2.text.toString()
        val message3 = editText3.text.toString()
        val message4 = editText4.text.toString()
        val message5 = editText5.text.toString()
        val message6 = editText6.text.toString()
        val message7 = editText7.text.toString()
        val message8 = editText8.text.toString()
        val message9 = editText9.text.toString()
        val message10 = editText10.text.toString()
        val message11 = editText11.text.toString()
        val message12 = editText12.text.toString()
        val message13 = editText13.text.toString()
        val message14 = editText14.text.toString()
        val message15 = editText15.text.toString()

        val intent = Intent(this, FinalActivity::class.java).apply{
            putExtra("message_one", message1)
            putExtra("message_two", message2)
            putExtra("message_three", message3)
            putExtra("message_four", message4)
            putExtra("message_five", message5)
            putExtra("message_six", message6)
            putExtra("message_seven", message7)
            putExtra("message_eight", message8)
            putExtra("message_nine", message9)
            putExtra("message_ten", message10)
            putExtra("message_eleven", message11)
            putExtra("message_twelve", message12)
            putExtra("message_thirteen", message13)
            putExtra("message_fourteen", message14)
            putExtra("message_fifteen", message15)
        }

        startActivity(intent)
    }



}
