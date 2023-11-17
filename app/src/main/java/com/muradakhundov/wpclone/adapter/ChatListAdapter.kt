package com.muradakhundov.wpclone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintSet
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.bumptech.glide.Glide
import com.muradakhundov.wpclone.databinding.LayoutChatListBinding
import com.muradakhundov.wpclone.model.ChatList

class ChatListAdapter() : Adapter<ChatListAdapter.ChatDesignHolder>() {
    private lateinit var list : List<ChatList>
    private lateinit var context : Context

    constructor( list : List<ChatList> , context : Context) : this() {
        this.list = list
        this.context = context
    }


    inner class ChatDesignHolder(val binding : LayoutChatListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatDesignHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = LayoutChatListBinding.inflate(inflater, parent, false)
        return ChatDesignHolder(binding)
    }


    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ChatDesignHolder, position: Int) {
        val b = holder.binding
        val listItem = list[position]

        b.username.text = listItem.userName
        b.description.text = listItem.description
        b.date.text = listItem.date

        Glide.with(context).load(listItem.urlProfile).into(b.profile)

        val layoutParams = b.constrainLayUsername.layoutParams
        layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT
        b.constrainLayUsername.layoutParams = layoutParams
    }
}