package com.gmail.part1.satrio.belajarkotlin3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun toastMe(view: View){
            // val myToast = Toast.makeText(this, message, duration);
            val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
            myToast.show()
        }
        fun countMe (view: View) {

            // Get the value of the text view.
            val countString = teks.text.toString()

            // Convert value to a number and increment it
            var count: Int = Integer.parseInt(countString)
            count++

            // Display the new value in the text view.
            teks.text = count.toString();

            // Create an Intent to start the second activity
            val randomIntent = Intent(this, Main2Activity::class.java)

            // Start the new activity.
            randomIntent.putExtra(Main2Activity.TOTAL_COUNT, count)
            startActivity(randomIntent)
        }
        fun randomMe (view: View) {
            // Create an Intent to start the second activity
            val randomIntent = Intent(this, Main2Activity::class.java)

            // Get the current value of the text view.
            val countString = teks.text.toString()

            // Convert the count to an int
            val count = Integer.parseInt(countString)

            // Add the count to the extras for the Intent.
            randomIntent.putExtra(Main2Activity.TOTAL_COUNT, count)

            // Start the new activity.
            startActivity(randomIntent)
        }
    }
}
