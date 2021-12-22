package com.potis.honorsmobileapps.quiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.potis.honorsmobileapps.quiz.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    data class Question(val ques:Int, val awn:Boolean)


    private var _binding : FragmentMainBinding? = null
    private val binding get()= _binding!!
    var inc=0
    val list=listOf(
        Question(R.string.question1, false),
        Question(R.string.question2, true),
        Question(R.string.question3, true),
        Question(R.string.question4, false),

        Question(R.string.question5, true)
    )
    override fun onSaveInstanceState(savedInstanceState:Bundle) {
        super.onSaveInstanceState(savedInstanceState)
        savedInstanceState.putInt(QUESTION,inc)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if(savedInstanceState!=null)
        inc=savedInstanceState.getInt(QUESTION)
        _binding= FragmentMainBinding.inflate(inflater, container, false)
        val rootView = binding.root
        update()
        binding.t.setOnClickListener{check(true)}
        binding.f.setOnClickListener{check(false)}
        binding.next.setOnClickListener{next()}
        return rootView
   }
    fun next(){
        if(inc<list.size-1)
            inc+=1
        else {
            inc=0
        }
        update()
    }
    fun update(){

        binding.quest.text=getString(list[inc].ques)
    }
    fun check(answer:Boolean){
        val realAwn=list[inc].awn
        if(realAwn.equals(answer))
            Toast.makeText(activity, R.string.correct, Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(activity, R.string.incorrect, Toast.LENGTH_SHORT).show()
    }
    override fun onDestroy(){
        super.onDestroy()
        _binding=null
    }
}