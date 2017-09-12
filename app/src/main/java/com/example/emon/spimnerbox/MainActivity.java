package com.example.emon.spimnerbox;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.Spinner;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner) findViewById(R.id.spin);
        initUI();
    }


    public void initUI() {
        final String gender[] = {"Male", "Female", "Both"};
        spinnerAdapter adapter = new spinnerAdapter(MainActivity.this, android.R.layout.simple_list_item_1);
        adapter.addAll(gender);
        adapter.add("I am ");
        spinner.setAdapter(adapter);
        spinner.setSelection(adapter.getCount());

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                if(position>0){

                    Toast.makeText(MainActivity.this, "Selected : " +spinner.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
