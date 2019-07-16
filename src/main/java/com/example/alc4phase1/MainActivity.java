package com.example.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void aboutALC(View view) {
        Intent intent=new Intent(this, AboutAlc.class);
        startActivity(intent);

    }

    public void MyProfile(View view) {
        Intent intent=new Intent(this, MyProfile.class);
        startActivity(intent);

    }
}
