package com.example.mywork;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;

public class Myadapter extends RecyclerView.Adapter<Myadapter.Myholder> {
    Context context1;
    List<String> list1;
    public Myadapter(Context context, List<String> list) {
        context1 = context;
        list1 = list;
    }

    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);

        Myholder myholder = new Myholder(view);
        return myholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Myholder holder, int position) {
        String text = list1.get(position);
        holder.textView.setText(text);
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("text",text);
                Intent intent = new Intent(context1, Detail_ui.class);
                intent.putExtras(bundle);
                context1.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list1.size();
    }
    public class Myholder extends RecyclerView.ViewHolder{
        TextView textView;
        public Myholder(@NonNull View itemView){
            super(itemView);
            textView=itemView.findViewById(R.id.textView3);
        }
    }
}
