package com.thisisit.grocery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.thisisit.grocery.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        mainBinding.categoriesRecyclerView.layoutManager = LinearLayoutManager(this)
        val categoriesListAdapter = CategoriesAdapter(pairList)
        mainBinding.categoriesRecyclerView.adapter = categoriesListAdapter
    }
}