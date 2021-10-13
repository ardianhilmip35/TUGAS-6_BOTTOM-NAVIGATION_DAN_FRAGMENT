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

//Menambahkan properti ArrayList
public class CallsListAdapter extends RecyclerView.Adapter<CallsListAdapter.holder>{
    private List<Callslist> lists;
    private Context context;

    //Menambahkan adapter
    public CallsListAdapter(List<Callslist> lists, Context context) {
        this.lists = lists;
        this.context = context;
    }

    //Layout
    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_calls_list, parent, false);
        return new CallsListAdapter.holder(view);
    }


    //Mengambil data dari setiap item  @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        Callslist callslist = lists.get(position);
        holder.tvNames.setText(callslist.getUserNames());
        holder.tvDates.setText(callslist.getDates());

        Glide.with(context).load(callslist.getUrlProfiles()).into(holder.profiles);

    }

    //Menentukan urutan item
    @Override
    public int getItemCount() {
        return lists.size();
    }

    //Menambahkan property
    public class holder extends RecyclerView.ViewHolder {
        private TextView tvNames, tvDates;
        private CircularImageView profiles;

        //Membuat constructor class holder
        public holder(@NonNull View itemView) {
            super(itemView);
            tvNames = itemView.findViewById(R.id.tv_names);
            tvDates = itemView.findViewById(R.id.tv_dates);
            profiles = itemView.findViewById(R.id.image_profiles);

        }
    }
}
