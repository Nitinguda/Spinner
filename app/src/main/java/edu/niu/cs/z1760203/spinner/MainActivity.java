package edu.niu.cs.z1760203.spinner;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private Spinner xmlSpin, arraySpin, listSpin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        xmlSpin = (Spinner)findViewById(R.id.xmlSpinner);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(getApplicationContext(), R.array.spinnerArray, R.layout.spinner_view);


        xmlSpin.setAdapter(adapter1);

        xmlSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selection1;

                selection1 = parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(), "The Selection is" + selection1, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        arraySpin = (Spinner)findViewById(R.id.arraySpinner);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(getApplicationContext(), R.layout.spinner_view, Info.arrayVal);

        arraySpin.setAdapter(adapter2);

        arraySpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selection2;

                selection2 = parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(), "The selection is" + selection2, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        List<String> valueList = new ArrayList<String>();
        valueList.add("sachin");
        valueList.add("lebron");
        valueList.add("messi");
        valueList.add("bolt");

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(getApplicationContext(), R.layout.spinner_view, valueList);

        listSpin = (Spinner)findViewById(R.id.listSpinner);
        listSpin.setAdapter(adapter3);

        listSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selection3;

                selection3 = parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(), "The selection is" + selection3, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }//oncreate
}
