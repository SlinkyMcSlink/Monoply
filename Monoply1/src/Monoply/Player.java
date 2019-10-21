package Monoply;

import java.util.ArrayList;
public class Player {

    String name;
    int playerNum, money, position, rrOwned, utilOwned, jailOwned, numH, numHt;
    boolean computer, inJail, hasGOOJFC;
    ArrayList properties;


    public Player(String n, boolean comp) {
        name = n;
        money = 1500;
        position = 0;
        computer = comp;
        properties = new ArrayList();
    }

    public int money() {
        return money;
    }

    public boolean computer() {
        return computer;
    }

    public ArrayList properties() {
        return properties;
    }

    public void addProp(Deed a) {
        properties.add(a);
    }

    public boolean hasGOOJFC() {
        return hasGOOJFC;
    }

    public void getGOOJFC() {
        hasGOOJFC = true;
        jailOwned++;
        say("You now have " + jailOwned + " Get Out of Jail Free cards.");

    }

    public void passedGo() {
        money = money + 200;
        say("You have passed Go!\nYou have collected $200!");

    }

    public void useGOOJFC() {
        jailOwned--;
        if (jailOwned <= 0) {
            hasGOOJFC = false;
        }

        bail();
    }

    public void setPosition(int a) {
        position = a;
    }

    public void addMoney(int amount) {
        money = money + amount;
    }

    public void subMoney(int amount) {
        money = money - amount;
    }

    public String getName() {
        return name;
    }

    public int position() {
        return position;
    }

    public void goToJail() {
        inJail = true;
        position = 10;
    }

    public void bail() {
        inJail = false;
    }

    public boolean inJail() {
        return inJail;
    }

    public void say(String a) {
        System.out.println(a);
    }

    public void buyHouse() {
        numH++;
    }

    public void buyHotel() {
        numHt++;
    }

    public int numHouse() {
        return numH;
    }

    public int numHotel() {
        return numHt;
    }

    public String toString() {
        return name;
    }
}