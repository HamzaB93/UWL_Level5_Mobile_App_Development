package hamza.assignment.sfvfightguide;

/**
 * Created by hamza on 12/12/15.
 */
public class CharacterStrat
{
    // Properties
    String name;
    int imageResource;
    String tip;

    public static final CharacterStrat[] charStrats = {

            // Constructing objects that will be in the array
            new CharacterStrat("Ryu", R.drawable.ryu,
                    "Ryu is a high damage character. You will make great use of his punch attacks.\n\n" +
                            "Use Ryu's medium punch for great pokes fairly close range. If you land one of these from" +
                            " standing, you can capitalise and land a target combo.\n\nHis standing hard punch is a high risk move." +
                            " If it gets blocked, you will be stunned for a long time and will be punished, so be careful with it.\n\nMake" +
                            " use of his crouching MK. With this you can follow up with a fireball.\n\nFireballs with Ryu are moves you" +
                            " will always need to use. Due to their speed that they travel accross the screen, this will be great from" +
                            " long ranges.\n\nMix up which fireballs you use with different puch buttons.\n\nRyu's Shoryuken is an amazing" +
                            " high damage special and can also be used as an anti-air\n\nWhen you have a full V-Trigger bar use it right away." +
                            " With his V-Trigger all specials get a HUGE damage boost. You can charge his fireball to do huge damamge."),
            new CharacterStrat("Chun-Li", R.drawable.chunli,
                    "Chun-Li's kicks can win you games.\n\nHer normal kicks have a huge range. Use her HK from distance from a great" +
                            " poke.\n\nChun-Li's crouching HP is a little unusual. It has two hits and is fairly quick. This is a great" +
                            " move to use after a jumping attack.\n\nAnother great move to use is her lightning legs (Dwn, Bk + Kick)," +
                            " especially her EX version.\n\nMake use of her movement speed. You can easily close gaps between you and the" +
                            " opponents. After knocking the other fighter down, start creeping forward and move the fighter while they" +
                            " are on the ground.\n\nChun-Li's V-Trigger amplifies all of her attacks by dealing double the amount hits." +
                            " This is great for applying pressure to the opponent."),
            new CharacterStrat("Nash", R.drawable.nash,
                    "Nash is slow but has deadly normal attacks.\n\nNash's movement is really really bad in this game. BUT there is still" +
                            " hope! His dash forward closes the gap between you and your opponent. But remember to be careful when dashing" +
                            " as you may get caught off guard.\n\nNash's normal attacks start up really quickly. Experiment with his target combos." +
                            "\n\nWith the lack of movement, his V-Trigger more than compensates. He is able to do a teleport. Depending on the" +
                            " direction you press along with HP + HK, you will teleport in a certain direction."),
            new CharacterStrat("Bison", R.drawable.bison,
                    "Bison has some great special moves with high damage.\n\nBison's special Double Knee Press is a charged move that is really really" +
                            " quick. This can be used to catch a player off guard. If a player blocks this attack, there is still room for you to" +
                            " block.\n\nBison's Head Press is a great move to hit the opponent on their head. This is a confusing move for the" +
                            " opponent. This emulates a jumping attack and can be hard for the opponent to block.\n\nHis V-Trigger is similar" +
                            " to Nash's as it is a teleport/ dash. This is great way for mixing up his movement between jumping and using his trigger."),
            new CharacterStrat("Cammy", R.drawable.cammy,
                    "Cammy is fast!\n\nThis is going to be short section.\n\nJust learn when to use her Spiral Arrow and Cannon Spike." +
                            " These two moves will win you games. These two move are devastating.\n\n All of Cammy's specials can be applied" +
                            " in any situation.\n\nCammy's V-Trigger is similar to Ryu's as it amplifies her specials. Be careful though." +
                            " Using special moves will deplete your V-Trigger bar a great deal. You will most likely only be able to use 3" +
                            " special moves which will deplete the bar completely."),
            new CharacterStrat("Birdie", R.drawable.birdie,
                    "Birdie has amazing range.\n\nTo master Birdie, getting used to what range each normal works at. His standing HP is great from" +
                            " long range. And the range for this move is a huge.\n\nThe main tactic that works for Birdie, which is very different" +
                            " from most characters is that you don't want to go near your oppponent. Keeping far away from the other fighter and" +
                            " applying pressure from a far is a great way of putting off the opponent.\n\nHis V-Skil itself is very useful. This" +
                            " move changes depending on the input. You can either press MP + MK to throw a projectile along the ground or hold back while" +
                            " pressing the two buttons. This will cause a trap to be thrown on the ground that will stun the opponent.\n\nThe ordinary V-Skill" +
                            " should be your go-to move from distance." )
    };

    // Constructor for CharacterStrat objects
    public CharacterStrat(String name, int imageResource, String tip)
    {
        this.name = name;
        this.imageResource = imageResource;
        this.tip = tip;
    }

    // Getters
    public String getName()
    {
        return name;
    }
    public int getImageResource()
    {
        return imageResource;
    }
    public String getTip()
    {
        return tip;
    }

    // toString for a string representation of the object
    public String toString()
    {
        return this.name;
    }
}
