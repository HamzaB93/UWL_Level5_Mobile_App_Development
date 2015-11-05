package com.hfad.workout;


import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */

// This activity extends Android ListFragment class
public class WorkoutListFragment extends ListFragment {

    public WorkoutListFragment() {
        // Required empty public constructor
    }

    // Add the listener to the fragment
    static interface WorkoutListListener {
        void itemClicked(long id);
    }
    private WorkoutListListener listener;

    @Override
    // Method gets called when fragment's view gets created
    // Made this because we want to populate the fragment's list viewwith data as soon as its created
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Declaring a string array
        String[] names = new String[Workout.workouts.length];
        // Looping through the array of workouts
        for (int i = 0 ; i < names.length; i++){

            //Creating the String array of workout names
            names[i] = Workout.workouts[i].getName();
        }

        // Creating an array adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                // getting the context from the layout inflater
                inflater.getContext(), android.R.layout.simple_list_item_1, names);
        // Bind the adapter to the list view
        setListAdapter(adapter);

        // Giving a default layout for the ListFragment
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    // This method gets called when the fragment gets attached to the activity
    public void onAttach(Activity activity){
        super.onAttach(activity);
        this.listener = (WorkoutListListener) activity;
    }

    @Override
    public void onListItemClick(ListView i, View v, int position, long id){
        if(listener != null){
            // Tell the listener when an item in the listView is clicked
            listener.itemClicked(id);
        }
    }
}

// Code creates a basic ListFragment called WorkoutListFragment so must extend ListFragment
// Want activity and the fragment to talk to eachother without eachother knowing too much. do this with interface
// Interface will define the minimum requirements for one object to talk to another

// WorkoutListListener will tell the fragment that it wants to listen
// User will click on a workout in the list
// onListItemClicked() method in the list-fragment will be called
// That method will then call the WorkoutListListener's itemClicked() method with the ID of the workout