package com.hfad.workout;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class DetailActivity extends Activity {

    // A constant for name of the extra info in the intent so that we
    //  know MainActivity and DetailActivity are using the same string
    public static final String EXTRA_WORKOUT_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Get reference to the fragment
        WorkoutDetailFragment workoutDetailFragment = (WorkoutDetailFragment)
                getFragmentManager().findFragmentById(R.id.detail_frag);

        // Get the ID of the workout the user clicked on from the intent
        int workoutId = (int) getIntent().getExtras().get(EXTRA_WORKOUT_ID);

        // Pass the workoutID to the fragment
        workoutDetailFragment.setWorkoutId(workoutId);
    }
}

// DetailActivity code gets the ID of the workout from the intent that started the
//  activity.