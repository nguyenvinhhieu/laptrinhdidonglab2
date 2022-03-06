package com.example.vku_demo.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.vku_demo.R

/**
 * @author huypham on 2/24/22
 */
class SecondActivity : AppCompatActivity() {
    companion object {
        const val KEY_PHONE_VALUE = "key_phone_value"
    }

    private lateinit var username: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_second)
        initView()
        showPhoneData()
    }

    private fun initView() {
        username = findViewById(R.id.username)
    }

    private fun showPhoneData() {
        val name = intent.getStringExtra(KEY_PHONE_VALUE)
        username.text = name
    }
}
