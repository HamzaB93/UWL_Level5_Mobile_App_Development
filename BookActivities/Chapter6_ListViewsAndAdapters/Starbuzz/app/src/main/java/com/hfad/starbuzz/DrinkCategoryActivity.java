package com.hfad.starbuzz;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

// The activity extends ListActivity because its a list activity
public class DrinkCategoryActivity extends ListActivity {

    @Override
    // ListActivity inherits onCreate() method from Activity class
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Dont need this line because list activities define their own layout
        //setContentView(R.layout.activity_drink_category);

        // Creating an array adapter that displays Drink data from the Drink.drinks array
        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<Drink>(
                // Context: this is the current activity
                this,
                // Layout resource: built in layout resource,
                // tells array adapter to display each item in the array in a single text view
                android.R.layout.simple_list_item_1,
                // The array
                Drink.drinks);
        // Attach the array adapter to the list view using the ListView setAdapter()
        ListView listView = getListView();
        listView.setAdapter(listAdapter);
    }

    // Use this method to start the second activity DrinkActivity
    // listView gets called when an item's clicked
    public void onListItemClick(ListView listView, View itemView, int position, long id)
    {
        // DrinkCategoryActivity needs to start DrinkActivity
        Intent intent = new Intent(DrinkCategoryActivity.this, DrinkActivity.class);

        // EXTRA_DRINKNO is a constant for the name of the extra info is that we know DrinkCategroryActivity
        // and DrinkActivity are using the same string
        // id is the index of the item that is clicked from the array
        intent.putExtra(DrinkActivity.EXTRA_DRINKNO, (int) id);
        startActivity(intent);
    }
}

/*
 This activity should be registered in the AndroidManifest.xml so they can be used within your app
 (Does automatically)
  */

// Use an adapter to display data in a list view from a nonstatic source eg java array from Drink.class
// Adapter acts as abridge between ListView and DataSource. in our case, we need an ArrayAdapter
// Can also use array adapter with listViews
// Use arrayadapter by initializing the arra adapter and attatching it to the list view
// To initialise the array adapter, need to know what type of data is in the array you want to bind to the listView
//  Then pass 3 paramteters, Context: current activity, layout resource that specifies how to display each item
//  and the array itself.

// The array adapter takes each item in the array, converts them to String using toString and puts them i a textview

// Dont need to make an onItemClickListener - list activites implement this by default,
//  just need to implement onListItemClick()