package com.vogella.android.implicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCall, btnCallFriend, btnMap, btnWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCall = findViewById(R.id.btnCall);
        btnCallFriend = findViewById(R.id.btnCallFriend);
        btnWeb = findViewById(R.id.btnWeb);
        btnMap = findViewById(R.id.btnMap);

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                startActivity(intent);

            }
        });

        btnCallFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9565579146"));
                startActivity(intent);
            }
        });

        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Is there an application that can help me view a website? the same applies to the map address
                // Intent to open a certain website
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://backendless.com"));
                startActivity(intent);
            }
        });

        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // to show a map we have to use the ACTION_VIEW, you VIEW a map; start with geolocation "geo:0,0?q= address "
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=155 State Way, Welkom, Free State"));
                startActivity(intent);
            }
        });



    }
}
