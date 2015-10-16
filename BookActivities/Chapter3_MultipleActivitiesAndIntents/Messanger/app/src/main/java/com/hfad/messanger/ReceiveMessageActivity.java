package com.hfad.messanger;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ReceiveMessageActivity extends Activity {

    // EXTRA_MESSAGE is the name of the extra values we're passing in the intent
    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        // Get the message/ intent that was sent from CreateMessageActivity
        Intent intent = getIntent();

        // Get the information from the the intent
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);

        // Get reference of the TextView
        TextView messageView = (TextView) findViewById(R.id.message);

        // Set the messageView text to the messageText sent from the intent
        messageView.setText(messageText);
    }
}
