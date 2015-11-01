package com.hfad.gridlayoutapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import android.widget.EditText;

public class GridLayout extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);
    }

    /*
    public void onClickSend(View view)
    {
        // Get reference to both EditText Views
        EditText toView = (EditText) findViewById(R.id.to_hint);
        EditText messageView = (EditText) findViewById(R.id.message_to);

        // Getting the text of both EditText Views
        String toText = toView.getText().toString();
        String messageText = messageView.getText().toString();

        // Creating an intent with send action
        Intent intent = new Intent(Intent.ACTION_SEND);

        // Setting the type of plain text
        intent.setType("text/plain");

        // Adding extra to the intent which will be the text of both EditTextViews
        intent.putExtra(Intent.EXTRA_TEXT, toText, messageText);
        intnet.putExtra(Intent.Extra_Text, messageText);
    }
    */
}
