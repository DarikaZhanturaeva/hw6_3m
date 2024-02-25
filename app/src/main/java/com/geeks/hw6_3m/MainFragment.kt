package com.geeks.hw6_3m

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geeks.hw6_3m.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding:FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = BookAdapter(
            arrayListOf(
                Book("Ann Patchett","Tom Lake","https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1691084837i/63241104.jpg"),
                Book("Hello Beautiful","Ann Napolitano","https://pictures.abebooks.com/isbn/9780593682937-us.jpg"),
                Book("Yellowface","R.F.Kuang","https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1671336608l/62047984.jpg"),
                Book("My Name Is Barbra","Barbra Streisand","https://m.media-amazon.com/images/I/71musw9bJWL._AC_UF1000,1000_QL80_.jpg"),
                Book("Вэйджер","Дэвид Гранн","https://www.rulit.me/data/programs/images/vejdzher-istoriya-o-korablekrushenii-myatezhe-i-ubijstve-the_835613.jpg"),
            )
        )
        binding.rvBooks.adapter = adapter
    }
}