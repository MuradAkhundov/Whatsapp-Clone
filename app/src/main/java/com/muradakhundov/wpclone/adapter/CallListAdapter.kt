package com.muradakhundov.wpclone.adapter

import android.content.Context
import android.content.res.ColorStateList
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.bumptech.glide.Glide
import com.muradakhundov.wpclone.R
import com.muradakhundov.wpclone.databinding.LayoutCallListBinding
import com.muradakhundov.wpclone.databinding.LayoutChatListBinding
import com.muradakhundov.wpclone.model.CallList
import com.muradakhundov.wpclone.model.ChatList

class CallListAdapter() : Adapter<CallListAdapter.ChatDesignHolder>() {
    private lateinit var list : List<CallList>
    private lateinit var context : Context

    constructor( list : List<CallList> , context : Context) : this() {
        this.list = list
        this.context = context
    }


    inner class ChatDesignHolder(val binding : LayoutCallListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatDesignHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = LayoutCallListBinding.inflate(inflater, parent, false)
        return ChatDesignHolder(binding)
    }


    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ChatDesignHolder, position: Int) {
        val b = holder.binding
        val listItem = list[position]

        b.username.text = listItem.userName
        b.date.text = listItem.date

        Glide.with(context).load(listItem.urlProfile).into(b.profile)

        if (listItem.callType == "missed"){
            b.imgArrow.rotation = 180f
            val tintColor = ContextCompat.getColor(context, R.color.red)
            ViewCompat.setBackgroundTintList(b.imgArrow, ColorStateList.valueOf(tintColor))
        }
        else if (listItem.callType == "income"){
            b.imgArrow.rotation = 0f
            val tintColor = ContextCompat.getColor(context, R.color.green)
            ViewCompat.setBackgroundTintList(b.imgArrow, ColorStateList.valueOf(tintColor))
        }
        else{
            b.imgArrow.rotation = 0f
            val tintColor = ContextCompat.getColor(context, R.color.green)
            ViewCompat.setBackgroundTintList(b.imgArrow, ColorStateList.valueOf(tintColor))
        }



    }
}