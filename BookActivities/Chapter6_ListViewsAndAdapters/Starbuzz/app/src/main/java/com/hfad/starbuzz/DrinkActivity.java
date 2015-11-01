package com.hfad.starbuzz;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends Activity {

    public static final String EXTRA_DRINKNO = "drinkNo";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        // Getting the drink from the intent
        int drinkNo = (Integer)getIntent().getExtras().get(EXTRA_DRINKNO);
        Drink drink = Drink.drinks[drinkNo];

        // Populate the drink image
        ImageView photo = (ImageView) findViewById(R.id.photo);

        // Set the source of the image using setImageResource()
        photo.setImageResource(drink.getImageResourceId());

        // ContentDescription used to make app more accessible
        photo.setContentDescription(drink.getName());

        // Populate the drink name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(drink.getName());

        // Populate drink description
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(drink.getDescription());
    }
}
