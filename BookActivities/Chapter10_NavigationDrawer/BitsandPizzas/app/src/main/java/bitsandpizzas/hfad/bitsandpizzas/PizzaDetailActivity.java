package bitsandpizzas.hfad.bitsandpizzas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class PizzaDetailActivity extends AppCompatActivity {

    public static final String EXTRA_PIZZANO = "pizzaNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_detail);

        // Getting the pizza from the intent made in PizzaFragment
        int pizzaNo = (Integer) getIntent().getExtras().get(EXTRA_PIZZANO);
        Pizza pizzas = Pizza.pizzas[pizzaNo];

        // Populate the pizza image
        ImageView photo = (ImageView) findViewById(R.id.photo);
        // Set the srouce of the image
        photo.setImageResource(pizzas.getImageResourceId());
        // Giving the photo a description
        photo.setContentDescription(pizzas.getName());

        // Populate the name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(pizzas.getName());

        // Populate the description
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(pizzas.getDescription());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pizza_detail, menu);
        return true;
    }
}
