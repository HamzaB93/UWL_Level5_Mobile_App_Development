package com.hfad.beeradvisor;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

// Extends the android Activity class
// Contains methods to make a java class into android activity
public class FindBeerActivity extends Activity {

    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        // oncreate() called whe the activity is first created
        super.onCreate(savedInstanceState);
        // Means to use find_beer as its layout
        setContentView(R.layout.activity_find_beer);
    }

    // Method we made in the activity_find_beer.xml for the button
    // Method is public, return void, single parameters of type View
    // View is used for the GUI components that triggers the method
    // CALL WHEN BUTTON IS CLICKED
    public void onClickFindBeer(View view)
    {

        // Getting reference to TextView
        // we want the view with the ID of brands
        // R to track the resources within the app and GUI components eg TEXTVIEW
        // Able to call methods from the TextView objects called brands
        // findView provides the java version of a GUI componant
        // can now access TextView methods
        TextView brands = (TextView) findViewById(R.id.brands);

        // Reference to the spinner with the id of color
        // Can now access spinner methods
        Spinner color = (Spinner) findViewById(R.id.color);

        // Get the selected item in the spinner and convert it to a string
        String beerType = String.valueOf(color.getSelectedItem());

        // Display the selected item
        // setText comes from the TextView object we made
        //brands.setText(beerType);

        // Get recommendations from the BeerExpert class
        List<String> brandList = expert.getBrands(beerType);

        // Build a string using the values in the list
        StringBuilder brandsFormatted = new StringBuilder();

        for (String brand : brandList)
        {
            brandsFormatted.append(brand).append('\n');
        }

        // Display the beers
        // setText comes from Text view object
        brands.setText(brandsFormatted);
    }
}

// onCreate called when activity object gets created and used to perform basic setup for layout
// its associated with

// setContentView tells android that this activity uses activity_find_beer