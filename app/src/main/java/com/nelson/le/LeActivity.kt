//Nelson Hong Le - 301064831 - COMP 304 SEC401

package com.nelson.le

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_exercises_checkbox)
        val nextButton: Button = findViewById(R.id.nextButton)

        val userName = "Nelson"

        isUsingCheckboxes(userName)

        nextButton.setOnClickListener {
            var selectedExercises = ""


            val exercise1CheckBox = findViewById<CheckBox>(R.id.exerciseCheckBox1)
            val exercise2CheckBox = findViewById<CheckBox>(R.id.exerciseCheckBox2)
            val exercise3CheckBox = findViewById<CheckBox>(R.id.exerciseCheckBox3)

            if (exercise1CheckBox.isChecked) {
                selectedExercises += "Exercise 1, "
            }
            if (exercise2CheckBox.isChecked) {
                selectedExercises += "Exercise 2, "
            }
            if (exercise3CheckBox.isChecked) {
                selectedExercises += "Exercise 3, "
            }

            Toast.makeText(this@LeActivity, selectedExercises, Toast.LENGTH_SHORT)
                .show()
        }
    }

    private fun isUsingCheckboxes(userName: String): Boolean {
        val firstLetter = userName[0].lowercaseChar()
        return firstLetter in 'a'..'n'
    }
}
