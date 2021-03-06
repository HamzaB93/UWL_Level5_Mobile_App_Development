package bitsandpizzas.hfad.bitsandpizzas;

import android.app.Activity;
import android.app.ListFragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

// List fragment with no XML, because list fragments have their own layout
public class PizzaFragment extends ListFragment {

    // Populate the view with the String array for pizzas
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                inflater.getContext(),
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.pizzas));
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onListItemClick(ListView listView, View view, int position, long id)
    {
        Intent intent = new Intent(getActivity(), PizzaDetailActivity.class);
        intent.putExtra(PizzaDetailActivity.EXTRA_PIZZANO, (int) id);
        startActivity(intent);
    }
}
