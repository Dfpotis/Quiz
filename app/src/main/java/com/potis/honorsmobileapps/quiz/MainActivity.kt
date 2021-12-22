package com.potis.honorsmobileapps.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.potis.honorsmobileapps.quiz.databinding.ActivityMainBinding

const val QUESTION="question"
class MainActivity : AppCompatActivity() {
   lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val rootView= binding.root
        setContentView(rootView)
    }
}
