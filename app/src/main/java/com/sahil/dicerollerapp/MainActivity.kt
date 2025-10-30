package com.sahil.dicerollerapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var diceImage1: ImageView
    private lateinit var diceImage2: ImageView
    private lateinit var rollButton: Button
    private lateinit var rollHistoryText: TextView

    private val diceImages = listOf(
        R.drawable.dice_1,
        R.drawable.dice_2,
        R.drawable.dice_3,
        R.drawable.dice_4,
        R.drawable.dice_5,
        R.drawable.dice_6
    )

    private val rollHistory = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage1 = findViewById(R.id.diceImage1)
        diceImage2 = findViewById(R.id.diceImage2)
        rollButton = findViewById(R.id.rollButton)
        rollHistoryText = findViewById(R.id.rollHistory)

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val dice1 = Random.nextInt(1, 7)
        val dice2 = Random.nextInt(1, 7)

        diceImage1.setImageResource(diceImages[dice1 - 1])
        diceImage2.setImageResource(diceImages[dice2 - 1])

        val resultString = getString(R.string.roll_result, dice1, dice2)
        rollHistory.add(0, resultString)
        if (rollHistory.size > 5) rollHistory.removeAt(rollHistory.size - 1)

        val historyDisplay = getString(
            R.string.roll_history_display,
            getString(R.string.roll_history_label),
            rollHistory.joinToString("\n")
        )
        rollHistoryText.text = historyDisplay
    }
}
