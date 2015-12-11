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

public class ComboCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Creating an Array Adapter to display the Combo information in the list view
        ArrayAdapter<Combo> listAdapter = new ArrayAdapter<Combo>(
                // The context, current activity
                this,
                // Layout resource which is built in, will list items one after another
                android.R.layout.simple_list_item_1,
                // The array
                Combo.combos);
        // Attaching the array adapter to a list view
        ListView listView = getListView();
        listView.setAdapter(listAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_combo_category, menu);
        return true;
    }

    // Setting up an onclick method for when an item is clicked from the list
    public void onListItemClick(ListView listView, View itemView, int position, long id)
    {
        // Creating an intent to start the ComboDetailActivity
        Intent intent = new Intent(ComboCategoryActivity.this, ComboDetailActivity.class);

        // Adding extra to the intent. This will be an integer that will reference the index of
        // the array
        intent.putExtra(ComboDetailActivity.EXTRA_COMBON, (int) id);
        startActivity(intent);
    }
}
