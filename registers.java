package android.example.com.a93913_gym;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class registers extends AppCompatActivity {
    private static EditText fn;
    private static EditText ln;
    private static EditText useremail;
    private static EditText pass1;
    private static EditText conpass;
    private static Button su_button;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registers);
        mAuth = FirebaseAuth.getInstance();
        RegisterButton();
    }

    private void RegisterButton() {
        fn = findViewById(R.id.fn);
        ln = findViewById(R.id.ln);
        useremail = findViewById(R.id.useremail);
        pass1 = findViewById(R.id.pass1);
        conpass = findViewById(R.id.conpass);
        su_button = findViewById(R.id.su_button);

        final String email = useremail.getText().toString();
        final String pass = pass1.getText().toString();

        su_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pass1.getText().toString().equals(conpass.getText().toString())) {
                    Log.d("", "Create User with Email is Succesful");
                    mAuth.createUserWithEmailAndPassword(email, String.valueOf(pass1)).addOnCompleteListener(registers.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Log.d("", "Create User with Email:success");
                                FirebaseUser user = mAuth.getCurrentUser();
                            } else {
                                //for  failed sign in
                                Toast.makeText(registers.this, "Failed Authentication", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });


                }
            }

        });
    }
}
