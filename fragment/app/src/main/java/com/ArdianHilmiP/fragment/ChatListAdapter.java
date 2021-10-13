package com.ArdianHilmiP.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.List;

public class ChatListAdapter extends RecyclerView.Adapter<ChatListAdapter.holder> {
    //Menambahkan properti ArrayList
    private List<Chatlist> list;
    private Context context;

    //Menambahkan adapter
    public ChatListAdapter(List<Chatlist> list, Context context) {
        this.list = list;
        this.context = context;
    }

    //Layout
    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_chat_list, parent, false);
        return new holder(view);
    }

    //Mengambil data dari setiap item
    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {

        Chatlist chatlist = list.get(position);
        holder.tvName.setText(chatlist.getUserName());
        holder.tvDesc.setText(chatlist.getDescription());
        holder.tvDate.setText(chatlist.getDate());

        Glide.with(context).load(chatlist.getUrlProfile()).into(holder.profile);
    }

    //Menentukan urutan item
    @Override
    public int getItemCount() {
        return list.size();
    }

    //Menambahkan property
    public class holder extends RecyclerView.ViewHolder {
        private TextView tvName, tvDesc, tvDate;
        private CircularImageView profile;

        //Membuat constructor class holder
        public holder(@NonNull View itemView) {
            super(itemView);

            tvDate = itemView.findViewById(R.id.tv_date);
            tvName = itemView.findViewById(R.id.tv_name);
            tvDesc = itemView.findViewById(R.id.tv_desc);
            profile = itemView.findViewById(R.id.image_profile);

        }
    }
}
