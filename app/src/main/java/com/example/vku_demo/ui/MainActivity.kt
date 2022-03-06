package com.example.vku_demo.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.vku_demo.R
import com.example.vku_demo.data.Person

class MainActivity : AppCompatActivity() {
    private lateinit var personAdapter: PersonAdapter
    private lateinit var rvPerson: RecyclerView
    private lateinit var btnOpenSecond: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        initAdapter()
        initRecycler()
        openSecondScreen()
    }

    private fun initView() {
        rvPerson = findViewById(R.id.rvPerson)
        btnOpenSecond = findViewById(R.id.btnOpenScreen)
    }

    private fun initAdapter() {
        personAdapter = PersonAdapter(createListData())
    }

    private fun createListData(): MutableList<Person> {
        val listPerson = mutableListOf<Person>()
        for (index in 0..100) {
            listPerson.add(Person("Thang nam", phone = "Soobin Hoang Son"))
        }
        return listPerson
    }

    private fun initRecycler() {
        rvPerson.layoutManager = LinearLayoutManager(this)
        rvPerson.adapter = personAdapter
    }

    private fun openSecondScreen(value: String = "") {
        btnOpenSecond.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(SecondActivity.KEY_PHONE_VALUE, value)
            startActivity(intent)
        }
    }



}