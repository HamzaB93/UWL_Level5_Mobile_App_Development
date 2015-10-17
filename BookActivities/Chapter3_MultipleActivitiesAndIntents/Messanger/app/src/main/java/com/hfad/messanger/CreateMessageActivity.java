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

        // Android checks to see if the intent is okay
        // Start activity
        startActivity(intent);
    }
}
// HOW THIS PART WORKS
/* The user click the button which triggers onSendMessage method,
    an intent is created with the action to send plain text.
    Androis sees the intent can only be passed to activities that can handle ACTION_SEND
    ANdroid will check all the apps that can handle this intent
    If none are found an exception is thrown, if one app can it will use that, if many can
    android will give you a choser. Asks the user which they want to use, The message is then sent
    to that app
*/