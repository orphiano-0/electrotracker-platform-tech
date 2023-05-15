package com.example.electrotrackerv2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.electrotrackerv2.databinding.ActivityA1LoginBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.Objects;

public class A1Login extends AppCompatActivity {

    TextView gotoRegisterP;
    EditText loginUsername, loginPassword;
    Button loginButton;

    ActivityA1LoginBinding binding;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1_login);



        gotoRegisterP = findViewById(R.id.gotoRegister);

        gotoRegisterP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoRP();
            }
        });

        loginUsername = findViewById(R.id.login_username);
        loginPassword = findViewById(R.id.login_password);
        loginButton = findViewById(R.id.login_button);



        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!validateUsername() | !validatePassword()){ // if these are not true then nothing will not work

                } else{
                    // displayData();
                   checkUser();

                }
            }
        });


    }


    public void displayData(){

        String userUsername = loginUsername.getText().toString().trim();

        reference = FirebaseDatabase.getInstance().getReference("Users");
        reference.child("userName").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {

                DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Users");
                Query checkUserDatabase = reference.orderByChild("userName").equalTo(userUsername);

                checkUserDatabase.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if(snapshot.exists()){

                            String dbNAME = snapshot.child(userUsername).child("fullName").getValue(String.class);
                            String dbUSERNAME = snapshot.child(userUsername).child("userName").getValue(String.class);
                            String dbEMAIL = snapshot.child(userUsername).child("email").getValue(String.class);

//                           Toast.makeText(A1Login.this, "Name:  "+dbNAME +"\n"+ "Email: " +dbEMAIL+"\n"+ "Username: "+ dbUSERNAME, Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(A1Login.this, FakeProfile.class);

                            intent.putExtra("message_name", dbNAME);
                            intent.putExtra("message_user", dbUSERNAME);
                            intent.putExtra("message_email", dbEMAIL);
                            startActivity(intent);

                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });



            }
        });

    }


    public Boolean validateUsername(){

        String val = loginUsername.getText().toString();
        if(val.isEmpty()){
            loginUsername.setError("Username cannot be empty");
            return false;
        }else{
            loginUsername.setError(null);
            return true;
        }
    }

    public Boolean validatePassword(){

        String val = loginPassword.getText().toString();
        if(val.isEmpty()){
            loginPassword.setError("Password cannot be empty");
            return false;
        }else{
            loginPassword.setError(null);
            return true;
        }
    }

    public void checkUser(){
        String userUsername = loginUsername.getText().toString().trim();
        String userPassword = loginPassword.getText().toString().trim();

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Users");
        Query checkUserDatabase = reference.orderByChild("userName").equalTo(userUsername);

        checkUserDatabase.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange (@NonNull DataSnapshot snapshot){

                if(snapshot.exists()){ // If snapshot exist it means if users exist it will set the Error to be null
                    loginUsername.setError(null);
                    String passwordFromDB = snapshot.child(userUsername).child("password").getValue(String.class);

                    if (Objects.equals(passwordFromDB, userPassword)){
                        loginUsername.setError(null);
                        Intent intent = new Intent(A1Login.this, B1CustomerPage.class);
                        startActivity(intent);
                    } else {
                        loginPassword.setError("Invalid Credentials");
                        loginPassword.requestFocus();
                    }

                }else{
                    loginUsername.setError("User does not exist");
                    loginUsername.requestFocus();

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error){

            }
        });
    }

    public void gotoRP(){
        Intent intent = new Intent(this, A1Register.class);
        startActivity(intent);
        finish();
    }


}