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


public class ChatsFragment extends Fragment {

    public ChatsFragment() {
        // Required empty public constructor
    }

    private List<Chatlist> list = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chats, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        getChatlist();
        return view;
    }

    private void getChatlist() {
        //Tampilan chat dari Naruto
        list.add(new Chatlist("11","Naruto Ketua RT 05","Bro, push mobile legend nanti malem yak","10/10/2021","https://static.wikia.nocookie.net/naruto/images/d/dd/Naruto_Uzumaki%21%21.png/revision/latest?cb=20161013233552"));

        //Tampilan chat dari Hinata
        list.add(new Chatlist("22","Hinata Voli","Jangan lupa bang nanti malam ada voli tingkat RT!!!","08/10/2021","https://cdn0-production-images-kly.akamaized.net/rR0-CT36rxKUQsMmPmyTPn-3cXY=/640x640/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/product_images/3541/original/005050800_1605786470-c4292ea2d8ccd57b817a53452800152a.jpg"));

        //Tampilan chat dari Saitama
        list.add(new Chatlist("33","Saitama Gym","Tempat cukur rambut daerah jember yang bagus dimana ya bro?","11/10/2021","https://i0.wp.com/www.otakutale.com/wp-content/uploads/2015/03/One-Punch-Man-Anime-Twitter-Icon-Saitama.jpg?ssl=1"));

        //Tampilan chat dari Draken
        list.add(new Chatlist("44","Abang Draken","Gak keliatan mikey?","Kemarin","https://www.greenscene.co.id/wp-content/uploads/2021/06/Draken.jpg"));

        //Tampilan chat dari Nobita
        list.add(new Chatlist("55","Nobita Beban","Eh, semalem shizuka kerumahku lo","12/10/2021","https://s.kaskus.id/r540x540/images/2017/10/20/9911998_20171020083800.jpg"));


        recyclerView.setAdapter(new ChatListAdapter(list,getContext()));
    }
}