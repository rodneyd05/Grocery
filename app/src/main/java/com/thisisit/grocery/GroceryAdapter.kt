package com.thisisit.grocery

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GroceryAdapter(private var list: List<Grocery>): RecyclerView.Adapter<GroceryAdapter.GroceriesListHolder>() {

    class GroceriesListHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val groceryName: TextView = itemView.findViewById(R.id.groceryName)
        val groceryPrice: TextView = itemView.findViewById(R.id.groceryPrice)
        val groceryImage: ImageView = itemView.findViewById(R.id.groceryImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroceriesListHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.groceries_list_design, parent, false)

        return GroceriesListHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: GroceriesListHolder, position: Int) {

        val builder = StringBuilder()
        builder.append("Php ").append(list[position].price.toString())

        holder.groceryName.text = list[position].name
        holder.groceryPrice.text = builder.toString()
        holder.groceryImage.setImageResource(list[position].image)
    }
}