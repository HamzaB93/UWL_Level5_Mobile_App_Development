package com.hfad.workout;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */

// This extends Android Fragment class
public class WorkoutDetailFragment extends Fragment {

    // This is the ID of the workout the user chooses. Use it to setthe values of
    //  fragement's views withthe workout details
    private long workoutId;

    // Needed so that the fragment can be reinstated when needed
    public WorkoutDetailFragment() {
        // Required empty public constructor
    }


    @Override
    // onCreateView is called when android needs to know the fragements layout
    // Optional but needed when you need to use fragement that has a layout
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // If the state was not null
        if(savedInstanceState != null) {
            // Get the workoutId
            workoutId = savedInstanceState.getLong("workoutId");
        }

        // Inflate the layout for this fragment
        // Identify the layout for the fragment
        // Equivalent of setContentView in the onCreate methods for normal activities
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }

    @Override
    // onStart called when fragment is about to become visible
    public void onStart(){
        super.onStart();
        // getView method gets fragment's root View, use it to get reference to workout
        //  title and description text views
        View view = getView();

        if(view != null){
            // Getting refernce to the
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            // Get the workoutId which is the workout in the arraylist
            Workout workout = Workout.workouts[(int) workoutId];
            // Set the title to the getName() of the id
            title.setText(workout.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            // Set the description to the getDescription of the given id
            description.setText(workout.getDescription());
        }
    }

    // Setter method for workoutId. activity will use this method to set the value of workoutId
    // The activity needs to call the fragement's setWorkout() method and pass it an ID of a
    //  particualr workout
    public void setWorkoutId(long id)
    {
        this.workoutId = id;
    }

    // Saving the state of the workoutId before the fragment gets detroyed
    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putLong("workoutId", workoutId);
    }


}
