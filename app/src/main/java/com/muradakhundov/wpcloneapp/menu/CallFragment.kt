package com.muradakhundov.wpcloneapp.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.muradakhundov.wpcloneapp.adapter.CallListAdapter
import com.muradakhundov.wpcloneapp.databinding.FragmentCallBinding
import com.muradakhundov.wpcloneapp.model.CallList

class CallFragment : Fragment() {

    private lateinit var binding: FragmentCallBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentCallBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val list = listOf(
            CallList(
                "11",
                "Ryan",
                "22/14/2023",
                "https://fiverr-res.cloudinary.com/images/t_main1,q_auto,f_auto,q_auto,f_auto/gigs2/292600815/original/46fe8a85183ee3d1d7965c4fad9042ec83bb0875/transform-your-image-into-stunning-ai-generated-masterpiece.png",
                "missed"
            ),
            CallList(
                "11",
                "Ryan",
                "22/14/2023",
                "https://fiverr-res.cloudinary.com/images/t_main1,q_auto,f_auto,q_auto,f_auto/gigs2/292600815/original/46fe8a85183ee3d1d7965c4fad9042ec83bb0875/transform-your-image-into-stunning-ai-generated-masterpiece.png",
                "in"
            ),
            CallList(
                "11",
                "Ryan",
                "22/14/2023",
                "https://fiverr-res.cloudinary.com/images/t_main1,q_auto,f_auto,q_auto,f_auto/gigs2/292600815/original/46fe8a85183ee3d1d7965c4fad9042ec83bb0875/transform-your-image-into-stunning-ai-generated-masterpiece.png",
                "income"
            )
        )

        val adapter = CallListAdapter(list,requireContext())
        binding.recyclerCalls.adapter = adapter
    }

}