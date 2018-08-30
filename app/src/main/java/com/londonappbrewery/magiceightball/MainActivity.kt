package com.londonappbrewery.magiceightball

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*
//import java.util.concurrent.ThreadLocalRandom

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val diceArray : Array<Int> = arrayOf(
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        )

        val answerButton : Button = findViewById(R.id.askButton)
        val image : ImageView = findViewById(R.id.e8ballView)

        answerButton.setOnClickListener {
            image.setImageResource(diceArray[(0..4).random()])
        }

    }

    /*
        Having fun with randomNumber gen the Kotlin Way!
     */
    //fun ClosedRange<Int>.random() = ThreadLocalRandom.current().nextInt((endInclusive + 1) - start) + start
    private fun ClosedRange<Int>.random() = Random().nextInt((endInclusive + 1) - start) + start

}
