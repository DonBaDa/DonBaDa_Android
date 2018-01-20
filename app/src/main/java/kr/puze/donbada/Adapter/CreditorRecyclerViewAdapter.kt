package kr.puze.donbada.Adapter

import kr.puze.donbada.Data.CreditorItem

/**
 * Created by parktaejun on 2018. 1. 21..
 */

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_main.view.*
import kr.puze.donbada.R

class CreditorRecyclerViewAdapter(var items: ArrayList<CreditorItem>, var context: Context) : RecyclerView.Adapter<CreditorRecyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_main, null)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.bind(items.get(position))
        holder?.itemView?.setOnClickListener {
            itemClick?.onItemClick(holder.itemView, position)
        }
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: CreditorItem) {
            itemView.date.text = item.date
            itemView.title.text = item.title
            itemView.name.text = item.name
            itemView.amount.text = item.amount + "WON"
            itemView.position.text = "채무자"
        }
    }

    var itemClick: ItemClick? = null

    interface ItemClick {
        fun onItemClick(view: View?, position: Int)
    }
}