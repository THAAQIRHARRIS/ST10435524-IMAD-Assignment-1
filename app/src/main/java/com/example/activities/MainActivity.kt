package com.example.activities

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnNumber = findViewById<Button>(R.id.btnNumber)
        val edtNumber = findViewById<TextView>(R.id.edtNumber)
        val txtNumber = findViewById<TextView>(R.id.txtNumber)
        val btnClick = findViewById<Button>(R.id.btnClear)
        val txtHead = findViewById<TextView>(R.id.txtHead)

        txtHead.text = "Welcome to the History app"           // code for app when it runs
        txtNumber.text = ""                                   //^

        btnClick?.setOnClickListener {                //code for clear button
            txtNumber.text = ""
            edtNumber.text = ""
        }

        btnNumber?.setOnClickListener {                      //code for click button

             if (edtNumber.text.toString().toInt() <= 20){   // code to determine what message will display
                    txtNumber.text = " There are not historical figures in the 20's year old range enter again"

                }else{
                    if (edtNumber.text.toString().toInt() <= 30){
                       txtNumber.text = "Martin Luther King Jr., a prominent American leader of the civil rights movement and Nobel Peace Prize winner" +
                               ", was shot and killed at the Lorraine Motel in Memphis, Tennessee, on April 4, 1968, at the age of 39"

                    }else {
                        if (35 >= edtNumber.text.toString().toInt()){
                        txtNumber.text = "Vincent Willem van Gogh was a Dutch Post-Impressionist painter who is among the most famous and influential" +
                                " figures in the history of Western art. In just over a decade" +
                                ", he created approximately 2100 artworks, including around 860 oil paintings, most of them in the last two years of his life"

                    }
                    if (40>= edtNumber.text.toString().toInt()){
                        txtNumber.text = "Beyoncé Giselle Knowles-Carter is an American singer," +
                                " rapper, songwriter, record producer, actress, and businesswoman."

                    }else{
                        if (50 >= edtNumber.text.toString().toInt()){
                          txtNumber.text = "William Shakespeare (between 26 April 1564 and 23 April 1564 – 23 April 1616)" +
                                  " was an English dramatist, poet, and theatre actor. He wrote plays such as Hamlet and Romeo and Juliet"


                        }else{
                            if (55 >= edtNumber.text.toString().toInt()){
                            txtNumber.text = "Abraham Lincoln was an American lawyer, politician, and statesman, who served as the 16th" +
                                    " president of the United States, from 1861 until his assassination in 1865."

                        }
                        if (60 >= edtNumber.text.toString().toInt()){
                            txtNumber.text = "Timothy Donald Cook is an American business executive who has been the chief" +
                                    " executive officer of Apple Inc. Cook had previously been the company's chief operating " +
                                    "officer under its co-founder Steve Jobs."
                        }else {
                            if (65 >= edtNumber.text.toString().toInt()){
                               txtNumber.text = "Leonardo di ser Piero da Vinci was an Italian polymath of the High Renaissance who was active as a painter," +
                                       " draughtsman, engineer, scientist, theorist, sculptor, and architect"

                        }else{
                            if (70 >= edtNumber.text.toString().toInt()){
                               txtNumber.text = "Albert Einstein was a German-born theoretical physicist who is widely" +
                                       " held to be one of the greatest and most influential scientists of all time."
                            }else{
                            if (80 >= edtNumber.text.toString().toInt()) {
                                txtNumber.text =
                                    "Carlos Ray \"Chuck\" Norris is an American martial artist and actor." +
                                            " He is a black belt in Tang Soo Do, Brazilian jiu jitsu and judo. After serving" +
                                            " in the United States Air Force, Norris won many martial arts championships and later" +
                                            " founded his own discipline, Chun Kuk Do."
                            } else {
                                if (95 == edtNumber.text.toString().toInt()) {

                                    txtNumber.text =
                                        "Nelson Rolihlahla Mandela was a South African anti-apartheid activist," +
                                                " politician, and statesman who served as the first president of South Africa from 1994 to 1999." +
                                                " He was the country's first black head of state and the first elected in a fully representative " +
                                                "democratic election."


                                }else{
                                    if (100 >= edtNumber.text.toString().toInt()){
                                        txtNumber.text = "number out of age range enter a different number"
                                    }                                       // will display if out of range
                                }
                            }

                        }}
                    }}

                }}



        }}




    }




}



