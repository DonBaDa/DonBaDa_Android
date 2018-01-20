package kr.puze.donbada

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import kotlinx.android.synthetic.main.activity_main.*
import kr.puze.donbada.Adapter.TabLayoutAdapter
import kr.puze.donbada.Adapter.ViewPagerAdapter

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getSupportActionBar()!!.hide()

        val tabLayout: TabLayoutAdapter = TabLayoutAdapter(getSupportFragmentManager(), tab_layout.getTabCount())
        val viewPagerAdapter: ViewPagerAdapter = ViewPagerAdapter(supportFragmentManager)

        tab_layout.addTab(tab_layout.newTab().setText("어장").setTag("debtor"), 0)
        tab_layout.addTab(tab_layout.newTab().setText("미끼").setTag("creditor"), 0)
        tab_layout.setTabGravity(TabLayout.GRAVITY_FILL);

        main_viewPager.adapter = tabLayout
        main_viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tab_layout))

        main_viewPager.adapter = viewPagerAdapter
        main_viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            }

            override fun onPageSelected(pos: Int) {
            }

        })
    }
}
