package com.example.phamm.bulldog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Care_Your_BullDogActivity extends AppCompatActivity {
    Toolbar toolbar;
    LinearLayout linearLayoutHealth, linearLayoutGallery,linearLayoutReminder,linearLayoutDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_care__your__bull_dog);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        initViews();
        addEvents();
    }
    private void initViews(){
        linearLayoutHealth = (LinearLayout) findViewById(R.id.linearLayoutHealth);
        linearLayoutGallery = (LinearLayout) findViewById(R.id.linearLayoutGallery);
        linearLayoutReminder = (LinearLayout)findViewById(R.id.linearLayoutReminder);
        linearLayoutDetails = (LinearLayout) findViewById(R.id.linearLayoutDetails);
    }
    private void addEvents(){
        linearLayoutHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Care_Your_BullDogActivity.this, "Healths", Toast.LENGTH_SHORT).show();
            }
        });
        linearLayoutGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Care_Your_BullDogActivity.this, "Gallery", Toast.LENGTH_SHORT).show();
            }
        });
        linearLayoutReminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Care_Your_BullDogActivity.this, "Reminder", Toast.LENGTH_SHORT).show();
            }
        });
        linearLayoutDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Care_Your_BullDogActivity.this, "Details", Toast.LENGTH_SHORT).show();
            }
        });
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
