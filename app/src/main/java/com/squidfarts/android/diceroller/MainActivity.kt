/***********************************************************************************
 *                                                                                 *
 * NAME: MainActivity.kt                                                           *
 *                                                                                 *
 * AUTHOR: Michael Brockus.                                                        *
 *                                                                                 *
 * CONTACT: <mailto:michael@squidfarts.com>                                        *
 *                                                                                 *
 * NOTICES:                                                                        *
 *                                                                                 *
 * License: Apache 2.0 :http://www.apache.org/licenses/LICENSE-2.0                 *
 *                                                                                 *
 ***********************************************************************************/
package com.squidfarts.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity()
{
    private lateinit var diceImageOne: ImageView
    private lateinit var diceImageTwo: ImageView

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        this.diceImageOne = findViewById(R.id.dice_one_result)
        this.diceImageTwo = findViewById(R.id.dice_two_result)

    }// end of method onCreate

    private fun rollDice()
    {
        this.diceImageOne.setImageResource(getRandomDiceRoll())
        this.diceImageTwo.setImageResource(getRandomDiceRoll())
    }// end of method rollDice

    private fun getRandomDiceRoll(): Int
    {
        return when (Random.nextInt(6) + 1)
        {
            1    -> R.drawable.dice_side_1
            2    -> R.drawable.dice_side_2
            3    -> R.drawable.dice_side_3
            4    -> R.drawable.dice_side_4
            5    -> R.drawable.dice_side_5
            else -> R.drawable.dice_side_6
        }
    }

}// end of class MainActivity
