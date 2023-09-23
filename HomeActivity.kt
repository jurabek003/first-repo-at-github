package com.turgunboyevjurabek.shareadpreferens

import android.content.SharedPreferences
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.toColorInt
import com.turgunboyevjurabek.shareadpreferens.databinding.ActivityHomeBinding
import com.turgunboyevjurabek.shareadpreferens.madels.MyAbject


class HomeActivity : AppCompatActivity() {
    private val binding by lazy { ActivityHomeBinding.inflate(layoutInflater) }
    private lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            MyAbject.rang=binding.btn1.background
            binding.viewvv.background=MyAbject.rang
        }
        binding.btn2.setOnClickListener {
            MyAbject.rang=binding.btn2.background
            binding.viewvv.background=MyAbject.rang
        }
        binding.btn3.setOnClickListener {
            MyAbject.rang=binding.btn3.background
            binding.viewvv.background=MyAbject.rang
        }
        binding.btn4.setOnClickListener {
            MyAbject.rang=binding.btn4.background
            binding.viewvv.background=MyAbject.rang
        }
        binding.btn5.setOnClickListener {
            MyAbject.rang=binding.btn5.background
            binding.viewvv.background=MyAbject.rang
        }
        binding.btn6.setOnClickListener {
            MyAbject.rang=binding.btn6.background
            binding.viewvv.background=MyAbject.rang
 }
    }
}