package kr.puze.donbada.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kr.puze.donbada.Data.CreditorItem
import kr.puze.donbada.R
import java.util.ArrayList

/**
 * Created by parktaejun on 2018. 1. 21..
 */
class DebtorFragment : Fragment() {
    var items: ArrayList<CreditorItem> = ArrayList()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_debtor, container, false)

        items.add(1, CreditorItem("2018.01.20 ", "생일 선물 및 기타 비용", "윤영채", "20000won")
                view.alarm_recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        view.alarm_recyclerView.adapter = adapter

        return view
    }

    companion object {
        fun newInstance(): DebtorFragment = DebtorFragment()
    }
}