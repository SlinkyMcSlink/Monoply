

import java.util.ArrayList;
import java.util.Scanner;

public class Deed {
    int position;
    Player owner;
    boolean owned = false;
    int price;
    String name;
    int mortVal;
    String color;
    int[] neighbors;
    int[] rent;
    boolean mortgaged = false;
    int houseCost;
    int numHouses;
    Scanner inp = new Scanner(System.in);

    public Deed(int p, int pr, String n, int mv, String c, int n1, int n2, int r0, int r1, int r2, int r3, int r4, int rh, int hc) {
        position = p;
        price = pr;
        name = n;
        mortVal = mv;
        color = c;
        neighbors = new int[] {n1, n2};
        rent = new int[] {r0, r1, r2, r3, r4, rh};
        houseCost = hc;
    }

    public void viewCard() {
        say("***************************************************");
        say("   Name              -> " + name);
        say("   Color             -> " + color);
        say("   Owner             -> " + ownerName());
        say("   Cost              -> " + price);
        say("");
        say("   RENT              -> " + rent[0]);
        say("   RENT w/ 1 house   -> " + rent[1]);
        say("   RENT w/ 2 houses  -> " + rent[2]);
        say("   RENT w/ 3 houses  -> " + rent[3]);
        say("   RENT w/ 4 houses  -> " + rent[4]);
        say("   RENT w/ 1 hotel   -> " + rent[5]);
        say("");
        say("   House Cost        -> " + houseCost);
        say("   Hotel Cost        -> " + houseCost + " plus 4 houses");
        say("");
        say("   Mortgage Value    -> " + mortVal);
        say("");
        say("            RENT doubled on unimproved lots ");
        say("          when whole color group is owned by");
        say("                   the same player.");
        say("");
        say("***************************************************");
    }

    public int position() {
        return position;
    }

    public Player owner() {
        return owner;
    }

    public String ownerName() {
        if (owned) {return owner.getName();}
        else {return "None";   }
    }

    public boolean owned() {
        return owned;
    }

    public void setPosition(int pos) {
        position = pos;
    }

    public void setOwner(Player a) {
        owner = a;
    }

    public int price() {
        return price;
    }

    public String name() {
        return name;
    }

    public int mortVal() {
        return mortVal;
    }

    public String color() {
        return color;
    }

    public int neighbors(int i) {
        return neighbors[i];
    }

    public int rent(int i) {
        return rent[i];
    }

    public boolean mortgaged() {
        return mortgaged;
    }

    public void say(String a) {
        System.out.println(a);
    }

    public void landedOn(ArrayList<Player> players, int ind) {
        Player curr = players.get(ind);
        char answer;
        this.viewCard();
        //say("Player got to landedOn Deed");
        if (this.owned()) {
            say("" + owner.getName() + " owns this, please pay them the appropriate rent.");
            say("You paid: $" + rent(0) + ".");
            curr.subMoney(rent(0));
        }
        else {
            boolean done = false;
            say("This property is unowned. Would you like to buy it for $" + price + "? (y/n)");
            while (!done) {
                answer = inp.next().charAt(0);
                inp.nextLine();
                if (answer == 'y' ||  answer == 'Y') {
                    if (curr.money() > price) {
                        curr.subMoney(price);
                        owner = curr;
                        curr.addProp(this);
                        owned = true;
                        say("You bought " + name + ".");
                    }
                    else {
                        say("You don't have enough Money.");
                    }
                    done = true;
                }

                else if (answer == 'n' ||  answer == 'N') {
                    say("You did not buy " + name + ".");
                    done = true;
                }
                else {
                    say("Yes or No?");
                }

            }



        }
    }
    public String toString(){
        return name;
    }

}
