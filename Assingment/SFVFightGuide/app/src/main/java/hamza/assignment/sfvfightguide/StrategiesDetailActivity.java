package hamza.assignment.sfvfightguide;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class StrategiesDetailActivity extends Activity {

    public static final String EXTRA_STRATEGYNO = "strategyNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategies_detail);

        // Getting the strategy from the intent
        int strategyNo = (Integer) getIntent().getExtras().get(EXTRA_STRATEGYNO);
        Strategy strategy = Strategy.strategies[strategyNo];

        // Populating the views in the XML
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(strategy.getName());

        TextView tip = (TextView) findViewById(R.id.tip);
        tip.setText(strategy.getTip());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_strategies_detail, menu);
        return true;
    }
}
