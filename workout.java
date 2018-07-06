package android.example.com.a93913_gym;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class workout extends AppCompatActivity {
    EditText workdate;
    EditText worknumber;
    Spinner location;
    Spinner worktype;
    Button save_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);





        Spinner myspinner=(Spinner)findViewById(R.id.location);
        List<String> list = new ArrayList<String>();

        list.add("Select Gym Location");
        list.add(String.valueOf(R.string.nairobi));
        list.add(String.valueOf((R.string.arusha)));
        list.add(String.valueOf(R.string.cairo));
        list.add(String.valueOf(R.string.joburg));
        list.add(String.valueOf(R.string.maputo));

        ArrayAdapter<String> myAdapter=  new ArrayAdapter<String>(workout.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.locations));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        ;
        myspinner.setAdapter(myAdapter);



        myspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position) {
                    case 0:
                        break;
                    case 1:
                        String s = getString(R.string.nairobi);
                        break;
                    case 2:
                        String s1=(getString(R.string.arusha));
                        break;
                    case 3:
                        String s2 = getString(R.string.cairo);
                        break;
                    case 4:
                        String s5 = getString(R.string.joburg);
                        break;
                    case 5:
                        String s6= (getString(R.string.maputo));
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        Spinner myspinner2=(Spinner)findViewById(R.id.worktype);
        ArrayAdapter<String> myAdapter2=  new ArrayAdapter<String>(workout.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.worktype));
        myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        ;
        myspinner2.setAdapter(myAdapter2);




        final EditText work_date=(EditText)findViewById(R.id.workdate);
        final EditText worknumber=(EditText)findViewById(R.id.worknumber);
        save_button=(Button)findViewById(R.id.save_button);




        save_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String work1 = work_date.getText().toString();
                final String work2 = worknumber.getText().toString();



            }
        });


    }




}


