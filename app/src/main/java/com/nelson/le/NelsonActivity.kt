//Nelson Hong Le - 301064831 - COMP 304 SEC401
package com.nelson.le

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class NelsonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nelson_activity_main)

        val imageButton: ImageButton = findViewById(R.id.selectExerciseButton)
        imageButton.setOnClickListener {
            val intent = Intent(this@NelsonActivity, LeActivity::class.java)
            startActivity(intent)
        }
    }
}
