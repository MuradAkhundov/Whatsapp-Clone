package com.example.whatsappclone.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.whatsappclone.databinding.LayoutChatListBinding
import com.example.whatsappclone.model.ChatList

class ChatListAdapter(val mContext : Context ,val chatList : List<ChatList> ) : RecyclerView.Adapter<ChatListAdapter.CardDesignHolder>() {


    inner class CardDesignHolder(val binding : LayoutChatListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        var binding = LayoutChatListBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardDesignHolder(binding)
    }

    override fun getItemCount(): Int {
        return chatList.size
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val b = holder.binding
        val chat = chatList.get(position)

        b.userNameText.text = chat.userName
        b.dateText.text = chat.date
        b.descriptionText.text = chat.description

        Glide.with(mContext).load(chat.urlProfile).into(b.roundedImage)
    }
}