package hamza.assignment.sfvfightguide;

/**
 * Created by hamza on 12/12/15.
 */
public class Strategy
{
    // Properties
    // Name of the tip
    String name;
    // The tip itself
    String tip;

    // Array of strategies
    public static final Strategy[] strategies =
            {
                    // Objects have a name, and tips
                    new Strategy("Blocking","Block! Block! and BLOCK!\n\nTo master the game you need to learn how to block attacks.\n\n" +
                            "It is great being good at attacking, but while dishing out the attacks, your opponent will be beating you mentally" +
                            "by blocking everything you throw at them.\n\nThe best offense in the game is a great defence. If you are able to block" +
                            " well, you will open up new ways of winning the match by starting a counter attack.\nBlocking make a fighter!\n\n" +
                            "Be aware though that blocking normal moves want deplete your health, but specials will cause some damage to occur" +
                            " to your fighter."),
                    new Strategy("Movement", "Dashing: When pressing Fwd, Fwd, you will dash. This is great for closing" +
                            "distance between you an your opponent.\n\nDon't use this too much as you will be attacked if your" +
                            "opponent sees a pattern in your movements.\n\nAlternate your movement with ordinary forward movement and" +
                            " dashing to put pressure on the opponent. This will cause them to move back. If successful they'll move" +
                            "all the way to the corner of the stage.\n\nDon't always move forward, somtimes its best to Dash back to" +
                            "catch your breath in a fight.\n\nLearn to manage your movement on the stage, it's sometimes best to not move," +
                            "rather than keep moving an getting hit."),
                    new Strategy("Jumping", "Jumping is a great way to close the gap between you an the other fighter.\n\n" +
                            "This is also a great mechanic to avoid fireballs and some ground attacks that are too risky to block.\n\n" +
                            "When jumping, you can also hit an attack button. This is great when you want to catch an opponent off guard. " +
                            "This can backfire if your timing is wrong and you will be punished by the oppoent with an anti-air.\n\n" +
                            "You can use your jumping attack to confuse the opponent. Depending on the attack you use, you can jump right over" +
                            "the other fighter and hit them from behind. This is a cross up. This can be blocked, so be careful."),
                    new Strategy("Anti Air", "Any character you select has an anti air.\n\nThis is an attack that can punish a fighter" +
                            "that jumps at you.\n\nThe anti air can be any attack that you use from the ground to stop a jumper.\n\n" +
                            "The attack can be any attack, ranging from a crouching attack, to a special move.\n\nYou should explore" +
                            "different anti airs with each character in the training mode to stop people jumping in on you."),
                    new Strategy("Using Attacks","Every character has normal attack and special attacks.\n\nYou need to experiment with" +
                            "what attack works best in a certain situation.\n\nSome characters normal attacks can be great when your at" +
                            "somewhat of a distance away from the opponent. This is mid to long range.\n\nWhen you are spaced appropriately" +
                            ", your far normals can be great for hitting the other fighter and getting good spacing between each other.\n\n" +
                            "Some specials are a great way of putting pressure on the opponent.\n\nSpecials like fireballs are great for keeping" +
                            " distance and applying pressure.\n\nExperiment with different characters and find what normals they hae that are affective" +
                            "at differnt ranges and what specials they can use to pressure opponents.")
            };

    // Constructor to create an object
    public Strategy(String name, String tip)
    {
        this.name = name;
        this.tip = tip;
    }

    // Getters to be used to get the information for an object
    public String getName()
    {
        return name;
    }
    public String getTip()
    {
    return tip;
    }

    // toString to populate the listView
    public String toString()
    {
        return this.name;
    }
}
