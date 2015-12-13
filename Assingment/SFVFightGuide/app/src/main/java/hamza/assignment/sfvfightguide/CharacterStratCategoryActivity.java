package hamza.assignment.sfvfightguide;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

// Extends listActivity which gives a defauly layout
public class CharacterStratCategoryActivity extends ListActivity {

    // When the page is created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create an ArrayAdapter for the CharacterStrat objects in the array
        ArrayAdapter<CharacterStrat> listAdapter = new ArrayAdapter<CharacterStrat>(
                // The current activity
                this,
                // The layout
                android.R.layout.simple_list_item_1,
                // The array
                CharacterStrat.charStrats);

        // The array adapter being attached to the listView
        ListView listView = getListView();
        listView.setAdapter(listAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_character_strat_category, menu);
        return true;
    }

    // Setting up the listview to respond to clicks
    public void onListItemClick(ListView listView, View itemView, int position, long id)
    {
        // Make an intent from this activity to start the CharacterStratDetailActivity
        Intent intent = new Intent(CharacterStratCategoryActivity.this, CharacterStratDetailActivity.class);

        // Give the intent an extra, this will be the index of the item that was clicked
        intent.putExtra(CharacterStratDetailActivity.EXTRA_CHARSTRATNO, (int) id);

        // Start the activity
        startActivity(intent);
    }

}
