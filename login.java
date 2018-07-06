package android.example.com.a93913_gym;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {

    private static EditText useremail;
    private static EditText pass;
    private static Button log_button;
    private static Button su_button;

    private FirebaseAuth mAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        /*LoginButton();*/
    mAuth = FirebaseAuth.getInstance();
        SignUpButton();


    }

    private void SignUpButton() {
        su_button= findViewById(R.id.su_button);
        su_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent2= new Intent(login.this, registers.class);
                startActivity(intent2);
            }
        });
        /* mAuth=FirebaseAuth.getInstance();*/
    }



       private void LoginButton(){
           useremail= findViewById(R.id.useremail);
           pass= findViewById(R.id.pass1);
           log_button= findViewById(R.id.log_button);

           final String email=useremail.getText().toString();
           final String password=pass.getText().toString();

           log_button.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   if(useremail.getText().toString().equals("email") & pass.getText().toString().equals("password")){
                       Toast.makeText(login.this, "Email and Password are Correct",Toast.LENGTH_SHORT).show();
                       Intent intent= new Intent (login.this, dashboard.class);
                       startActivity(intent);
                   }
                   else {
                       Toast.makeText(login.this, "Wrong Credentials. Try Agin.", Toast.LENGTH_SHORT).show();
                   }

               }
           });

       }





    }




