

import java.util.ArrayList;

public class Utility {
    int position;
    Player owner;
    boolean owned;
    int price;
    String name;
    int mortVal = 75;
    boolean water;

    public Utility (int p, int pr, String n, boolean w) {
        position = p;
        price = pr;
        name = n;
        water = w;
    }

    public String name() {
        return name;
    }

    public void setOwner(Player a) {
        owner = a;
        owned = true;
    }

    public Player Owner(Player a) {
        return owner;
    }

    public int rent(int dr, boolean ownBoth) {
        if (ownBoth) {
            return 10*dr;
        }
        else {
            return 4*dr;
        }
    }

    public void viewCard() {
        if (water) {
            say("************************************************************");
            say("*                                                          *");
            say("*               @   @  @@@@  @@@@@  @@@@  @@@@             *");
            say("*               @   @  @  @    @    @     @  @             *");
            say("*               @ @ @  @@@@    @    @@    @@@@             *");
            say("*               @@ @@  @  @    @    @     @ @              *");
            say("*               @   @  @  @    @    @@@@  @  @             *");
            say("*                                                          *");
            say("*               @   @  @@@@  @@@@  @  @  @@@@              *");
            say("*               @   @  @  @  @  @  @ @   @                 *");
            say("*               @ @ @  @  @  @@@@  @@    @@@@              *");
            say("*               @@ @@  @  @  @ @   @ @      @              *");
            say("*               @   @  @@@@  @  @  @  @  @@@@              *");
            say("*                                                          *");
            say("*                                                          *");
            say("*                                                          *");
            say("*                                                          *");
        }
        else {
            say("************************************************************");
            say("*                                                          *");
            say("*    @@@@  @     @@@@   @@@   @@@@@  @@@@  @@@@@   @@@     *");
            say("*    @     @     @     @   @    @    @  @    @    @   @    *");
            say("*    @@@   @     @@@   @        @    @@@@    @    @        *");
            say("*    @     @     @     @   @    @    @ @     @    @   @    *");
            say("*    @@@@  @@@@  @@@@   @@@     @    @  @  @@@@@   @@@     *");
            say("*                                                          *");
            say("*                       @@@   @@@@                         *");
            say("*                      @   @  @  @                         *");
            say("*                      @      @  @                         *");
            say("*                      @   @  @  @                         *");
            say("*                       @@@   @@@@ @                       *");
            say("*                                                          *");
            say("*                                                          *");
            say("*                                                          *");
            say("*                                                          *");
        }

        say("*                                                          *");
        say("*    If ONE Utility is owned, rent is 4x the amount        *");
        say("* shown on a rolled dice when the opponent rolled, but if  *");
        say("*  BOTH Utilities are owned, rent is 10x the amount        *");
        say("*                 shown on the dice.                       *");
        say("*                                                          *");
        say("*                                                          *");
        say("*                 Mortgage Value: 75$                      *");
        say("*                                                          *");
        say("*                                                          *");
        say("************************************************************");

    }

    public void say(String a) {
        System.out.println(a);
    }

    public void landedOn(ArrayList<Player> players, int ind) {
        Player curr = players.get(ind);
        this.viewCard();
        say("Player got to landedOn Utility");
    }


}
