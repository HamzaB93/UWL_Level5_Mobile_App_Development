package hamza.assignment.sfvfightguide;

import android.app.Activity;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class CharacterStratDetailActivity extends Activity {

    // Acts as a reference to the array index
    public static final String EXTRA_CHARSTRATNO = "charStratNo";

    // When the Activity is created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_strat_detail);

        // Getting the character strategy from the intent
        int charStratNo = (Integer) getIntent().getExtras().get(EXTRA_CHARSTRATNO);

        // Put the indexed object from the intent
        CharacterStrat charStrats = CharacterStrat.charStrats[charStratNo];

        // Populating the TextView
        // First getting refernce to the TextView by identifying the id
        TextView name = (TextView) findViewById(R.id.name);

        // Then setting the text retrieved from the itent
        name.setText(charStrats.getName());

        // Getting refernce to the image view with the id
        ImageView photo = (ImageView) findViewById(R.id.photo);
        // Setting the image provided in the intent
        photo.setImageResource(charStrats.getImageResource());

        // Retrieving the reference to the text view with the id
        TextView tip = (TextView) findViewById(R.id.tip);
        // Setting the text
        tip.setText(charStrats.getTip());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_character_strat_detail, menu);
        return true;
    }

}
