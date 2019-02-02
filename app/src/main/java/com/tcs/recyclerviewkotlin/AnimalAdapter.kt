package com.tcs.recyclerviewkotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.item_animal.view.*

class AnimalAdapter(val items : ArrayList<String>, val context: Context):RecyclerView.Adapter<ItemAnimalCell>()  {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ItemAnimalCell {

        return ItemAnimalCell(LayoutInflater.from(context).inflate(R.layout.item_animal, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(cell: ItemAnimalCell, row: Int) {
        cell.tvAnimalType.text = items.get(row)
    }

}

class ItemAnimalCell (view: View) : RecyclerView.ViewHolder(view) {
    val tvAnimalType:TextView = view.tv_animal_type
}
