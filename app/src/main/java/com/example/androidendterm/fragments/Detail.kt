package com.example.androidendterm.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.androidendterm.R
import com.example.androidendterm.repository.Repository
import com.example.androidendterm.viewmodel.MyViewModel
import com.example.androidendterm.viewmodel.MyViewModelFactory
import kotlinx.android.synthetic.main.fragment_detail.view.*

class Detail : Fragment() {

    private lateinit var viewModel: MyViewModel

 override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_detail, container, false)

        val repository = Repository()
        val viewModelFactory = MyViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MyViewModel::class.java)
        viewModel.getPostbyId(2)



        view.comment_btn.setOnClickListener{
            findNavController().navigate(R.id.action_detail_to_comment)
        }
        return view
    }

}