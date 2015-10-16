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

        // Creating the intent to send to the ReceiveMessageActivity class
        Intent intent = new Intent(this, ReceiveMessageActivity.class);

        // Putting extra infromation in the intent to send to android
        // Adding text to the intent and naming it message
        // As this is extra information, receiveMessage activity needs to retrieve this info
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageText);

        // Android checks to see if the intent is okay
        // Start activity ReceiveMessageActivity
        startActivity(intent);
    }
}
// HOW THIS PART WORKS
/* The user click the button which triggers onSendMessage method,
    an intent is created to start the ReceiveMessage activity,An exra part is given to the intent
    Android checks if the intent is okay then starts ReceiveMessage
    The message is then displayed on the next screen straight away because it is in the onCreate method.
 */