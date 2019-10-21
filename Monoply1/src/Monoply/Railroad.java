package Monoply;

import java.util.ArrayList;

public class Railroad {
    int position;
    Player owner;
    boolean owned;
    int price = 200;
    String name;
    int mortVal = 100;

    public Railroad(int p, String n) {
        position = p;
        name = n;
    }

    public void setOwner(Player a) {
        owner = a;
        owned = true;
    }

    public boolean owned() {
        return owned;
    }

    public Player Owner(Player a) {
        return owner;
    }

    public String name() {
        return name;
    }

    public int rent(int owned) {
        if (owned == 1) {
            return 25;
        } else if (owned == 2) {
            return 50;
        } else if (owned == 3) {
            return 100;
        } else if (owned == 4) {
            return 200;
        } else {
            return 0;
        }
    }

    public void viewCard() {
        if (name.compareTo("Reading Railroad") == 0) {
            say("**********************************************************************");
            say("*                                                                    *");
            say("*             @@@@  @@@@  @@@@  @@@   @@@@@  @   @   @@@             *");
            say("*             @  @  @     @  @  @  @    @    @@  @  @                *");
            say("*             @@@@  @@@   @@@@  @  @    @    @ @ @  @  @@@           *");
            say("*             @ @   @     @  @  @  @    @    @  @@  @   @            *");
            say("*             @  @  @@@@  @  @  @@@   @@@@@  @   @   @@@             *");
            say("*                                                                    *");
            say("*           @@@@  @@@@  @@@@@  @     @@@@  @@@@  @@@@  @@@           *");
            say("*           @  @  @  @    @    @     @  @  @  @  @  @  @  @          *");
            say("*           @@@@  @@@@    @    @     @@@@  @  @  @@@@  @  @          *");
            say("*           @ @   @  @    @    @     @ @   @  @  @  @  @  @          *");
            say("*           @  @  @  @  @@@@@  @@@@  @  @  @@@@  @  @  @@@           *");
            say("*                                                                    *");
            say("*                                                                    *");
            say("*                                                                    *");
            say("*                                                                    *");
        } else if (name.compareTo("B&O Railroad") == 0) {
            say("**********************************************************************");
            say("*                                                                    *");
            say("*                                @@@                                 *");
            say("*                       @@@      @  @     @@@@                       *");
            say("*                       @  @      @@      @  @                       *");
            say("*                       @@@      @ @      @  @                       *");
            say("*                       @  @    @   @  @  @  @                       *");
            say("*                       @@@  @  @    @    @@@@ @                     *");
            say("*                                @@@@ @@                             *");
            say("*                                                                    *");
            say("*           @@@@  @@@@  @@@@@  @     @@@@  @@@@  @@@@  @@@           *");
            say("*           @  @  @  @    @    @     @  @  @  @  @  @  @  @          *");
            say("*           @@@@  @@@@    @    @     @@@@  @  @  @@@@  @  @          *");
            say("*           @ @   @  @    @    @     @ @   @  @  @  @  @  @          *");
            say("*           @  @  @  @  @@@@@  @@@@  @  @  @@@@  @  @  @@@           *");
            say("*                                                                    *");
            say("*                                                                    *");
            say("*                                                                    *");
            say("*                                                                    *");
        } else if (name.compareTo("Pennsylvania Railroad") == 0) {
            say("**********************************************************************");
            say("*                                                                    *");
            say("*  @@@@ @@@@ @   @ @   @ @@@@ @ @ @    @   @ @@@@ @   @ @@@@@ @@@@   *");
            say("*  @  @ @    @@  @ @@  @ @    @ @ @    @   @ @  @ @@  @   @   @  @   *");
            say("*  @@@@ @@@  @ @ @ @ @ @ @@@@ @@@ @    @   @ @@@@ @ @ @   @   @@@@   *");
            say("*  @    @    @  @@ @  @@    @  @  @     @ @  @  @ @  @@   @   @  @   *");
            say("*  @    @@@@ @   @ @   @ @@@@  @  @@@@   @   @  @ @   @ @@@@@ @  @   *");
            say("*                                                                    *");
            say("*           @@@@  @@@@  @@@@@  @     @@@@  @@@@  @@@@  @@@           *");
            say("*           @  @  @  @    @    @     @  @  @  @  @  @  @  @          *");
            say("*           @@@@  @@@@    @    @     @@@@  @  @  @@@@  @  @          *");
            say("*           @ @   @  @    @    @     @ @   @  @  @  @  @  @          *");
            say("*           @  @  @  @  @@@@@  @@@@  @  @  @@@@  @  @  @@@           *");
            say("*                                                                    *");
            say("*                                                                    *");
            say("*                                                                    *");
            say("*                                                                    *");
        } else if (name.compareTo("Short Line Railroad") == 0) {
            say("**********************************************************************");
            say("*                                                                    *");
            say("*      @@@@  @  @  @@@@  @@@@  @@@@@    @     @@@@@  @   @  @@@@     *");
            say("*      @     @  @  @  @  @  @    @      @       @    @@  @  @        *");
            say("*      @@@@  @@@@  @  @  @@@@    @      @       @    @ @ @  @@@      *");
            say("*         @  @  @  @  @  @ @     @      @       @    @  @@  @        *");
            say("*      @@@@  @  @  @@@@  @  @    @      @@@@  @@@@@  @   @  @@@@     *");
            say("*                                                                    *");
            say("*           @@@@  @@@@  @@@@@  @     @@@@  @@@@  @@@@  @@@           *");
            say("*           @  @  @  @    @    @     @  @  @  @  @  @  @  @          *");
            say("*           @@@@  @@@@    @    @     @@@@  @  @  @@@@  @  @          *");
            say("*           @ @   @  @    @    @     @ @   @  @  @  @  @  @          *");
            say("*           @  @  @  @  @@@@@  @@@@  @  @  @@@@  @  @  @@@           *");
            say("*                                                                    *");
            say("*                                                                    *");
            say("*                                                                    *");
            say("*                                                                    *");
        }

        say("*                                                                    *");
        say("*                  RENT                       25$                    *");
        say("*                  If 2 Railroads are owned   50$                    *");
        say("*                  If 3 Railroads are owned   100$                   *");
        say("*                  If 4 Railroads are owned   200$                   *");
        say("*                                                                    *");
        say("*                                                                    *");
        say("*                                                                    *");
        say("*                                                                    *");
        say("*                      Mortgage Value: 100$                          *");
        say("*                                                                    *");
        say("*                                                                    *");
        say("**********************************************************************");

    }

    public void say(String a) {
        System.out.println(a);
    }

    public void landedOn(ArrayList<Player> players, int ind) {
        Player curr = players.get(ind);
        this.viewCard();
        say("Player got to landedOn Railroad");
    }


}
