package com.example.dashbord;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout inv,doc,profile,share,rem,todo;


    private void setUI(){
        inv=findViewById(R.id.inv);
        doc=findViewById(R.id.doc);
        profile=findViewById(R.id.profile);
        share=findViewById(R.id.share);
        rem=findViewById(R.id.rem);
        todo=findViewById(R.id.todo);

        inv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setActivity();
            }
        });

    }
    private void setActivity(){
        Intent intent = new Intent(this,Inventory.class);
        startActivity(intent);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUI();


    }
}