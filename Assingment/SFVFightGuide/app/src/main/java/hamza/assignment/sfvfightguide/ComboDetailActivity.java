package hamza.assignment.sfvfightguide;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ComboDetailActivity extends Activity {

    // Acts as a reference to the item that was clicked in the list activity
    public static final String EXTRA_COMBON = "comboNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combo_detail);

        // Getting the combo from the intent
        int comboNo = (Integer)getIntent().getExtras().get(EXTRA_COMBON);
        Combo combo = Combo.combos[comboNo];

        // Referencing the ImageView
        ImageView photo = (ImageView) findViewById(R.id.photo);
        // Setting the image from the intent
        photo.setImageResource(combo.getImageResourceId());

        // Referencing the TextView by id
        TextView name = (TextView) findViewById(R.id.name);
        // Setting the text
        name.setText(combo.getName());

        // Referencing the next TextView by id
        TextView vTrigger = (TextView) findViewById(R.id.vTrigger);
        // Set the the text to the view provided by the intent
        vTrigger.setText(combo.getvTrigger());

        // Referencing the TextView to populate by id
        TextView specials = (TextView) findViewById(R.id.specials);
        // Setting the text
        specials.setText(combo.getSpecials());

        // Referencing the final TextView by id
        TextView criticalArt = (TextView) findViewById(R.id.criticalArt);
        // Setting the text
        criticalArt.setText(combo.getCriticalArt());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_combo_detail, menu);
        return true;
    }
}
