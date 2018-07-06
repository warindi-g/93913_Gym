package android.example.com.a93913_gym;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class dashboard extends AppCompatActivity {
    Button gym,workouts,logout,settings,profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        gym=(Button)findViewById(R.id.gym);
        workouts=(Button)findViewById(R.id.workouts);
        logout=(Button)findViewById(R.id.logout);
        settings=(Button)findViewById(R.id.settings);
        profile=(Button)findViewById(R.id.profile);


        gym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(dashboard.this,MapsActivity.class);
                startActivity(intent);
            }
        });

        workouts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(dashboard.this,workout.class);
                startActivity(intent2);
            }
        });


        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(dashboard.this,profile.class);
                startActivity(intent3);
            }
        });


        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(dashboard.this,settings.class);
                startActivity(intent);
            }
        });


         logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(dashboard.this,logout.class);
                startActivity(intent);
            }
        });
    }
}
