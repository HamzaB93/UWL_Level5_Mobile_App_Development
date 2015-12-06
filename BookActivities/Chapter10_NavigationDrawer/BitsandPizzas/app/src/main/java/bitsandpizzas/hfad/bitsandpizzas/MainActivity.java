package bitsandpizzas.hfad.bitsandpizzas;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ShareActionProvider;

public class MainActivity extends Activity {

    // For the Menu
    private ShareActionProvider shareActionProvider;

    // For the drawer
    private String[] titles;
    private ListView drawerList;
    private DrawerLayout drawerLayout;


    // Implementing an OnItemClickListener to respond to clicks
    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            // Code to run when the item gets clicked
            selectItem(position);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Getting the string array titles
        titles = getResources().getStringArray(R.array.titles);

        // Referencing the ListView
        drawerList = (ListView) findViewById(R.id.drawer);
        // Get reference to the drawerLayout
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        // Populate the ListView
        // Making an ArrayAdapter
        drawerList.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, titles));
        // This will use the DrawerItemClickListener to respond to clicks
        drawerList.setOnItemClickListener(new DrawerItemClickListener());

        // If the MainActivity is newly created
        if(savedInstanceState == null) {
            // Use TopFragment
            selectItem(0);
        }
    }

    ////////// Drawer Methods //////////
    private void selectItem(int position) {
        Fragment fragment;

        // Depending on what position of the listview was clicked
        switch(position) {
            case 1:
                // Make a new PizzaFragment
                fragment = new PizzaFragment();
                break;
            case 2:
                // Make a new PastaFragment
                fragment = new PastaFragment();
                break;
            case 3:
                // Make a new StoresFragment
                fragment = new StoresFragment();
                break;
            default:
                // By default use the TopFragment
                fragment = new TopFragment();
        }

        // Begin the fragment transaction
        FragmentTransaction ft = getFragmentManager().beginTransaction();

        // Replace the fragment that is displayed
        ft.replace(R.id.content_frame, fragment);
        // Set the transition to the new fragment
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);

        // Commit to the transaction
        ft.commit();

        // Set the action bar title
        setActionBarTitle(position);

        // Close the drawer once an item is selected
        drawerLayout.closeDrawer(drawerList);
    }

    // Set the title displayed on the action bar
    public void setActionBarTitle(int position) {
        String title;

        // If the Home button is pressed
        if(position == 0) {
            // Give us the app name
            title = getResources().getString(R.string.app_name);
        } else {
            // Otherwise use the name according to the position from the string array
            title = titles[position];
        }
        // Get the action bar and set the title
        getActionBar().setTitle(title);
    }

    
    ////////////////////////////////////////////////////////////////////////////

    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; add the item to the action bar if it is present
        getMenuInflater().inflate(R.menu.menu_main, menu);

        // Get a reference to the share action provider and assign it to the private variable
        MenuItem menuItem = menu.findItem(R.id.action_share);
        shareActionProvider = (ShareActionProvider) menuItem.getActionProvider();
        // Call the setIntent method
        setIntent("This is example text");
        return super.onCreateOptionsMenu(menu);
    }

    private void setIntent(String text)
    {
        // Creates an intent passes it an action
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, text);
        shareActionProvider.setShareIntent(intent);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_create_order:
                //Code to run whe the Create order item is clicked
                Intent intent = new Intent(this, OrderActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_settings:
                // Code o run when the settings item is clicked
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    ///////////////////////////////////////
}


// With themes, we dont want to use AppCompat theme. This is becuase we will be forced to use it
// Extending Activity will allow devices from old APIs to use the themes that are compatible