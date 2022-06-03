package com.example.meow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView gh;
    private ImageView ig;
    private ImageView cc;
    private ImageView cf;
    private ImageView hr;
    private Button contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gh = findViewById(R.id.gh);
        ig = findViewById(R.id.ig);
        cc = findViewById(R.id.cc);
        cf = findViewById(R.id.cf);
        hr = findViewById(R.id.hr);
        contact = findViewById(R.id.contact);

        gh.setOnClickListener(view -> {
            openWebPage("https://github.com/tanishqvashisht");
            Toast.makeText(MainActivity.this, "meow", Toast.LENGTH_SHORT).show();
        });

        ig.setOnClickListener(view -> {
            openWebPage("https://www.instagram.com/tanishqvashisht/");
            Toast.makeText(MainActivity.this, "meow", Toast.LENGTH_SHORT).show();
        });

        cc.setOnClickListener(view -> {
            openWebPage("https://www.codechef.com/users/tanishqv");
            Toast.makeText(MainActivity.this, "meow", Toast.LENGTH_SHORT).show();
        });

        cf.setOnClickListener(view -> {
            openWebPage("https://codeforces.com/profile/tanishqv12");
            Toast.makeText(MainActivity.this, "meow", Toast.LENGTH_SHORT).show();
        });

        hr.setOnClickListener(view -> {
            openWebPage("https://www.hackerrank.com/tanishqvashisht1");
            Toast.makeText(MainActivity.this, "meow", Toast.LENGTH_SHORT).show();
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ContactPage.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "meow", Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }
}