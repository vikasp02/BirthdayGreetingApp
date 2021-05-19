package com.activity.birthdayaniversary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     public static final String Vikas="submit";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button(View v){
    Intent intent= new Intent(this,ActivityB.class);
        Toast.makeText(this, "Your Button is Clicked", Toast.LENGTH_SHORT).show();
    EditText editText= findViewById(R.id.editTextTextPersonName);
    String message = editText.getText().toString();
    intent.putExtra(Vikas,message+"!");
    startActivity(intent);
}}