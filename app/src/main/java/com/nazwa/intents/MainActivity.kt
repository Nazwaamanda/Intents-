package com.nazwa.intents

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nazwa.intents.databinding.ActivityMainBinding // Pastikan ini sesuai dengan package name Anda
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {

    private val log = Logger.getLogger(MainActivity::class.java.name)
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inisialisasi binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Log info
        log.info("onCreate called")

        // Event handler untuk tombol yang membuka SecondActivity
        binding.btnToSecondActivity.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        }
    }
    override fun onPause() {
        super.onPause()
        log.info("onPause called")
    }

    override fun onRestart() {
        super.onRestart()
        log.info("onRestart called")
    }

    override fun onResume() {
        super.onResume()
        log.info("onResume called")
    }
}
