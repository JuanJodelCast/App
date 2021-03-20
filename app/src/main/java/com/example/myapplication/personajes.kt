package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_personajes.*


/**
 * A simple [Fragment] subclass.
 * Use the [personajes.newInstance] factory method to
 * create an instance of this fragment.
 */
class personajes : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_personajes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        plista.apply{
            layoutManager = LinearLayoutManager(activity)
            adapter = adaptador(creacionD())
        }
    }

    fun creacionD(): ArrayList<character>{

        val persos = ArrayList<character>()

        persos.add(character("Darth Vader", "Sith","Tatooine"))

        persos.add(character("Obi-Wan Kenobi", "Jedi","Stewjon"))

        persos.add(character("Darth Sidius", "Sith","Naboo"))

        persos.add(character("Boba Fett", "Caza Recompenzas","Kamino(clonado)"))

        persos.add(character("Yoda", "Jedi","Uknown"))

        persos.add(character("Rd2", "Astro-Mechanics","Naboo(Fabricado)"))

        persos.add(character("C3-PO", "Android","Tatooine (Fabricado)"))

        persos.add(character("Darth Maul", "Sith","Dathomir"))

        persos.add(character("Anakin Skywalker", "Jedi/Sith","Tatooine"))

        persos.add(character("Mace Windu", "Jedi","Haruun Kal"))

        persos.add(character("Leia Organa", "Senator/General","Polis Massa"))

        persos.add(character("Luke Skywalker", "Jedi","Polis Massa"))

        persos.add(character("Padme Amidala", "Senator/Gobernator","Naboo"))

        persos.add(character("Din Djarin", "Caza Recompenzas","Unknown"))


        return persos
    }
}