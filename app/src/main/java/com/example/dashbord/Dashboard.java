package com.example.dashbord;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

<<<<<<< HEAD
import com.example.tracker.R;
import com.example.tracker.inventory;

public class Dashboard extends AppCompatActivity {

=======
public class Dashboard extends AppCompatActivity {
>>>>>>> 461fd97716a8e5e41eac52117f4b695a504458d2
    private RelativeLayout inv,doc,profile,share,rem,todo;
    private Intent intent;


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
<<<<<<< HEAD
                startActivity(intent = new Intent(Dashboard.this, inventory.class));
=======
                startActivity(intent = new Intent(Dashboard.this,Inventory.class));
>>>>>>> 461fd97716a8e5e41eac52117f4b695a504458d2

            }
        });
        rem.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
<<<<<<< HEAD
                startActivity(intent = new Intent(Dashboard.this,Profile.class));
=======
                startActivity(intent = new Intent(Dashboard.this,Inventory.class));
>>>>>>> 461fd97716a8e5e41eac52117f4b695a504458d2

            }
        });
        todo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
<<<<<<< HEAD
                startActivity(intent = new Intent(Dashboard.this,Profile.class));
=======
                startActivity(intent = new Intent(Dashboard.this,Inventory.class));
>>>>>>> 461fd97716a8e5e41eac52117f4b695a504458d2

            }
        });
        doc.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
<<<<<<< HEAD
                startActivity(intent = new Intent(Dashboard.this,Profile.class));
=======
                startActivity(intent = new Intent(Dashboard.this,Inventory.class));
>>>>>>> 461fd97716a8e5e41eac52117f4b695a504458d2

            }
        });
        share.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
<<<<<<< HEAD
                startActivity(intent = new Intent(Dashboard.this,Profile.class));
=======
                startActivity(intent = new Intent(Dashboard.this,Inventory.class));
>>>>>>> 461fd97716a8e5e41eac52117f4b695a504458d2

            }
        });
        profile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
<<<<<<< HEAD
                startActivity(intent = new Intent(Dashboard.this,Profile.class));
=======
                startActivity(intent = new Intent(Dashboard.this,Inventory.class));
>>>>>>> 461fd97716a8e5e41eac52117f4b695a504458d2

            }
        });

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        setUI();


    }
}