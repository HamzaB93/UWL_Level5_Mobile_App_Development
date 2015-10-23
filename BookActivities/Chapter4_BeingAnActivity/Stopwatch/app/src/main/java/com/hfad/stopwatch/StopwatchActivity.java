package com.hfad.stopwatch;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.os.Handler;


public class StopwatchActivity extends Activity {

    // These properties will keep track of the seconds passed and whether the watch is running
    private int seconds = 0;
    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);

        // We want runTimer to start running immediately
        // Starting when the activity is created
        runTimer();
    }

    // When start button is pressed
    public void onClickStart(View view)
    {
        // Makes boolean true >>> stop watch is running
        running = true;
    }

    // When stop button is pressed
    public void onClickStop(View view)
    {
        // Make boolean false >>> stopwatch isnt running
        running = false;
    }

    // When the reset button is press
    public void onClickReset(View view)
    {
        // isnt running
        running = false;

        // make the seconds 0 again
        seconds = 0;
    }

    private void runTimer()
    {
        // Getting a reference to the TextView and making an object called timeView
        final TextView timeView = (TextView) findViewById(R.id.time_view);

        // Creating a Handler object called handler
        final Handler handler = new Handler();

        // Passing a new Runnable
        // This will run almost immediately
        handler.post(new Runnable()
        {
            // Contains the code we want to run
            @Override
            public void run()
            {
                // Formatting the seconds variable into hours, mins and seconds
                int hours = seconds/3600;
                int minutes = (seconds%3600)/60;
                int secs = seconds%60;

                // How we want to see the time
                // This is the code we want to run ie updating the TextView
                String time = String.format("%d:%02d:%02d" , hours, minutes, secs);

                // Setting the time to the TextView object
                timeView.setText(time);

                // If the timer is running, the seconds will increment
                if(running)
                {
                    seconds++;
                }

                // Code to be run again after a 1 second delay, run() will be called again
                handler.postDelayed(this, 1000);
            }

        });

    }

}

// Handler allows you to schedule code, In this case, schedule to run the stop watch app every second
// To use the handler, wrap the code you want to schedule in a runnable object, then use Handler post()
// and postDelayed() to say when you want the code to run

// Post method posts code that needs to run asap, takes one parameter, object of type Runnable (Code we want to run)
// You put the code in the run() and handeler makes sure it runs asap

// postDelayed() is code you want to run in the future, takes 2 parameters, Runnable and long
// run() cotains code we want to run, long specifies milliseconds to delay code by.