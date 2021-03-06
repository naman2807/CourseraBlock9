package com.example.courserablock9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View v){
        String message = ((EditText)findViewById(R.id.text)).getText().toString();
        Uri destination = Uri.parse("smsTo:5556");
        Intent intent = new Intent(Intent.ACTION_SENDTO, destination);
        intent.putExtra("message", message);
        startActivity(intent);
    }
}