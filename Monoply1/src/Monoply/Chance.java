package Monoply;
import java.util.Random;
import java.util.ArrayList;

public class Chance {
    Random rand = new Random();
    ArrayList<Player> players;

    public Chance() {}

    public void landedOn(ArrayList<Player> p, int index) {
        players = p;
        Player a = players.get(index);
        int cardNum = rand.nextInt(16);

        switch(cardNum) {
            case 0:
                say("************************************************************");
                say("*                                                          *");
                say("*           @@@   @  @   @@   @   @   @@@   @@@@           *");
                say("*          @   @  @  @  @  @  @@  @  @   @  @              *");
                say("*          @      @@@@  @@@@  @ @ @  @      @@@@           *");
                say("*          @   @  @  @  @  @  @  @@  @   @  @              *");
                say("*           @@@   @  @  @  @  @   @   @@@   @@@@           *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*              Advance to Go (Collect $200)                *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("************************************************************");

                payDay(a, 200);
                a.setPosition(0);
                say("" + a.getName() + ", you have arrived at GO! Here is 200$.");
                break;

            case 1:
                say("************************************************************");
                say("*                                                          *");
                say("*           @@@   @  @   @@   @   @   @@@   @@@@           *");
                say("*          @   @  @  @  @  @  @@  @  @   @  @              *");
                say("*          @      @@@@  @@@@  @ @ @  @      @@@@           *");
                say("*          @   @  @  @  @  @  @  @@  @   @  @              *");
                say("*           @@@   @  @  @  @  @   @   @@@   @@@@           *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                 Advance to Illinois Ave                  *");
                say("*              If you pass Go, collect $200                *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("************************************************************");

                advance(a, 24, false);
                break;

            case 2:
                say("************************************************************");
                say("*                                                          *");
                say("*           @@@   @  @   @@   @   @   @@@   @@@@           *");
                say("*          @   @  @  @  @  @  @@  @  @   @  @              *");
                say("*          @      @@@@  @@@@  @ @ @  @      @@@@           *");
                say("*          @   @  @  @  @  @  @  @@  @   @  @              *");
                say("*           @@@   @  @  @  @  @   @   @@@   @@@@           *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*               Advance to St. Charles Place               *");
                say("*               If you pass Go, collect $200               *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("************************************************************");

                advance(a, 11, false);
                break;

            case 3:
                say("************************************************************");
                say("*                                                          *");
                say("*           @@@   @  @   @@   @   @   @@@   @@@@           *");
                say("*          @   @  @  @  @  @  @@  @  @   @  @              *");
                say("*          @      @@@@  @@@@  @ @ @  @      @@@@           *");
                say("*          @   @  @  @  @  @  @  @@  @   @  @              *");
                say("*           @@@   @  @  @  @  @   @   @@@   @@@@           *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*      Advance token to nearest Utility. If unowned,       *");
                say("*   you may buy it from the Bank. If owned, throw dice     *");
                say("*   and pay owner a total ten times the amount thrown.     *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("************************************************************");

                advToNearest(a, false, true);
                break;

            case 4:
                say("************************************************************");
                say("*                                                          *");
                say("*           @@@   @  @   @@   @   @   @@@   @@@@           *");
                say("*          @   @  @  @  @  @  @@  @  @   @  @              *");
                say("*          @      @@@@  @@@@  @ @ @  @      @@@@           *");
                say("*          @   @  @  @  @  @  @  @@  @   @  @              *");
                say("*           @@@   @  @  @  @  @   @   @@@   @@@@           *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*   Advance token to the nearest Railroad and pay owner    *");
                say("*   twice the rental to which he/she {he} is otherwise     *");
                say("*      entitled. If Railroad is unowned, you may buy       *");
                say("*                    it from the Bank.                     *");
                say("*                                                          *");
                say("*                                                          *");
                say("************************************************************");

                advToNearest(a, true,false);
                break;

            case 5:
                say("************************************************************");
                say("*                                                          *");
                say("*           @@@   @  @   @@   @   @   @@@   @@@@           *");
                say("*          @   @  @  @  @  @  @@  @  @   @  @              *");
                say("*          @      @@@@  @@@@  @ @ @  @      @@@@           *");
                say("*          @   @  @  @  @  @  @  @@  @   @  @              *");
                say("*           @@@   @  @  @  @  @   @   @@@   @@@@           *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*               Bank pays you dividend of $50              *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("************************************************************");

                payDay(a, 50);
                break;

            case 6:
                say("************************************************************");
                say("*                                                          *");
                say("*           @@@   @  @   @@   @   @   @@@   @@@@           *");
                say("*          @   @  @  @  @  @  @@  @  @   @  @              *");
                say("*          @      @@@@  @@@@  @ @ @  @      @@@@           *");
                say("*          @   @  @  @  @  @  @  @@  @   @  @              *");
                say("*           @@@   @  @  @  @  @   @   @@@   @@@@           *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                    Get Out of Jail Free                  *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("************************************************************");

                jailCard(a);
                break;

            case 7:
                say("************************************************************");
                say("*                                                          *");
                say("*           @@@   @  @   @@   @   @   @@@   @@@@           *");
                say("*          @   @  @  @  @  @  @@  @  @   @  @              *");
                say("*          @      @@@@  @@@@  @ @ @  @      @@@@           *");
                say("*          @   @  @  @  @  @  @  @@  @   @  @              *");
                say("*           @@@   @  @  @  @  @   @   @@@   @@@@           *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                     Go Back 3 Spaces                     *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("************************************************************");

                backUp(a, 3);
                break;

            case 8:
                say("************************************************************");
                say("*                                                          *");
                say("*           @@@   @  @   @@   @   @   @@@   @@@@           *");
                say("*          @   @  @  @  @  @  @@  @  @   @  @              *");
                say("*          @      @@@@  @@@@  @ @ @  @      @@@@           *");
                say("*          @   @  @  @  @  @  @  @@  @   @  @              *");
                say("*           @@@   @  @  @  @  @   @   @@@   @@@@           *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*             Go to Jail–Go directly to Jail–              *");
                say("*           Do not pass Go, do not collect $200            *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("************************************************************");

                advance(a, 0, true);
                break;

            case 9:
                say("************************************************************");
                say("*                                                          *");
                say("*           @@@   @  @   @@   @   @   @@@   @@@@           *");
                say("*          @   @  @  @  @  @  @@  @  @   @  @              *");
                say("*          @      @@@@  @@@@  @ @ @  @      @@@@           *");
                say("*          @   @  @  @  @  @  @  @@  @   @  @              *");
                say("*           @@@   @  @  @  @  @   @   @@@   @@@@           *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*       Make general repairs on all your property–         *");
                say("*       For each house pay $25–For each hotel $100         *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("************************************************************");

                repairs(a, 25, 100);
                break;

            case 10:
                say("************************************************************");
                say("*                                                          *");
                say("*           @@@   @  @   @@   @   @   @@@   @@@@           *");
                say("*          @   @  @  @  @  @  @@  @  @   @  @              *");
                say("*          @      @@@@  @@@@  @ @ @  @      @@@@           *");
                say("*          @   @  @  @  @  @  @  @@  @   @  @              *");
                say("*           @@@   @  @  @  @  @   @   @@@   @@@@           *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                   Pay poor tax of $15                    *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("************************************************************");

                paid(a, 15);
                break;

            case 11:
                say("************************************************************");
                say("*                                                          *");
                say("*           @@@   @  @   @@   @   @   @@@   @@@@           *");
                say("*          @   @  @  @  @  @  @@  @  @   @  @              *");
                say("*          @      @@@@  @@@@  @ @ @  @      @@@@           *");
                say("*          @   @  @  @  @  @  @  @@  @   @  @              *");
                say("*           @@@   @  @  @  @  @   @   @@@   @@@@           *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*             Take a trip to Reading Railroad–             *");
                say("*               If you pass Go, collect $200               *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("************************************************************");

                advance(a, 5, false);
                break;

            case 12:
                say("************************************************************");
                say("*                                                          *");
                say("*           @@@   @  @   @@   @   @   @@@   @@@@           *");
                say("*          @   @  @  @  @  @  @@  @  @   @  @              *");
                say("*          @      @@@@  @@@@  @ @ @  @      @@@@           *");
                say("*          @   @  @  @  @  @  @  @@  @   @  @              *");
                say("*           @@@   @  @  @  @  @   @   @@@   @@@@           *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*               Take a walk on the Boardwalk–              *");
                say("*                Advance token to Boardwalk                *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("************************************************************");

                advance(a, 39, false);
                break;

            case 13:
                say("************************************************************");
                say("*                                                          *");
                say("*           @@@   @  @   @@   @   @   @@@   @@@@           *");
                say("*          @   @  @  @  @  @  @@  @  @   @  @              *");
                say("*          @      @@@@  @@@@  @ @ @  @      @@@@           *");
                say("*          @   @  @  @  @  @  @  @@  @   @  @              *");
                say("*           @@@   @  @  @  @  @   @   @@@   @@@@           *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*       You have been elected Chairman of the Board–       *");
                say("*                   Pay each player $50                    *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("************************************************************");

                payOut(index, 50);
                break;

            case 14:
                say("************************************************************");
                say("*                                                          *");
                say("*           @@@   @  @   @@   @   @   @@@   @@@@           *");
                say("*          @   @  @  @  @  @  @@  @  @   @  @              *");
                say("*          @      @@@@  @@@@  @ @ @  @      @@@@           *");
                say("*          @   @  @  @  @  @  @  @@  @   @  @              *");
                say("*           @@@   @  @  @  @  @   @   @@@   @@@@           *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*       Your building and loan matures—Collect $150        *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("************************************************************");

                payDay(a, 150);
                break;

            case 15:
                say("************************************************************");
                say("*                                                          *");
                say("*           @@@   @  @   @@   @   @   @@@   @@@@           *");
                say("*          @   @  @  @  @  @  @@  @  @   @  @              *");
                say("*          @      @@@@  @@@@  @ @ @  @      @@@@           *");
                say("*          @   @  @  @  @  @  @  @@  @   @  @              *");
                say("*           @@@   @  @  @  @  @   @   @@@   @@@@           *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*    You have won a crossword competition—Collect $100     *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("*                                                          *");
                say("************************************************************");

                payDay(a, 100);
                break;

            default:
                System.out.println("Error in Chance card occured.");
        }
    }

    public void jailCard(Player a) {
        a.getGOOJFC();
        say("" + a.getName() + ", you got a Get Out of Jail Free card!");
    }

    public void advance(Player a, int fp, boolean jail) {
        if (jail) {
            a.setPosition(10);
            say("" + a.getName() + ", you are in jail! Too bad.");
            a.goToJail();
        }
        else {
            if (a.position() > fp) {
                a.setPosition(fp);
                a.addMoney(200);
                say("" + a.getName() + ", you have arrived at " + a.position() + " and passed GO! Here is 200$.");
            }
            else if (a.position() < fp) {
                a.setPosition(fp);
                say("" + a.getName() + ", you have arrived at " + a.position() + ".");
            }
        }
    }

    public void advToNearest(Player a, boolean railroad, boolean utility) {
        int newP = 0;
        int d = 0;
        int index = 0;
        int curP = a.position();
        int smallest = 40;
        int[] rr = new int[] {5, 15, 25, 35};
        int[] util = new int[] {12, 28};
        if (railroad) {
            for (int i = 0; i < 4; i++) {
                d = Math.abs(curP - rr[i]);
                if (d < smallest) {
                    smallest = d;
                    newP = rr[i];
                    index = i;
                }
            }
            a.setPosition(newP);
            say("" + a.getName() + ", you have arrived at " + a.position() + ".");


        }
        if (utility) {
            for (int i = 0; i < 2; i++) {
                d = Math.abs(curP - rr[i]);
                if (d < smallest) {
                    smallest = d;
                    newP = rr[i];
                    index = i;
                }
            }
            a.setPosition(newP);
            say("" + a.getName() + ", you have arrived at " + a.position() + ".");

        }


    }

    public void backUp(Player a, int spaces) {
        a.setPosition(a.position() - spaces);
        say("" + a.getName() + ", you wen back " + spaces+" spaces and are now on " + a.position() + ".");
    }
    public void paid(Player a, int amount) {
        a.subMoney(amount);
        say("" + a.getName() + ", you have lost $" + amount+ ".");
        say("Your new balance is $" + a.money() + ".");
    }

    public void repairs(Player a, int h, int hot) {
        int x = (h * a.numHouse()) + (hot * a.numHotel());
        a.subMoney(x);
        say("" + a.getName() + ", you have lost $" + x + ".");
        say("Your new balance is $" + a.money() + ".");
    }

    public void payOut(int ind, int amount) {
        int x = amount * 3;
        Player a = players.get(ind);
        a.subMoney(x);
        for (int i = 0; i < 4; i++){
            if(i != ind) {
                players.get(i).addMoney(amount);
            }
            else {}
        }
        say("" + a.getName() + ", you have lost $" + x + ", while all other players gained $" + amount + ".");
        say("Your new balance is $" + a.money() + ".");
    }

    public void payDay(Player a, int amount) {
        a.addMoney(amount);
        say("" + a.getName() + ", you have gained $" + amount + ".");
        say("Your new balance is $" + a.money() + ".");
    }

    public void say(String a) {
        System.out.println(a);
    }

    public String name() {
        return "Chance";
    }


}
