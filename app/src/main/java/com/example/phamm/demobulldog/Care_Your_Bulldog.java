package com.example.phamm.demobulldog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Care_Your_Bulldog extends AppCompatActivity {
    Button btnHealth,btnGallery, btnReminder, btnDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_care__your__bulldog);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        initView();
        addEvents();
    }

    private void addEvents() {
        btnHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Care_Your_Bulldog.this, "Health", Toast.LENGTH_SHORT).show();
            }
        });
        btnGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Care_Your_Bulldog.this, "Gallery", Toast.LENGTH_SHORT).show();
            }
        });
        btnReminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Care_Your_Bulldog.this, "Reminder", Toast.LENGTH_SHORT).show();
            }
        });
        btnDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Care_Your_Bulldog.this, "Details", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initView(){
        btnHealth = (Button) findViewById(R.id.btnHealth);
        btnGallery = (Button) findViewById(R.id.btnGallery);
        btnReminder = (Button) findViewById(R.id.btnReminder);
        btnDetails = (Button) findViewById(R.id.btnDetails);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                Toast.makeText(this, "Back", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
