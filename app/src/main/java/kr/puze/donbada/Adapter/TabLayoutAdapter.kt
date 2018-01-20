package kr.puze.donbada.Adapter

import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import kr.puze.donbada.Fragment.CreditorFragment
import kr.puze.donbada.Fragment.DebtorFragment


/**
 * Created by parktaejun on 2018. 1. 21..
 */
class TabLayoutAdapter(fm: FragmentManager, private val tabCount: Int) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? {
        when (position) {
            0 -> {
                return CreditorFragment()
            }
            1 -> {
                return DebtorFragment()
            }
            else -> return null
        }
    }

    override fun getCount(): Int {
        return 0
    }
}