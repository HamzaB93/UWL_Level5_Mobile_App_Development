package com.hfad.messanger;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends Activity {

    // Oncreate method gets called whe the activity is created
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    // Call the onSendMessage from the button when its clicked
    public void onSendMessage(View view)
    {
        // Getting a reference to the EditText from the GUI
        EditText messageView = (EditText) findViewById(R.id.message);

        // Converting the text from the messageView to text byt getting the text the converting to string
        String messageText = messageView.getText().toString();

        // Creating the intent to send! This is implicit so any app that can use this can do it
        Intent intent = new Intent(Intent.ACTION_SEND);

        // The type will be of plain text
        intent.setType("text/plain");

        // Adding extra to the intent which is the text messageView > messageText
        intent.putExtra(Intent.EXTRA_TEXT, messageText);

        // Getting the chooser string element
        String chooserTitle = getString(R.string.chooser);

        // This will display the chooser title >> Send message...
        // This will also be what the users chosen app
        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);

        // Android checks to see if the intent is okay
        // Start activity the user chose
        startActivity(chosenIntent);
    }
}
// HOW THIS PART WORKS
/* The user click the button which triggers onSendMessage method,
    an intent is created with the action to send plain text.
    Android sees the intent can only be passed to activities that can handle ACTION_SEND
    Android will check all the apps that can handle this intent
    If none are found an exception is thrown, if one app can it will use that, if many can
    android will give you a choser.
    The choser now has a title. The choser will now always ask what app they would like.
    Asks the user which they want to use, The message is then sent
    to that app. This user interaction sends a EXLICIT intent. Android sends this intent to the app
    the user chose and the activity starts.
*/