package com.example.nikeapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.nikeapp.databinding.FragmentWishlistBinding

class WishlistFragment : Fragment() {

    private var _binding: FragmentWishlistBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentWishlistBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val wishlist = mutableListOf(
            ProductData("Air Jordan 1 Mid", "₩125,000", R.drawable.home_bg),
            ProductData("Nike Everyday Plus", "₩10,000", R.drawable.home_bg),
            ProductData("Nike Elite Crew", "₩16,000", R.drawable.home_bg),
            ProductData("Nike Air Force 1", "₩115,000", R.drawable.home_bg)
        )

        val adapter = ProductAdapter(wishlist)
        binding.wishlistRv.adapter = adapter
        binding.wishlistRv.layoutManager = GridLayoutManager(requireContext(), 2)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}