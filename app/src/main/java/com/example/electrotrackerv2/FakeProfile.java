package com.example.electrotrackerv2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FakeProfile extends AppCompatActivity {

    TextView nametext,  usertext, emailtext ;

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake_profile);

        String messagename = getIntent().getStringExtra("message_name");
        String messageuser = getIntent().getStringExtra("message_user");
        String messageemail = getIntent().getStringExtra("message_email");

        nametext = findViewById(R.id.profName);
        usertext = findViewById(R.id.profUsername);
        emailtext = findViewById(R.id.profEmail);

        nametext.setText(messagename);
        usertext.setText(messageuser);
        emailtext.setText(messageemail);


    }


}