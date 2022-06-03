package com.example.meow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ContactPage extends AppCompatActivity {

    private EditText sub, msg;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_page);

        sub = findViewById(R.id.sub);
        msg = findViewById(R.id.msg);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"tanishqvashisht12@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, sub.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT, msg.getText().toString());
                startActivity(intent);
                Toast.makeText(ContactPage.this, "meow", Toast.LENGTH_SHORT).show();
            }
        });
    }
}