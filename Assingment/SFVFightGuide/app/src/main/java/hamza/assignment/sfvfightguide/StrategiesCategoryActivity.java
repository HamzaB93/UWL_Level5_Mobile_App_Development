package hamza.assignment.sfvfightguide;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class StrategiesCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Creating an array adapter to populate the listview
        ArrayAdapter<Strategy> listAdapter = new ArrayAdapter<Strategy>(
                // Context, the current activity
                this,
                // The layout resource,
                android.R.layout.simple_list_item_1,
                // The array
                Strategy.strategies
        );

        // Attatching the array adapter to the list view
        ListView listView = getListView();
        listView.setAdapter(listAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_strategies_category, menu);
        return true;
    }



}
