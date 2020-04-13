package com.shekhar.demo.mergeadapterdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.MergeAdapter
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {

    var rowsArrayList: ArrayList<UserDataModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        populateData()
        initAdapter()
    }

    private fun populateData() {
        var i = 0
        while (i < 10) {
            val mobileNumber = 10000 + Random().nextInt(99999.toInt())
            rowsArrayList.add(UserDataModel("Person $i", "98786$mobileNumber"))
            i++
        }
    }

    private fun initAdapter() {
        val layoutManager = LinearLayoutManager(this)
        recyclerView?.layoutManager = layoutManager

        val mUserDataAdapter = UserDataAdapter(rowsArrayList)
        val mFooterAdapter = FooterAdapter()
        val mergeAdapter = MergeAdapter(mUserDataAdapter, mFooterAdapter)
        recyclerView?.adapter = mergeAdapter
    }
}
