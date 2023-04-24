package com.example.whatsappclone.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.whatsappclone.R
import com.example.whatsappclone.databinding.FragmentCallBinding
import com.example.whatsappclone.model.CallList
import com.example.whatsappclone.ui.adapter.CallListAdapter


class CallFragment : Fragment() {
private lateinit var binding : FragmentCallBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentCallBinding.inflate(layoutInflater,container,false)

        val list = ArrayList<CallList>()

        val adapter = CallListAdapter(requireContext(),list)
        binding.recyclerCall.adapter = adapter



        val p1 = CallList("Murad","4124","04/09/2023 ; 2:20pm" ,"https://th.bing.com/th/id/R.6b5c8943ef1fd5a2a34bbbd23f8967b2?rik=C8Gx6rz2WgU%2fdQ&riu=http%3a%2f%2fimages5.fanpop.com%2fimage%2fphotos%2f27400000%2fJake-Gyllenhaal-jake-gyllenhaal-27438439-1200-1800.jpg&ehk=2hwFmpDLVXjc9Np0olaM7UjCsZmWcjRT5diFlA7E10k%3d&risl=&pid=ImgRaw&r=0" , "missed")
        val p2 = CallList("Murad","4124","04/09/2023 ; 4:20pm" ,"https://th.bing.com/th/id/R.6b5c8943ef1fd5a2a34bbbd23f8967b2?rik=C8Gx6rz2WgU%2fdQ&riu=http%3a%2f%2fimages5.fanpop.com%2fimage%2fphotos%2f27400000%2fJake-Gyllenhaal-jake-gyllenhaal-27438439-1200-1800.jpg&ehk=2hwFmpDLVXjc9Np0olaM7UjCsZmWcjRT5diFlA7E10k%3d&risl=&pid=ImgRaw&r=0" , "missed")
        val p3 = CallList("Murad","4124","04/09/2023 ; 5:20pm" ,"https://th.bing.com/th/id/R.6b5c8943ef1fd5a2a34bbbd23f8967b2?rik=C8Gx6rz2WgU%2fdQ&riu=http%3a%2f%2fimages5.fanpop.com%2fimage%2fphotos%2f27400000%2fJake-Gyllenhaal-jake-gyllenhaal-27438439-1200-1800.jpg&ehk=2hwFmpDLVXjc9Np0olaM7UjCsZmWcjRT5diFlA7E10k%3d&risl=&pid=ImgRaw&r=0" , "income")
        list.add(p1)
        list.add(p2)
        list.add(p3)
        //https://th.bing.com/th/id/R.6b5c8943ef1fd5a2a34bbbd23f8967b2?rik=C8Gx6rz2WgU%2fdQ&riu=http%3a%2f%2fimages5.fanpop.com%2fimage%2fphotos%2f27400000%2fJake-Gyllenhaal-jake-gyllenhaal-27438439-1200-1800.jpg&ehk=2hwFmpDLVXjc9Np0olaM7UjCsZmWcjRT5diFlA7E10k%3d&risl=&pid=ImgRaw&r=0


        return binding.root
    }


}