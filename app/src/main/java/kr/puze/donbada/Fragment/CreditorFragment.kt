package kr.puze.donbada.Fragment

/**
 * Created by parktaejun on 2018. 1. 21..
 */

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_creditor.view.*
import kr.puze.donbada.Adapter.CreditorRecyclerViewAdapter
import kr.puze.donbada.Data.CreditorItem
import kr.puze.donbada.CreditorDetailActivity
import kr.puze.donbada.R
import org.jetbrains.anko.support.v4.startActivity
import java.util.*

class CreditorFragment : Fragment() {
    var items: ArrayList<CreditorItem> = ArrayList()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_creditor, container, false)
        val adapter = CreditorRecyclerViewAdapter(items, this!!.context!!)

        items.add(CreditorItem("2018.01.20 ", "생일 선물 및 기타 비용", "윤영채", "20000"))
        view.creditor_recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        view.creditor_recyclerView.adapter = adapter
        adapter.itemClick = object : CreditorRecyclerViewAdapter.ItemClick {
            override fun onItemClick(view: View?, position: Int) {
                startActivity<CreditorDetailActivity>()
            }
        }
        return view
    }

    companion object {
        fun newInstance(): CreditorFragment = CreditorFragment()
    }
}