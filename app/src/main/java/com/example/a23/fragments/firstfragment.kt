package com.example.a23.fragments

import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.a23.R

class firstfragment: Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val sendBotton = view.findViewById<Button>(R.id.button1)
        val amountEditText = view.findViewById<EditText>(R.id.text1)
        val controller = Navigation.findNavController(view)




        sendBotton.setOnClickListener {
            val amountText = amountEditText.text.toString()
            if(amountText.isEmpty()){
                return@setOnClickListener
            }
            val amount = amountText.toInt()
            val action = firstfragmentDirections.actionFirstfragmentToSecondfragment(amount)

            controller.navigate(action)


        }
    }
}