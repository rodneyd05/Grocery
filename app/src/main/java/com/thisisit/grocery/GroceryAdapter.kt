package com.thisisit.grocery

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class GroceryAdapter(private var list: List<Grocery>): RecyclerView.Adapter<GroceryAdapter.GroceriesListHolder>() {

    class GroceriesListHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val groceryName: TextView = itemView.findViewById(R.id.groceryName)
        val groceryPrice: TextView = itemView.findViewById(R.id.groceryPrice)
        val groceryImage: ImageView = itemView.findViewById(R.id.groceryImage)
        val cartAdd: ImageView = itemView.findViewById(R.id.cartAdd)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroceriesListHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.groceries_list_design, parent, false)

        return GroceriesListHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: GroceriesListHolder, position: Int) {

        val priceString = StringBuilder()
        priceString.append("Php ").append(list[position].price.toString())

        holder.groceryName.text = list[position].name
        holder.groceryPrice.text = priceString
        holder.groceryImage.setImageResource(list[position].image)

        holder.cartAdd.setOnClickListener {
            val itemAdded = StringBuilder()
            itemAdded.append(list[position].name).append(" added to cart")

            cartList.add(list[position])
            Toast.makeText(holder.itemView.context, itemAdded, Toast.LENGTH_SHORT).show()
        }
    }
}