package com.techmania.math

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class Addition : AppCompatActivity() {

    lateinit var score : TextView
    lateinit var life : TextView
    lateinit var time : TextView
    lateinit var ques : TextView
    lateinit var ans : TextView
    lateinit var ok : Button
    lateinit var next : Button
    var correctAns = 0
    var scoreVal = 0
    var lifeVal = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addition)

        score = findViewById(R.id.Scoreval)
        life = findViewById(R.id.Lifeval)
        time = findViewById(R.id.Timeval)
        ques = findViewById(R.id.ques)
        ans = findViewById(R.id.ans)
        ok = findViewById(R.id.Ok)
        next = findViewById(R.id.Next)

        game()

        ok.setOnClickListener {
            val input = ans.text.toString()
            if(input=="")
            {
                Toast.makeText(applicationContext, "Please enter your answer", Toast.LENGTH_SHORT).show()
            }
            else
            {
                val userIn = input.toInt()
                if(userIn==correctAns)
                {
                    scoreVal = scoreVal+10
                    ques.text = "Correct Answer!!"
                    score.text = scoreVal.toString()
                }
                else
                {
                    lifeVal--
                    ques.text = "Sorry, Wrong answer! :("
                    life.text = lifeVal.toString()
                }
            }
        }

        next.setOnClickListener {

            game()
            ans.setText("")
        }
    }
    fun game()
    {
        val n1 = Random.nextInt(from = 0, until = 100)
        val n2 = Random.nextInt(from = 0, until = 100)

        ques.text = "$n1 + $n2"
        correctAns = n1+n2

    }
}