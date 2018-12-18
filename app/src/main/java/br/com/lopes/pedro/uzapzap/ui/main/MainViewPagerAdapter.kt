package br.com.lopes.pedro.uzapzap.ui.main

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import br.com.lopes.pedro.uzapzap.ui.base.BaseFragment

class MainViewPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    private val myFragments = ArrayList<BaseFragment>()

    override fun getItem(position: Int): Fragment {
        return myFragments[position]
    }


    override fun getCount(): Int {
        return myFragments.count()
    }

    fun addFragment(fragment: BaseFragment){
        myFragments.add(fragment)
    }
}