package com.example.whatsappclone.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsappclone.R
import com.example.whatsappclone.databinding.FragmentChatsBinding
import com.example.whatsappclone.model.ChatList
import com.example.whatsappclone.ui.adapter.ChatListAdapter


class ChatsFragment : Fragment() {
    private lateinit var binding: FragmentChatsBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChatsBinding.inflate(layoutInflater, container, false)
        // Inflate the layout for this fragment
        var list = ArrayList<ChatList>()
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val adapter = ChatListAdapter(requireContext(), list)
        binding.recyclerView.adapter = adapter

        val user1 = ChatList(
            "11",
            "Murad",
            "helloF",
            "04/09/2023",
            "https://th.bing.com/th/id/R.6b5c8943ef1fd5a2a34bbbd23f8967b2?rik=C8Gx6rz2WgU%2fdQ&riu=http%3a%2f%2fimages5.fanpop.com%2fimage%2fphotos%2f27400000%2fJake-Gyllenhaal-jake-gyllenhaal-27438439-1200-1800.jpg&ehk=2hwFmpDLVXjc9Np0olaM7UjCsZmWcjRT5diFlA7E10k%3d&risl=&pid=ImgRaw&r=0"
        )
        val user2 = ChatList(
            "22",
            "Namiq",
            "Hi",
            "03/02/2023",
            "https://th.bing.com/th/id/R.8112410131653a63c0596a57ebc85519?rik=TrmOhl0eZJU0Nw&riu=http%3a%2f%2f1.bp.blogspot.com%2f-rL0UdLNivjY%2fUhvtGHddwUI%2fAAAAAAAAAy8%2fGPJ0ojd6G2w%2fs1600%2fpromotional-photoshoot-tyler-durden.jpg&ehk=t9CBGtalAmIr39aULbo2gDn5oZRATnhUic1bKpqCtto%3d&risl=&pid=ImgRaw&r=0"
        )
        list.add(user1)
        list.add(user2)
        getChatList()
        return binding.root
    }


    fun getChatList() {

    }

}