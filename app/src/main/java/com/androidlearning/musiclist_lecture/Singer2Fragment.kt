package com.androidlearning.musiclist_lecture

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Singer2Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment랑
        val items = mutableListOf<String>()
        items.add("이제 나만 믿어요")
        items.add("보라빛 엽서")
        items.add("어느날 문득")
        items.add("미운 사랑")
        items.add("이제 나만 믿어요")
        items.add("보라빛 엽서")
        items.add("어느날 문득")
        items.add("미운 사랑")
        items.add("이제 나만 믿어요")
        items.add("보라빛 엽서")
        items.add("어느날 문득")
        items.add("미운 사랑")
        items.add("이제 나만 믿어요")
        items.add("보라빛 엽서")
        items.add("어느날 문득")
        items.add("미운 사랑")

        val view = inflater.inflate(R.layout.fragment_singer2, container, false)
        val rv = view.findViewById<RecyclerView>(R.id.singRV)
        val rvAdapter = RVAdapter(items)
        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)

        val image1 = view.findViewById<ImageView>(R.id.image1)
        image1.setOnClickListener {
            it.findNavController().navigate(R.id.action_singer2Fragment_to_singer1Fragment)
        }
        val image3 = view.findViewById<ImageView>(R.id.image3)
        image3.setOnClickListener {
            it.findNavController().navigate(R.id.action_singer2Fragment_to_singer3Fragment)
        }
        return view
    }
}