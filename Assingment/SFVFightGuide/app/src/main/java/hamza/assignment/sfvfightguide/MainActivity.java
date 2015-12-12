package hamza.assignment.sfvfightguide;

import android.app.Activity;
import android.app.Notification;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

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

    // Making the combo image respond to click with an intent
    public void onClickCombo(View view)
    {
        // The intent starts from the MainActivity, and gets sent to the ComboCategoryActivity
        Intent intent = new Intent(MainActivity.this, ComboCategoryActivity.class);

        // Start the intent
        startActivity(intent);
    }

    // Making the strategies image repsond to clicks
    public void onClickStrategies(View view)
    {
        // Intent from the MainActivity to the StrategiesCategoryAcitivty
        Intent intent = new Intent(MainActivity.this, StrategiesCategoryActivity.class);

        // Start the intent
        startActivity(intent);
    }
}
