package hamza.assignment.sfvfightguide;

/**
 * Created by hamza on 11/12/15.
 */
public class Combo
{
    // Properties for each character Combo object
    String name;
    int imageResourceId;
    String vTrigger;
    String specials;
    String criticalArt;

    // Array that contains the Combo objects referenced as combos
    public static final Combo[] combos =
            {
                // Making new Combo objects
                new Combo("Ryu",
                        R.drawable.ryu,
                        "Activate: HP + HK\nVSkill: MP + MK\nVReversal: Fwd + Punch x3\n",
                            "Hadouken: Dwn, Fwd + Punch\nShoryuken: Fwd, Dwn, Fwd + Punch\nTasumaki (Can be done in air)" +
                            ": Dwn, Bk + Kick\n",
                        "Skinku Hadouken: Dwn, Fwd, Dwn, Fwd + Punch"),
                new Combo("Chun-Li", R.drawable.chunli, "Activate: HP + HK\nVSkill: MP + MK\n",
                            "Kikoken: Charged Bk, Fwd + Punch\nHyakuretsukyaku (Can be done in air): Dwn, Bk + Kick\n" +
                            "Spinning Bird Kick: Charged Dwn, Up + Kick\n", "Hyokusen: Dwn, Fwd, Dwn, Fwd + Kick"),
                new Combo("Nash", R.drawable.nash, "Activate: HP + HK\nVSkill: MP + Mk (With a direction)\nVReversal: Fwd + Punch x3\n",
                            "Sonic Boom: Dwn, Fwd + Punch\nSonic Scythe: Dwn, Bk + Kick\nMoonsault Slash: Dwn, Fwd + Kick\n" +
                                    "Tragedy Assault: Fwd, Dwn, Fwd + Kick\n","Judgement Saber: Dwn, Bk, Dwn, Bk + Kick"),
                new Combo("Bison", R.drawable.bison, "Activate: HP + HK\"VSkill: MP + MK\nVReversal: Fwd + Punch x3\n",
                            "Psycho Blast: Charged Bk, Fwd + Punch\nDouble Knee Press: Charged Bk, Fwd + Kick\n" +
                            "Head Press: Charged Dwn, Up + Kick\nSomersault Skull Driver: Punch after head press hits\n" +
                            "Devil Reverse: Punch Before head press hits\nPsycho Inferno: Charged Dwn, Up + Punch\n",
                            "Ultimate Psycho Crusher: Dwn, Fwd, Dwn, Fwd + Kick"),
                new Combo("Cammy", R.drawable.cammy, "Activate: HP + HK\nVSkill: MP + MK\nVReversal: Fwd + Punch x3\n",
                            "Spiral Arrow: Dwn, Fwd + Kick\nCannon Spike: Fwd, Dwn, Fwd + Kick\nCannon Strike (In air): Dwn, Bk + Kick\n" +
                            "Hooligan Combination: Bk, Dwn, Fwd + Punch\nRazor Edge Slicer: No Input during hooligan combination\n" +
                            "Fatal Leg Twister: LP or LK during hooligan combination, close in air\nCannon Strike: Kick during hooligan combincation\n",
                            "Cross Stinger Assault: Dwn, Bk, Dwn, Bk + Kick"),
                new Combo("Birdie", R.drawable.birdie, "Activate: HP + HK\nVSkill: MP + MK (Can be done while holding Bk or Dwn)\nVReversal: Fwd + Punch x3\n",
                            "Bull Head: Bk, Dwn, Fwd + Punch\nBull Horn: Hold Punch and release\nHanging Chain: Dwn, Fwd + Kick\nKilling Head: Fwd, Dwn, Bk" +
                                    " + Punch (Close to opponent)\nBull Revenger: Fwd, Dwn, Bk + Kick\n", "Cross Stinger Assault: Dwn, Fwd, Dwn, Fwd + Punch")
            };

    // Contructor for Combo objects
    public Combo(String name, int imageResourceId, String vTrigger, String special, String criticalArt)
    {
        this.name = name;
        this.imageResourceId = imageResourceId;
        this.vTrigger = vTrigger;
        this.specials = special;
        this.criticalArt = criticalArt;
    }

    // Getters
    public String getName()
    {
        return name;
    }
    public int getImageResourceId()
    {
        return imageResourceId;
    }
    public String getvTrigger()
    {
        return vTrigger;
    }
    public String getSpecials()
    {
        return specials;
    }
    public String getCriticalArt()
    {
        return criticalArt;
    }

    // toString for string representation
    public String toString()
    {
        return this.name;
    }
}
