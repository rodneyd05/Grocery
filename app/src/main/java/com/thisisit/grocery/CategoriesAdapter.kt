package com.thisisit.grocery

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CategoriesAdapter(private var list: List<PairData>): RecyclerView.Adapter<CategoriesAdapter.CategoriesListHolder>() {

    class CategoriesListHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val categoryName: TextView = itemView.findViewById(R.id.categoryName)
        val groceryRecyclerView: RecyclerView = itemView.findViewById(R.id.groceryRecyclerView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesListHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.categories_list_design, parent, false)

        return CategoriesListHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: CategoriesListHolder, position: Int) {
        holder.categoryName.text = list[position].name

        holder.groceryRecyclerView.layoutManager = LinearLayoutManager(holder.itemView.context, LinearLayoutManager.HORIZONTAL, false)
        val groceriesListAdapter = GroceryAdapter(list[position].category)
        holder.groceryRecyclerView.adapter = groceriesListAdapter
    }
}