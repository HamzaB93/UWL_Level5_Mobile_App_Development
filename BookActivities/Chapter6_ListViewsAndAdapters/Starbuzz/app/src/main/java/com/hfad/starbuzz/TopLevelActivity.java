package com.hfad.starbuzz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class TopLevelActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        // Creating an OnItemClickListener which listens for when the ListView item is clicked
        // OnItemClickListner is a nester class within AdapterView. ListView is a subClass of AdapterView
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> listView, View v, int position, long id)
            {
                // Item 0 in list view is clicked
                if(position == 0)
                {
                    // Make a new intent for DrinkCategoryActivity
                    Intent intent = new Intent(TopLevelActivity.this, DrinkCategoryActivity.class);
                    // Start the activity
                    startActivity(intent);
                }
            }
        };

        // Get the reference to the ListView in the TopLevel xml
        ListView listView = (ListView) findViewById(R.id.list_options);
        // Set the onItemClickListener to listView reference
        listView.setOnItemClickListener(itemClickListener);

    }


}

// Use an onItemClickListner listens for when items are clicked. Needs ot be in the onCreate method
// onItemClick methods lets you say how your activity should repsond to the click
/*The onClickItemListener needs to be linked to the ListView. The listener is added to the ListView
IF it isnt linked, the ListView wont know how to react to clicks */