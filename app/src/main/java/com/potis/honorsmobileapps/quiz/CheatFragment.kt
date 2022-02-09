package com.potis.honorsmobileapps.quiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.potis.honorsmobileapps.quiz.databinding.FragmentCheatBinding

class CheatFragment : Fragment() {


private var _binding : FragmentCheatBinding? = null
private val binding get()= _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding= FragmentCheatBinding.inflate(inflater, container, false)
        val rootView = binding.root
        val args=CheatFragmentArgs.fromBundle(requireArguments())
        binding.button.setOnClickListener{
            binding.te.text=(args.answer.toString()).uppercase()

        }
        return rootView
    }
        override fun onDestroy(){
        super.onDestroy()
        _binding=null
    }

}