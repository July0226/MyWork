package com.example.mywork;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.app.AppCompatActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class Fragment1 extends Fragment {
    List<String> name_list = new ArrayList<>();
    RecyclerView recycleView;
    Myadapter adapter;

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.tab1,container,false);
        recycleView = view.findViewById(R.id.RecyclerView);
        initdata();
        adapter = new Myadapter(this.getActivity(),name_list);

        LinearLayoutManager manager = new LinearLayoutManager(this.getActivity());
        manager.setOrientation(RecyclerView.VERTICAL);
        recycleView.setLayoutManager(manager);
        recycleView.addItemDecoration(new DividerItemDecoration(this.requireActivity(),DividerItemDecoration.VERTICAL));
        recycleView.setHasFixedSize(true);
        recycleView.setAdapter(adapter);

        return view;
    }

    private void initdata() {
        name_list.add("我是苹果");
        name_list.add("我是柠檬");
        name_list.add("我是伏特加");
        name_list.add("我是瓜子");
        name_list.add("我是汉堡");
        name_list.add("我是胡萝卜");
        name_list.add("我是螃蟹");
        name_list.add("我是薯条");
        name_list.add("我是桃子");
        name_list.add("我是鲜鱼");
    }
}
