package com.example.darsagioyin.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.darsagioyin.databinding.ItemRvBinding
import com.example.darsagioyin.models.Mytodo

class RvAdapter(var list: ArrayList<Mytodo>): RecyclerView.Adapter<RvAdapter.Vh>() {

    inner class Vh(val itemRvBinding: ItemRvBinding) : RecyclerView.ViewHolder(itemRvBinding.root) {

        fun onBind(mytodo: Mytodo) {
            itemRvBinding.edt1.text = mytodo.Ism
            itemRvBinding.edt2.text = mytodo.numberr.toString()

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }
}