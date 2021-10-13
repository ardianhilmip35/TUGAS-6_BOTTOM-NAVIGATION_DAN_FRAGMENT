package com.ArdianHilmiP.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class CallsFragment extends Fragment {


    public CallsFragment() {
        // Required empty public constructor
    }

    private List<Callslist> lists = new ArrayList<>();
    private RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calls, container, false);

        recyclerView = view.findViewById(R.id.recyclerViews);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        getCallslist();
        return view;
    }
    private void getCallslist() {
        //Tampilan data telpon
        lists.add(new Callslist("11","Naruto Ketua RT 05","Kemarin 19.57","https://static.wikia.nocookie.net/naruto/images/d/dd/Naruto_Uzumaki%21%21.png/revision/latest?cb=20161013233552"));
        lists.add(new Callslist("22","Saitama Gym","(2) 11 Oktober 09.20","https://i0.wp.com/www.otakutale.com/wp-content/uploads/2015/03/One-Punch-Man-Anime-Twitter-Icon-Saitama.jpg?ssl=1"));
        lists.add(new Callslist("33","Saitama Gym","7 Oktober 17.01","https://i0.wp.com/www.otakutale.com/wp-content/uploads/2015/03/One-Punch-Man-Anime-Twitter-Icon-Saitama.jpg?ssl=1"));
        lists.add(new Callslist("44","Nobita Beban","4 Oktober 13.12","https://s.kaskus.id/r540x540/images/2017/10/20/9911998_20171020083800.jpg"));
        lists.add(new Callslist("55","Abang Draken","9 November 23.20","https://www.greenscene.co.id/wp-content/uploads/2021/06/Draken.jpg"));

        recyclerView.setAdapter(new CallsListAdapter(lists,getContext()));

    }
}