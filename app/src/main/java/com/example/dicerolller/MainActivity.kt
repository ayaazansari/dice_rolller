package com.example.dicerolller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage :ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton:Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rolldice()
            Toast.makeText(this,"button is clicked",Toast.LENGTH_SHORT).show()
        }
        diceImage = findViewById(R.id.dice_image)
    }

    private fun rolldice() {
        val random = Random().nextInt(6)+1;

        val drawableResource =
                when(random)
                {
                    1-> R.drawable.dice_1
                    2-> R.drawable.dice_2
                    3-> R.drawable.dice_3
                    4-> R.drawable.dice_4
                    5-> R.drawable.dice_5
                    else->
                        R.drawable.dice_6

                }
        diceImage.setImageResource(drawableResource)
    }
}