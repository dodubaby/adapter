package com.example.adapter.item

import com.example.adapter.R
import com.example.adapter.databinding.ItemListBinding
import com.pacific.adapter.SimpleItem
import com.pacific.adapter.ViewHolder

class ListItem : SimpleItem() {
    override fun getLayout(): Int {
        return R.layout.item_list
    }

    override fun bind(holder: ViewHolder) {
        val binding: ItemListBinding = holder.binding()
    }
}
