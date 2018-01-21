package kr.puze.donbada.Fragment

import android.app.AlertDialog
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_debtor.view.*
import kr.puze.donbada.Adapter.DebtorRecyclerViewAdapter
import kr.puze.donbada.Data.DebtorItem
import kr.puze.donbada.R
import java.util.ArrayList

/**
 * Created by parktaejun on 2018. 1. 21..
 */
class DebtorFragment : Fragment() {
    var items: ArrayList<DebtorItem> = ArrayList()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_debtor, container, false)
        val adapter = DebtorRecyclerViewAdapter(items, this!!.context!!)

        items.add(DebtorItem("2018.01.21 ", "유니세프 후원", "윤영채", "3000"))
        view.debtor_recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        view.debtor_recyclerView.adapter = adapter
        adapter.itemClick = object : DebtorRecyclerViewAdapter.ItemClick {
            override fun onItemClick(view: View?, position: Int) {
                val dialog = AlertDialog.Builder(context)
                dialog.setTitle("바다")
                dialog.setMessage("미끼를 물겠습니다")
                dialog.setPositiveButton("Ok") { dialog, which ->
                    Toast.makeText(context, "미끼를 덥석 물었습니다", Toast.LENGTH_LONG).show()
                    items.removeAt(position)
                }
                dialog.setNegativeButton("Cancel") { dialog, which -> dialog.cancel() }
                dialog.show()
            }
        }
        return view
    }

    companion object {
        fun newInstance(): DebtorFragment = DebtorFragment()
    }
}