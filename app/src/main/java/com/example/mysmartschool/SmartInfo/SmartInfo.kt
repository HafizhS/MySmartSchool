package com.example.mysmartschooll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mysmartschool.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_smart_info.*

class SmartInfo : Fragment() {

    private lateinit var recyclerView: RecyclerView

    private var listItem_smartinfo: ArrayList<Entity_smartinfo>? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_smart_info, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        signFun()
        getAllUser()
        showRecyleView()
        super.onViewCreated(view, savedInstanceState)
    }

    private fun signFun() {
        recyclerView = rv_info
        listItem_smartinfo = ArrayList()
    }

    private fun getAllUser() {
        listItem_smartinfo?.add(Entity_smartinfo("sad", "20-02-2019", "WeB", "web tutor"))
        listItem_smartinfo?.add(Entity_smartinfo("das", "20-08-2020", "apk", "apk tutor"))
        listItem_smartinfo?.add(Entity_smartinfo("asd", "21-08-109", "android", "android tutor"))
        listItem_smartinfo?.add(Entity_smartinfo("qwe", "08-90-2019", "ios", "ios tutor"))
        listItem_smartinfo?.add(Entity_smartinfo("eqwe", "12-10-2019", "netbeans", "netbeans tutor"))
        listItem_smartinfo?.add(Entity_smartinfo("weq", "01-10-2019", "project", "project tutor"))
    }

    private fun showRecyleView() {
        recyclerView.layoutManager = LinearLayoutManager(this.context)
        recyclerView.adapter = DataAdapter_smartinfo(this.context!!, listItem_smartinfo!!)
    }
}
