package com.example.adv160418002week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation



class GameFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_game, container, false)


    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnBack = view.findViewById<Button>(R.id.btnBack)
        if(arguments != null){
            val playerName = GameFragmentArgs.fromBundle(requireArguments()).playerName
            .text =  "$playerName's Turn"

//            val  number = 1..50
//            val randNum1 = number.random()
//            val randNum2 = number.random()
//            val result = randNum1 + randNum2
//            val point = 0
//            txtNum1.text = randNum1.toString()
//            txtNum2.text = randNum2.toString()
//            if(playerAnswer.toString() != result.toString()){
//                val btnAnswer = view.findViewById<Button>(R.id.btnSubmit)
//                btnAnswer.setOnClickListener{
//                    //playerName = txtTurn.text.toString()
//                    val action = MainFragmentDirections.actionGameFragment(playerName)
//                    Navigation.findNavController(it).navigate(action)
//                }
//            }
//            else {
//                point + 1
//            }
        }

        btnBack.setOnClickListener {
            val action = GameFragmentDirections.actionMainFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }


}