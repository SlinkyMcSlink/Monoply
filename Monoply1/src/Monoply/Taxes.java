package Monoply;

import java.util.ArrayList;

public class Taxes {
    String name;
    int position;
    char type;

    public Taxes(int p, String n, char t) {
        position = p;
        name = n;
        type = t;
    }

    public String name() {
        return name;
    }

    public void payTaxes(Player a) {
        if (type == 'i') {
            System.out.println("You owe Income Taxes.");
            int x = (int)(a.money()*0.10);
            if (x < 200) {
                a.subMoney(x);
                System.out.println("You have paid 10% of your money to the bank, costing you $" + x + ".");
                System.out.println("Your remaining blance is $" + a.money() +".");
            }
            else {
                a.subMoney(200);
                System.out.println("You have paid $200 to the bank.");
                System.out.println("Your remaining blance is $" + a.money() +".");
            }
        }
        else if (type == 'l') {
            a.subMoney(75);
            System.out.println("You owe Luxury Taxes.");
            System.out.println("You have paid $75 to the bank.");
            System.out.println("Your remaining blance is $" + a.money() +".");
        }
        else {
            System.out.println("Error in Taxes");
        }

    }

    public void viewCard() {
        if (type == 'i') {
            say("************************************************************");
            say("*                                                          *");
            say("*             @@@@@ @   @  @@@   @@@  @   @ @@@@           *");
            say("*               @   @@  @ @   @ @   @ @@ @@ @              *");
            say("*               @   @ @ @ @     @   @ @ @ @ @@@            *");
            say("*               @   @  @@ @   @ @   @ @   @ @              *");
            say("*             @@@@@ @   @  @@@   @@@  @   @ @@@@           *");
            say("*                                                          *");
            say("*                    @@@@@  @@@  @   @                     *");
            say("*                      @   @   @  @ @                      *");
            say("*                      @   @@@@@   @                       *");
            say("*                      @   @   @  @ @                      *");
            say("*                      @   @   @ @   @                     *");
            say("*                                                          *");
            say("*                                                          *");
            say("*                                                          *");
            say("*                                                          *");
            say("*                                                          *");
            say("*                   PAY 10% OF YOUR MONEY                  *");
            say("*                            OR                            *");
            say("*                           $200                           *");
            say("*                                                          *");
            say("*                    WHICH EVER IS LESS.                   *");
            say("*                                                          *");
            say("*                                                          *");
            say("*                                                          *");
            say("*                                                          *");
            say("************************************************************");
        }
        else {
            say("************************************************************");
            say("*                                                          *");
            say("*             @    @   @ @   @ @   @ @@@@ @   @            *");
            say("*             @    @   @  @ @  @   @ @  @ @   @            *");
            say("*             @    @   @   @   @   @ @@@@  @@@             *");
            say("*             @    @   @  @ @  @   @ @ @    @              *");
            say("*             @@@@  @@@  @   @  @@@  @  @   @              *");
            say("*                                                          *");
            say("*                    @@@@@  @@@  @   @                     *");
            say("*                      @   @   @  @ @                      *");
            say("*                      @   @@@@@   @                       *");
            say("*                      @   @   @  @ @                      *");
            say("*                      @   @   @ @   @                     *");
            say("*                                                          *");
            say("*                                                          *");
            say("*                        *   *                             *");
            say("*                         *  *     *                       *");
            say("*                                *                         *");
            say("*                     **  $$$$$$  **                       *");
            say("*                        $$$$$$$$                          *");
            say("*                      *  $$$$$$  *                        *");
            say("*                     *    $$$$    *                       *");
            say("*                          @@@@                            *");
            say("*                         @@@@@@                           *");
            say("*                        @@    @@                          *");
            say("*                        @@    @@                          *");
            say("*                        @@    @@                          *");
            say("*                         @@@@@@                           *");
            say("*                          @@@@                            *");
            say("*                                                          *");
            say("*                                                          *");
            say("*                       PAY $75.00                         *");
            say("*                                                          *");
            say("************************************************************");
        }



    }

    public void say(String a) {
        System.out.println(a);
    }

    public void landedOn(ArrayList<Player> players, int ind) {
        Player curr = players.get(ind);
        this.viewCard();
        say("Player got to landedOn Utility");
        this.payTaxes(curr);
    }


}
