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

        // Populating the views in the XML
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(charStrats.getName());

        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(charStrats.getImageResource());

        TextView tip = (TextView) findViewById(R.id.tip);
        tip.setText(charStrats.getTip());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_character_strat_detail, menu);
        return true;
    }

}
