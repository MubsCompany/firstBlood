package com.example.muhammad.firstblood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


    }

    public void firstLayout(View view) {
        startActivity(new Intent(Home.this, Last.class));
    }

    public void secondLayout(View view) {
        startActivity(new Intent(Home.this, RelativeLayout.class));
    }

    public void thirdLayout(View view) {
        startActivity(new Intent(Home.this, LinearLayout.class));
    }

    public void fourthLayout(View view) {
        startActivity(new Intent(Home.this, FirstTugas.class));
    }
}
