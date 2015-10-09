package com.example.hamza.mythirdapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ReceiveMessage extends AppCompatActivity {

    // to be used for out intent.putExtra function trarget variable
    public static final String EXTRA_MESSAGE = "Something";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        // add libraries
        // get the intent
        Intent intent = getIntent();

        // retreive the message from the intent using getStringExtra
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        // get reference from TextView
        TextView messageView = (TextView) findViewById(R.id.message);
        // set the text of textView
        messageView.setText(messageText);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_receive_message, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
