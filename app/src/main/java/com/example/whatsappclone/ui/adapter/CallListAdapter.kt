package com.example.whatsappclone.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.whatsappclone.R
import com.example.whatsappclone.databinding.LayoutCallListBinding
import com.example.whatsappclone.databinding.LayoutChatListBinding
import com.example.whatsappclone.model.CallList
import com.example.whatsappclone.model.ChatList

class CallListAdapter(val mContext : Context, val callList : List<CallList> ) : RecyclerView.Adapter<CallListAdapter.CardDesignHolder>() {


    inner class CardDesignHolder(val binding : LayoutCallListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        var binding = LayoutCallListBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardDesignHolder(binding)
    }

    override fun getItemCount(): Int {
        return callList.size
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val b = holder.binding
        val call = callList.get(position)

        b.userNameText.text = call.userName
        b.dateText.text = call.date


        if (call.callType == "missed"){
            b.arrow.setImageDrawable(mContext.getDrawable(R.drawable.arrow_down))
//            b.arrow.drawable.setTint(ContextCompat.getColor(mContext, R.color.red))
        }
        else if (call.callType == "income"){
            b.arrow.setImageDrawable(mContext.getDrawable(R.drawable.arrow_down))
//            b.arrow.drawable.setTint(ContextCompat.getColor(mContext, R.color.primary))

        }
        else{
            b.arrow.setImageDrawable(mContext.getDrawable(R.drawable.arrow_up))
//            b.arrow.drawable.setTint(ContextCompat.getColor(mContext, R.color.primary))


        }


        Glide.with(mContext).load(call.urlProfile).into(b.roundedImage)
    }
}