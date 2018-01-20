package kr.puze.donbada.Fragment

import android.app.AlertDialog
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_debtor.view.*
import kr.puze.donbada.Adapter.DebtorRecyclerViewAdapter
import kr.puze.donbada.Data.DebtorItem
import kr.puze.donbada.R
import org.jetbrains.anko.support.v4.startActivity
import java.util.ArrayList

/**
 * Created by parktaejun on 2018. 1. 21..
 */
class DebtorFragment : Fragment() {
    var items: ArrayList<DebtorItem> = ArrayList()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_debtor, container, false)
        val adapter = DebtorRecyclerViewAdapter(items, context)

        items.add(DebtorItem("2018.01.20 ", "생일 선물 및 기타 비용", "윤영채", "20000"))
        view.debtor_recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        view.debtor_recyclerView.adapter = adapter
        adapter.itemClick = object : DebtorRecyclerViewAdapter.ItemClick {
            override fun onItemClick(view: View?, position: Int) {
            }
        }
        return view
    }

    companion object {
        fun newInstance(): DebtorFragment = DebtorFragment()
    }
}