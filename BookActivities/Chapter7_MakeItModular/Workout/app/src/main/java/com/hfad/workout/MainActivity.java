package com.hfad.workout;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Fade;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;

// Implments the listener defined in the WorkoutListFragment
public class MainActivity extends Activity implements WorkoutListFragment.WorkoutListListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Needs to be after setContentView because before it, fragment wont have been created
        // Getting a referecnce to the workoutdetailfragment using getfragemntmanager
        //WorkoutDetailFragment frag = (WorkoutDetailFragment) getFragmentManager().
        //        findFragmentById(R.id.detail_frag);

        // Telling the fragment which workout details we want it to display
        // Just for test purposes
        //frag.setWorkoutId(1);
    }

    @Override
    public void itemClicked(long id){

        View fragmentContainer = findViewById(R.id.fragment_container);

        // If the frame layout is present run this code for tablets
        if (fragmentContainer != null) {
            WorkoutDetailFragment details = new WorkoutDetailFragment();

            // Creating a fragment transaction and begining the transaction
            FragmentTransaction ft = getFragmentManager().beginTransaction();

            // Setting the details
            details.setWorkoutId(id);

            // Replace fragment held in fragment container
            // R.id is the ID of the container containing the fragment
            // Can add or remove fragments also
            ft.replace(R.id.fragment_container, details);

            // Adding the transaction to the back stack
            // null because we dont need to retrieve the transaction
            ft.addToBackStack(null);

            // Can setTransition method to say what kind of animation you want
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);

            // Committing the changes
            ft.commit();
        }

        // Otherwise the app is running on a small screen and pass the id to a
        //  a new activity
        else {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_WORKOUT_ID, (int)id);
            startActivity(intent);
        }

    }

}
/*
    To talk to a fragment, we need to first get reference to it
    To do this we need to get reference to the activity's fragment manager using getFragmentManager()
    Then use findFragmentById() to get a refernce to the fragment
    The manager is used to manage any fragements used by the activity
 */

// When an item is clicked in the fragment itemClicked() method in the activity is called

// When activities change or go to another this is a transaction. fragment changes can also be
// transactions. These transactions are stored in a back stack

// Replace fragmet at runtime inside a fragment transaction = set of changes we want to apply relating
//  to the fragment
// Then specify the actions you want to group together in the transaction
//  in our case we want to replace the fragments frame layout .