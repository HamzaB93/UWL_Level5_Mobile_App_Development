package com.hfad.workout;

/**
 * Created by hamza on 01/11/15.
 */
public class Workout
{
    // A workouts properties
    private String name;
    private String description;

    // workouts is an array of four Workouts
    public static final Workout[] workouts = {
            // New workout objects with a name and description
            new Workout("The Limb Loosener", "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
            new Workout("Core Agony", "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats"),
            new Workout("The Wimp Special", "5 Pull-ups\n10 Push-ups\n15 Squats"),
            new Workout("Strength and Length", "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups")
    };

    // Each Workout has a name and description
    private Workout(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    // Getters for the private variables
    public String getName()
    {
        return name;
    }
    public String getDescription()
    {
        return description;
    }

    // toString string representation of a Workout is its name
    public String toString()
    {
        return this.name;
    }


}
/*
This is a pure java class that the app will get workout data from.
The class defines an array of four workouts, where each workout has a name and a description
This data will be used by the fragment WorkDetailFragment.
 */
