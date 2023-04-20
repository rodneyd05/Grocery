package com.thisisit.grocery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.thisisit.grocery.databinding.ActivityCartBinding

class CartActivity : AppCompatActivity() {

    private lateinit var cartBinding: ActivityCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        cartBinding = ActivityCartBinding.inflate(layoutInflater)
        setContentView(cartBinding.root)

        cartBinding.cartRecyclerView.layoutManager = LinearLayoutManager(this)
        val cartListAdapter = CartAdapter(cartList)
        cartBinding.cartRecyclerView.adapter = cartListAdapter
    }
}