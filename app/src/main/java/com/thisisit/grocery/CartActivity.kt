package com.thisisit.grocery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
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

        //create an instance of an abstract class
        //add ? to adapter
        val swipeToDeleteCallback = object: SwipeToDeleteCallback() {
            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val position = viewHolder.adapterPosition

                val nameRemoved = StringBuilder()
                nameRemoved.append(cartList[position].name).append(" removed")

                cartList.removeAt(position)
                cartBinding.cartRecyclerView.adapter?.notifyItemRemoved(position)
                Toast.makeText(viewHolder.itemView.context, nameRemoved, Toast.LENGTH_SHORT).show()
            }
        }

        val itemTouchHelper = ItemTouchHelper(swipeToDeleteCallback)
        itemTouchHelper.attachToRecyclerView(cartBinding.cartRecyclerView)
    }

}