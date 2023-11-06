package com.example.mywork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Detail_ui extends AppCompatActivity {
    TextView detail_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_ui);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        detail_text = findViewById(R.id.textView2);
        String text = bundle.getString("text");
        detail_text.setText(text);

    }
}