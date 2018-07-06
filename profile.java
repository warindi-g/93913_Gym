package android.example.com.a93913_gym;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class profile extends AppCompatActivity {
    ImageView profile;
    TextView name,age,gender,h_location,start_w,target_w;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        profile=(ImageView)findViewById(R.id.profile);
        name=(TextView)findViewById(R.id.name);
        age=(TextView)findViewById(R.id.age);
        h_location=(TextView)findViewById(R.id.h_location);
        start_w=(TextView)findViewById(R.id.start_w);
        target_w=(TextView)findViewById(R.id.target_w);


    }
}
