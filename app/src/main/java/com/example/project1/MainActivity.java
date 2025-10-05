package com.example.project1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


    }



    public void onClick(View v){
        TextView groupView = findViewById(R.id.GroupTextView);
        TextView nameView = findViewById(R.id.NameTextView);

        if (groupView != null){
            groupView.setVisibility(groupView.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
        }
        if (nameView != null){
            nameView.setVisibility(nameView.getVisibility() == View.VISIBLE ? View.GONE :  View.VISIBLE);
        }
    }

    public void hideImage(View v){
        ImageView butterfly = findViewById(R.id.imageView3);

        if (butterfly != null) {
            butterfly.setVisibility(butterfly.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
        }
    }
}