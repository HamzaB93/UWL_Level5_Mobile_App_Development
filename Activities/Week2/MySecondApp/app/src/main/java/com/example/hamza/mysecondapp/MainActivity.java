package com.example.hamza.mysecondapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // Creating the object ModuleInfo with refrence to info
    private ModuleInfo info = new ModuleInfo();

    // Call when button gets clicked
    public void onClickFindModule(View view){
        // Get reference to the TextView
        TextView description = (TextView) findViewById(R.id.textView);
        // Get a reference to the Spinner
        Spinner courseName =  (Spinner) findViewById(R.id.spinner);
        // Get the selected item in the Spinner
        String course = String.valueOf(courseName.getSelectedItem());
        // Display the selected item
        description.setText(course);

        // Get recommendations from the ModulesInfo class
        List<String> courseList = info.getCourses(course);
        StringBuilder typeFormatted = new StringBuilder();
        for (String brand : courseList) {
            typeFormatted.append(brand).append('\n');
        }
        // Display course info
        description.setText(typeFormatted);
    }
}
