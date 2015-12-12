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

    public static final String EXTRA_COMBON = "comboNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combo_detail);

        // GEtting the combo from the intent
        int comboNo = (Integer)getIntent().getExtras().get(EXTRA_COMBON);
        Combo combo = Combo.combos[comboNo];

        // Populate the ImageView
        ImageView photo = (ImageView) findViewById(R.id.photo);
        // Set the source of the image
        photo.setImageResource(combo.getImageResourceId());

        // Populate the name TextView
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(combo.getName());

        // Populate the vTrigger TextView
        TextView vTrigger = (TextView) findViewById(R.id.vTrigger);
        vTrigger.setText(combo.getvTrigger());

        // Populate the specials TextView
        TextView specials = (TextView) findViewById(R.id.specials);
        specials.setText(combo.getSpecials());

        // Populate the criticalArt TextView
        TextView criticalArt = (TextView) findViewById(R.id.criticalArt);
        criticalArt.setText(combo.getCriticalArt());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_combo_detail, menu);
        return true;
    }
}
