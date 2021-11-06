package org.techtown.fragment_20211106.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_firt.*
import org.techtown.fragment_20211106.R

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_firt,container,false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btnLog.setOnClickListener {
            Log.d("첫번째프래그먼트","테스트로그")

        }

        btnToast.setOnClickListener {

            Toast.makeText(requireContext(), "토스트띄우기", Toast.LENGTH_SHORT).show()

        }

    }



}