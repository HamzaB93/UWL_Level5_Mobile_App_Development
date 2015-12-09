package bitsandpizzas.hfad.bitsandpizzas;

public class Pizza
{
    private String name;
    private String description;
    private int imageResourceId;

    public static final Pizza[] pizzas =
            {
                    new Pizza("Diavolo", "Its a pizza, what else", R.drawable.diavolo),
                    new Pizza("Funghi", "Its\nanother\npizza!!", R.drawable.funghi)
            };

    // Constructor
    public Pizza(String name, String description, int imageResourceId)
    {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    // Getters for getting the value of an object values
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

    // toString
    public String toString()
    {
        return this.name;
    }
}