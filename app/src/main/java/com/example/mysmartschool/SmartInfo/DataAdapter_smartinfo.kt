package com.example.mysmartschooll

import android.app.assist.AssistContent
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.mysmartschool.R
import java.util.ArrayList

class DataAdapter_smartinfo(private val contex: Context, private val data: ArrayList<Entity_smartinfo>) :
    RecyclerView.Adapter<DataAdapter_smartinfo.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nameViewPengirimSmartinfo: TextView = itemView.findViewById(R.id.tv_pengirim)
        private val nameViewTanggalSmartinfo: TextView = itemView.findViewById(R.id.tv_tanggal)
        private val nameViewJudulSmartinfo: TextView = itemView.findViewById(R.id.tv_judul)
        private val nameViewAboutSmartinfo: TextView = itemView.findViewById(R.id.tv_about)

        fun bindItem(data: Entity_smartinfo) {
//            imageViewMyteacher.text = data.box
            nameViewPengirimSmartinfo.text = data.pengirim
            nameViewTanggalSmartinfo.text = data.date
            nameViewJudulSmartinfo.text = data.judul
            nameViewAboutSmartinfo.text = data.about
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return DataAdapter_smartinfo.ViewHolder(
            LayoutInflater.from(contex).inflate(
                R.layout.recycler_item_smart_info,
                parent,
                false
            )
        )
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bindItem(data[position])
//        holder.itemView.setOnClickListener {
//            contex.toast(data[position].pengirim + "Clicked!")
//
//        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

}

