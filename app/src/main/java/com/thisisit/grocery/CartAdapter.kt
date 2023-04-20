package com.thisisit.grocery

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CartAdapter(private var list: List<Grocery>): RecyclerView.Adapter<CartAdapter.CartListHolder>() {

    class CartListHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val cartListName: TextView = itemView.findViewById(R.id.cartListName)
        val cartListPrice: TextView = itemView.findViewById(R.id.cartListPrice)
        val cartListImage: ImageView = itemView.findViewById(R.id.cartListImageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartListHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.cart_list_design, parent, false)

        return CartListHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: CartListHolder, position: Int) {

        val builder = StringBuilder()
        builder.append("Php ").append(list[position].price.toString())

        holder.cartListName.text = list[position].name
        holder.cartListPrice.text = builder.toString()
        holder.cartListImage.setImageResource(list[position].image)
    }
}