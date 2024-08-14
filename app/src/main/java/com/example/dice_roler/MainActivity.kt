package com.example.dice_roler

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        // ADDING  function on button dynamically
        val rollButton:Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            //Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
            rollDiece()
        }
        diceImage =  findViewById(R.id.dice_image)

    }

    private fun rollDiece() {

//        val resultText:TextView =findViewById(R.id.result_text)

        val randomNumber = Random.nextInt(6)+1 // generating the number between 1 to 6

       // resultText.text =randomNumber.toString()

        val drawableResource = when(randomNumber){
            1 -> R.drawable.dice_1
            2-> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 ->R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
    }
}
