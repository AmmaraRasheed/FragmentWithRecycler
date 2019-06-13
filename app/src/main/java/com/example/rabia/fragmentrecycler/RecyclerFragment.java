package com.example.rabia.fragmentrecycler;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerFragment extends Fragment {


    public RecyclerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_recycler, container, false);
        ArrayList<String> animalArray=new ArrayList<>();
        animalArray.add("Dog");
        animalArray.add("Hourse");
        animalArray.add("Camel");
        animalArray.add("Cat");
        animalArray.add("Hen");
        animalArray.add("Rabit");
        RecyclerView recyclerView= view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerAdapter recyclerAdapter=new RecyclerAdapter(getActivity(),animalArray);
        recyclerView.setAdapter(recyclerAdapter);
        return view;
    }

}
