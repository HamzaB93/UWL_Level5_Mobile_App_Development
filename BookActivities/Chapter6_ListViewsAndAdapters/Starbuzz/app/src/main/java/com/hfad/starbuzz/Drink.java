package com.hfad.starbuzz;

/**
 * Created by hamza on 30/10/15.
 */
public class Drink
{
    // These are the properties of the drink
    private String name;
    private String description;
    private int imageResourceId;

    // Defining an array which contain Drink objects, referenced as drinks
    public static final Drink[] drinks =
        {
                // Creating new Drink objects
                // R.drawable. is getting a reference to an image from the drawbale folder called latte etc
                new Drink("Latte", "A couple of espresso shots with steamed milk", R.drawable.latte),
                new Drink("Cappuccino", "Espresso, hot milk, and a steamed milk foam", R.drawable.cappuccino),
                new Drink("Filter", "Highest quality beans roasted and brewed fresh", R.drawable.filter)
        };

    // Drink constructor will allow us to create new Drink objects
    public Drink(String name, String description, int imageResourceId)
    {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    // Getters will get the value of an objects values
    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public int getImageResourceId()
    {
        return imageResourceId;
    }

    // toString method will give a string representation
    public String toString()
    {
        return this.name;
    }
}

/*
Pure Java class. Activities will get the drink data from.
 Has an array of three drinks - composed of a name, description and an image id
 */