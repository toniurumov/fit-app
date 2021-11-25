package com.example.myfitapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Objects;

public class TechniquesActivity extends AppCompatActivity {

 private TextView mTechniquesName;
 private TextView mTechniquesRepetitions;
 private TextView mTechniquesMethods;
 private TextView mTechniques;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_techniques);

        mTechniquesName = (TextView)findViewById(R.id.tech_name);
        mTechniques = (TextView)findViewById(R.id.tech_tech);
        mTechniquesMethods = (TextView)findViewById(R.id.tech_method);
        mTechniquesRepetitions =(TextView)findViewById(R.id.tech_repetitions);

        Intent intent = getIntent();
        String Name = intent.getExtras().getString( "Name");
        String Repetitions = intent.getExtras().getString( "Repetitions");
        String Methods = intent.getExtras().getString("Methods");
        String Techniques = intent.getExtras().getString("Technique");

        mTechniquesName.setText(Name);
        mTechniquesRepetitions.setText(Repetitions);
        mTechniquesMethods.setText(Methods);
        mTechniques.setText(Techniques);

        Button returnBtn = findViewById(R.id.button);

        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}