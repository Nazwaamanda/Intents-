package com.nazwa.intents

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nazwa.intents.databinding.ActivitySecondBinding // Pastikan ini sesuai dengan package name Anda
import java.util.logging.Logger

class SecondActivity : AppCompatActivity() {

    private val log = Logger.getLogger(SecondActivity::class.java.name)
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inisialisasi binding
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Log info
        log.info("onCreate called")

        // Fungsi untuk menutup activity saat tombol ditekan
        binding.btnExitActivity.setOnClickListener {
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        log.info("onStart called")
    }

    override fun onStop() {
        super.onStop()
        log.info("onStop called")
    }
}
