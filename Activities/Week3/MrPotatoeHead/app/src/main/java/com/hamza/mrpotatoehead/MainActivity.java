package com.hamza.mrpotatoehead;

import android.app.Activity;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Method to show and hide shoes
    public void onClickPotatoe(View view)
    {
        // Reference to the images
        // The ImageView elements will comes with the methods to set visibilty
        ImageView shoes = (ImageView) findViewById(R.id.shoes);
        ImageView nose = (ImageView) findViewById(R.id.nose);
        ImageView mouth = (ImageView) findViewById(R.id.mouth);
        ImageView glasses = (ImageView) findViewById(R.id.glasses);
        ImageView eyes = (ImageView) findViewById(R.id.eyes);
        ImageView mustache = (ImageView) findViewById(R.id.mustache);
        ImageView hat = (ImageView) findViewById(R.id.hat);
        ImageView arms = (ImageView) findViewById(R.id.arms);
        ImageView ears = (ImageView) findViewById(R.id.ears);
        ImageView eyebrows = (ImageView) findViewById(R.id.eyebrows);

        // Is the button checked
        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId())
        {
            // When the checkBox is pressed
            case R.id.checkBoxShoes:

                // If the user checks the box
                if (checked)
                {
                    // Set the image to be visible
                    shoes.setVisibility(View.VISIBLE);
                }
                else
                {
                    // If its being unchecked, set to invisible
                    shoes.setVisibility(View.INVISIBLE);
                }
                // Break out of this case
                break;

            // The following cases follow the same pattern as above
            case R.id.checkBoxNose:
                if (checked)
                {
                    nose.setVisibility(View.VISIBLE);
                }
                else
                {
                    nose.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkBoxMouth:
                if (checked)
                {
                    mouth.setVisibility(View.VISIBLE);
                }
                else
                {
                    mouth.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkBoxGlasses:
                if (checked)
                {
                    glasses.setVisibility(View.VISIBLE);
                }
                else
                {
                    glasses.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkBoxEyes:
                if (checked)
                {
                    eyes.setVisibility(View.VISIBLE);
                }
                else
                {
                    eyes.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkBoxMustache:
                if (checked)
                {
                    mustache.setVisibility(View.VISIBLE);
                }
                else
                {
                    mustache.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkBoxHat:
                if (checked)
                {
                    hat.setVisibility(View.VISIBLE);
                }
                else
                {
                    hat.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkBoxArms:
                if (checked)
                {
                    arms.setVisibility(View.VISIBLE);
                }
                else
                {
                    arms.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkBoxEars:
                if (checked)
                {
                    ears.setVisibility(View.VISIBLE);
                }
                else
                {
                    ears.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkBoxEyebrows:
                if (checked)
                {
                    eyebrows.setVisibility(View.VISIBLE);
                }
                else
                {
                    eyebrows.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }
}
