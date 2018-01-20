package kr.puze.donbada.Adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import kr.puze.donbada.Fragment.CreditorFragment
import kr.puze.donbada.Fragment.DebtorFragment

/**
 * Created by parktaejun on 2018. 1. 21..
 */
class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> CreditorFragment.newInstance()
            1 -> DebtorFragment.newInstance()
            else -> CreditorFragment.newInstance()
        }
    }
    override fun getCount(): Int = 2
}