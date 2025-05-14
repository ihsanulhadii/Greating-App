package com.mastercoding.greetingapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText etEditText;
    Button btnButton;
    TextView tvTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEditText = findViewById(R.id.etEditText);
        btnButton = findViewById(R.id.btnButton);
        tvTitle = findViewById(R.id.tvTitle);

        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String inputName= etEditText.getText().toString();

                Toast.makeText(
                        MainActivity.this,
                        "Welcome " + inputName +" to our App",
                        Toast.LENGTH_SHORT).show();

            }
        });

    }
}