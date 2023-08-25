package com.example.listadecompras

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.listadecompras.databinding.FragmentSupermarketListBinding

class SupermarketListFragment : Fragment() {
    private lateinit var binding: FragmentSupermarketListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentSupermarketListBinding.inflate(inflater, container, false).also {
            binding = it
        }.root
    }
}