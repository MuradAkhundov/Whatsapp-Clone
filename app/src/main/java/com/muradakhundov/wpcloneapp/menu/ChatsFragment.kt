package com.muradakhundov.wpcloneapp.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.muradakhundov.wpcloneapp.adapter.ChatListAdapter
import com.muradakhundov.wpcloneapp.databinding.FragmentChatsBinding
import com.muradakhundov.wpcloneapp.model.ChatList

class ChatsFragment : Fragment() {

    private lateinit var binding: FragmentChatsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentChatsBinding.inflate(inflater, container, false)


        val list = listOf(
            ChatList(
                "12",
                "John",
                "running..",
                "19.31.2016",
                "https://t3.gstatic.com/licensed-image?q=tbn:ANd9GcQ0suktJEBOYsgOoqYzT-aO4ZmHdxrxVkiyXSmiPmazPwoaHJQtL1sX-sXcPdMldK_m"
            ),
            ChatList(
                "12",
                "Ryan",
                "listening",
                "19.15.2022",
                "https://statusneo.com/wp-content/uploads/2023/02/MicrosoftTeams-image551ad57e01403f080a9df51975ac40b6efba82553c323a742b42b1c71c1e45f1.jpg"
            ),
            ChatList(
                "12",
                "Bruce",
                "sleeping",
                "11.11.2011",
                "https://fiverr-res.cloudinary.com/images/t_main1,q_auto,f_auto,q_auto,f_auto/gigs2/292600815/original/46fe8a85183ee3d1d7965c4fad9042ec83bb0875/transform-your-image-into-stunning-ai-generated-masterpiece.png"
            ),
            ChatList(
                "12", "Lia", "online", "19.04.2019",
                "https://img.freepik.com/premium-photo/small-boy-wearing-suit-tie_862489-1933.jpg"
            ),
            ChatList(
                "12",
                "Samuel",
                "offline",
                "19.05.2023",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRImjSZ7aQunfrcJS1ssamjWIQGLyAWjRF4YFStuQRS245y19CAEt-IGhUOuCYCEOy-2Vg&usqp=CAU"
            )
        )

        val adapter = ChatListAdapter(list, requireContext())
        binding.recyclerChats.adapter = adapter


        return binding.root
    }

}
