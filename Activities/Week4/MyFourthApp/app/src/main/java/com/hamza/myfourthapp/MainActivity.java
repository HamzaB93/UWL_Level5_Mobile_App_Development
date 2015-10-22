package com.hamza.myfourthapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import android.os.Handler;

public class MainActivity extends Activity
{
    // Record the number of seconds passed and whether the stopwatch is running
    private int seconds = 0;
    private boolean running;
    private boolean wasRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState != null)
        {
            // retrieve the values of the seconds and running variable from the bundle
            seconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("running");

            // passing the wasRunning state
            wasRunning = savedInstanceState.getBoolean("wasRunning");
        }

        // Start the funTimer() method whe our activity is created
        runTimer();
    }

    public void onClickStart(View view)
    {
        // Start the stopwatch running
        running=true;
    }

    public void onClickStop(View view)
    {
        // Stop the stopwatch running
        running=false;
    }

    public void onClickReset(View view)
    {
        // Stop the stopwatch running and set the seconds to 0
        running=false;
        seconds=0;
    }


    private void runTimer()
    {
        // Getting the reference to the timeView by id
        final TextView timeView = (TextView) findViewById(R.id.time_view);

        // Define new Handler; this is a class you can use to schedule
        //  code that should be run at some point in the future
        final Handler handler = new Handler();

        // post() accepts one parameter, and Object of type Runnable (a job you want to run)
        // Runable object defines a run() function
        handler.post(new Runnable()
        {
            @Override
            public void run()
            {
                int hours = seconds / 3600;
                int minutes = (seconds % 3600) / 60;
                int secs = seconds % 60;
                String time = String.format("%d:%02d:%02d", hours, minutes, secs);
                timeView.setText(time);
                if (running)
                {
                    seconds++;
                }

                // postDelayed() function takes two parameters, a Runnable and a Long
                //  Runnable contains the code you want to run in its run and
                //  long specifies the number of milliseconds you want to delay the code by
                handler.postDelayed(this, 1000);
            }
        });
    }

    @Override
    // This method gets called before the activity gets detroyes
    //  which menas you habe the opportunity to save any value you want to retain
    //  the onCreate method get passed the savedInstanceState Bundle
    public void onSaveInstanceState(Bundle savedInstanceState)
    {
        savedInstanceState.putInt("seconds", seconds);
        savedInstanceState.putBoolean("running", running);
        savedInstanceState.putBoolean("wasRunning", wasRunning);
    }

    @Override
    // OnStop() method to stop running the application when it is not visible
    protected void onStop()
    {
        // Overriding one of tha andriod lifecycle methods
        // Need to call onStop method in the superclass
        super.onStop();
        // Recording whether the stopwatch was running
        running = false;
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        // New boolean to record whether the stopwatch was running before the onStop method was called
        if(wasRunning)
        {
            running = true;
        }
    }
}
