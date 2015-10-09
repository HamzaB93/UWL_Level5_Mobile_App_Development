package com.example.hamza.mythirdapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    // Create on send message funtion
    public void onSendMessage(View view){

        // get the reference from edit text and retrieve the message string
        EditText messageView = (EditText) findViewById(R.id.message);
        String messageText = messageView.getText().toString();


        // intent to go to one screen to another
        Intent intent = new Intent(this, ReceiveMessage.class);
        // add the text to the intent, with a name EXTRA MESSAGE
        // referenced as variable in the receiveMessage actitivy
        intent.putExtra(ReceiveMessage.EXTRA_MESSAGE, messageText);
        startActivity(intent);

    }
}
