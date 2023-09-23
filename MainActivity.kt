package com.turgunboyevjurabek.shareadpreferens

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.turgunboyevjurabek.shareadpreferens.databinding.ActivityMainBinding
import com.turgunboyevjurabek.shareadpreferens.madels.MyAbject

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    lateinit var sharedPreferences: SharedPreferences
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnGO.setOnClickListener {
            startActivity(Intent(this,HomeActivity::class.java))
        }

        if (MyAbject.rang!=null){
            binding.myActivity.background=MyAbject.rang
        }
    }

    override fun onStart() {
        super.onStart()
        if (MyAbject.rang!=null){
            binding.myActivity.background=MyAbject.rang
        }
    }
}
