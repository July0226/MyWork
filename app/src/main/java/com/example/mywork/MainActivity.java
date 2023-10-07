package com.example.mywork;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.View;
import android.widget.LinearLayout;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Fragment fragment1,fragment2,fragment3,fragment4;
    FragmentManager fm;
    LinearLayout linearLayout1,linearLayout2,linearLayout3,linearLayout4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1 = new BlankFragment();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();
        fragment4 = new Fragment4();

        linearLayout1 = findViewById(R.id.LinearLayout11);
        linearLayout2 = findViewById(R.id.LinearLayout22);
        linearLayout3 = findViewById(R.id.LinearLayout33);
        linearLayout4 = findViewById(R.id.LinearLayout44);


        fm = getSupportFragmentManager();

        initial();

        fragment_hide();

        linearLayout1.setOnClickListener(this);
        linearLayout2.setOnClickListener(this);
        linearLayout3.setOnClickListener(this);
        linearLayout4.setOnClickListener(this);


    }

    private void fragment_show(Fragment fragment) {
        FragmentTransaction ft = fm.beginTransaction()
                .show(fragment);
        ft.commit();
    }

    private void fragment_hide() {
        FragmentTransaction ft = fm.beginTransaction()
                .hide(fragment1)
                .hide(fragment2)
                .hide(fragment3)
                .hide(fragment4);
        ft.commit();
    }

    private void initial() {
        FragmentTransaction ft = fm.beginTransaction()
                .add(R.id.content,fragment1)
                .add(R.id.content,fragment2)
                .add(R.id.content,fragment3)
                .add(R.id.content,fragment4);
        fragment_hide();
        ft.commit();

        fragment_show(fragment1);
    }

    @Override
    public void onClick(View view) {
        fragment_hide();
        int id = view.getId();
        if (id == R.id.LinearLayout11) {
            fragment_show(fragment1);
        } else if (id == R.id.LinearLayout22) {
            fragment_show(fragment2);
        } else if (id == R.id.LinearLayout33) {
            fragment_show(fragment3);
        } else if (id == R.id.LinearLayout44) {
            fragment_show(fragment4);
        }
    }
}