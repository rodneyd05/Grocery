package com.thisisit.grocery

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GroceryAdapter(private var groceriesList: List<Grocery>): RecyclerView.Adapter<GroceryAdapter.GroceriesListHolder>() {

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
        return groceriesList.size
    }

    override fun onBindViewHolder(holder: GroceriesListHolder, position: Int) {
        holder.groceryName.text = fruitList[position].name
        holder.groceryPrice.text = fruitList[position].price.toString()
        holder.groceryImage.setImageResource(fruitList[position].image)
    }
}