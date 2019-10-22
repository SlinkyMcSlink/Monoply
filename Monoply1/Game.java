

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game{
    int numReal;
    int numTurns;
    int numComp;
    Player currentPlayer;
    ArrayList<Player> players;
    String gameName;
    ArrayList board;
    Scanner input = new Scanner(System.in);
    char choice;
    Random rand = new Random();
    boolean winner = false;

    Corner s0 = new Corner(0, "Go");
    Deed s1 = new Deed(1,60, "Mediterranean Avenue", 30, "Brown", 40, 3, 2, 10, 30, 90, 160, 250, 50);
    CommunityChest s2 = new CommunityChest();
    Deed s3 = new Deed(3,60, "Baltic Avenue", 30, "Brown", 40, 1, 4, 20, 60, 180, 320, 450,50);
    Taxes s4 = new Taxes(4, "Income Tax", 'i');

    Railroad s5 = new Railroad(5, "Reading Railroad");
    Deed s6 = new Deed(6, 100, "Oriental Avenue", 50, "Light Blue", 8, 9, 6, 30, 90, 270, 400, 550, 50);
    Chance s7 = new Chance();
    Deed s8 = new Deed(8, 100, "Vermont Avenue", 50, "Light Blue", 6, 9, 6, 30, 90, 270, 400, 550, 50);
    Deed s9 = new Deed(9, 120, "Connecticut Avenue", 60, "Light Blue", 6, 9, 6, 30, 90, 270, 400, 550, 50);

    Corner s10 = new Corner(10, "Just Visiting/Jail");
    Deed s11 = new Deed(11, 140, "St. Charles Place", 70, "Purple", 13, 14, 10, 50, 150, 450, 625, 750, 100);
    Utility s12 = new Utility(12, 150, "Electric Company", false);
    Deed s13 = new Deed(13, 140, "States Avenue", 70, "Purple", 11, 14, 10, 50, 150, 450, 625, 750, 100);
    Deed s14 = new Deed(14, 160, "Virginia Avenue", 80, "Purple", 11, 13, 12, 60, 180, 500, 700, 900, 100);

    Railroad s15 = new Railroad(15, "Pennsylvania Railroad");
    Deed s16 = new Deed(16, 180, "St. James Place", 90, "Orange", 18, 19, 14, 70, 200, 550, 750, 950, 100);
    CommunityChest s17 = new CommunityChest();
    Deed s18 = new Deed(18, 180, "Tennessee Avenue", 90, "Orange", 16, 19, 14, 70, 200, 550, 750, 950, 100);
    Deed s19 = new Deed(19, 200, "New York Avenue", 100, "Orange", 16, 18, 16, 80, 220, 600, 800, 1000, 100);

    Corner s20 = new Corner(20, "Free Parking");
    Deed s21 = new Deed(21, 220, "Kentucky Avenue", 110, "Red", 23, 24, 18, 90, 250, 700, 875, 1050, 150);
    Chance s22 = new Chance();
    Deed s23 = new Deed(23, 220, "Indiana Avenue", 110, "Red", 21, 24, 18, 90, 250, 700, 875, 1050, 150);
    Deed s24 = new Deed(24, 240, "Illinois Avenue", 120, "Red", 21, 23, 20, 100, 300, 750, 925, 1100, 150);

    Railroad s25 = new Railroad(25, "B&O Railroad");
    Deed s26 = new Deed(26, 260, "Atlantic Avenue", 130, "Yellow", 27, 29, 22, 110, 330, 800, 975, 1150, 150);
    Deed s27 = new Deed(27, 260, "Ventnor Avenue", 130, "Yellow", 26, 29, 22, 110, 330, 800, 975, 1150, 150);
    Utility s28 = new Utility(28, 150, "Water Works", true);
    Deed s29 = new Deed(29, 280, "Marvin Gardens", 140, "Yellow", 26, 27, 24, 120, 360, 850, 1025, 1200, 150);

    Corner s30 = new Corner(30, "Go to Jail");
    Deed s31 = new Deed(31, 300, "Pacific Avenue", 150, "Green", 32, 34, 26, 130, 390, 900, 1100, 1275, 200);
    Deed s32 = new Deed(32, 300, "North Carolina Avenue", 150, "Green", 31, 34, 26, 130, 390, 900, 1100, 1275, 200);
    CommunityChest s33 = new CommunityChest();
    Deed s34 = new Deed(34, 320, "Pennsylvania Avenue", 160, "Green", 31, 32, 28, 150, 450, 1000, 1200, 1400, 200);

    Railroad s35 = new Railroad(35, "Short Line Railroad");
    Chance s36 = new Chance();
    Deed s37 = new Deed(37, 350, "Park Place", 175, "Dark Blue", 40, 39, 35, 175, 500, 1100, 1300, 1500, 200);
    Taxes s38 = new Taxes(38, "Luxury Tax", 'l');
    Deed s39 = new Deed(39, 400, "Park Place", 200, "Dark Blue", 40, 37, 50, 200, 600, 1400, 1700, 2000, 200);

    public Game(int p, String gn, String n1, String n2, String n3, String n4, boolean c1, boolean c2, boolean c3, boolean c4) {
        numReal = p;
        gameName = gn;
        numTurns = 1;
        Player a = new Player(n1, c1);
        Player b = new Player(n2, c2);
        Player c = new Player(n3, c3);
        Player d = new Player(n4, c4);
        players = new ArrayList<Player>();
        players.add(a);
        players.add(b);
        players.add(c);
        players.add(d);
        say("" + p + " player game created");
    }

    public void start() {
        boolean done;
        say("**********************************************************");
        say("*                                                        *");
        say("*           WE WILL NOW DECIDE WHO GOES FIRST.           *");
        say("*                                                        *");
        say("*                                                        *");
        say("*          Each player will roll a 6 sided die,          *");
        say("*                                                        *");
        say("*               highest number goes first.               *");
        say("*                                                        *");
        say("**********************************************************");

        int[] rolls = new int[4];
        int[] drolls = new int[4];
        int highestNum = 0;
        int highestI = 0;
        int dupli = 0;


        for (int i = 0; i < 4; i++) {
            done = false;
            say("**********************************************************");
            say("");
            say("          " + players.get(i) + ", roll the dice!");
            say("");
            say("");
            say("           Enter 'r' to Roll ('q' to Quit)");
            say("");
            say("**********************************************************");

            while (!done) {
                choice = input.next().charAt(0);
                input.nextLine();
                if (choice == 'r' || choice == 'R') {
                    int x = rand.nextInt(6) +1;
                    say("you rolled a " + (x));
                    rolls[i] = x;
                    if (x >= highestNum) {
                        if (x == highestNum) {
                            drolls[dupli] = i+1;
                            dupli++;
                        }
                        else{
                            highestNum = x;
                            highestI = i;
                            dupli = 1;
                            drolls[0] = i+1;
                        }
                    }
                    done = true;

                }
                else if (choice == 'q' || choice == 'Q') {
                    say("Goodbye!");
                    System.exit(0);
                }
                else {
                    say("Roll the dice!");
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            say("Player " + (i + 1) + "'s roll: " + rolls[i]);
        }

        if (dupli >= 2) {
            System.out.print("Tie breaker between player(s): ");
            for (int i = 0; i < dupli; i++) {
                System.out.print("" + (drolls[i]) + " ");
            }
            say("");
            say("**********************************************************");
            say("");
            say("          Players enter 't' for the tie breaker!");
            say("");
            say("");
            say("                      ('q' to Quit)");
            say("");
            say("**********************************************************");
            done = false;
            int h = 0;
            int w = 0;
            int d = 0;
            highestNum = 0;
            highestI = 0;
            dupli = 0;
            while (!done) {
                choice = input.next().charAt(0);
                input.nextLine();

                if (choice == 't' || choice == 'T') {
                    for (int i = 0; i < dupli; i++) {
                        int x = rand.nextInt(6) +1;
                        say("Player " + drolls[i] + " rolled a " + x);
                        rolls[i] = x;
                        if (x >=h) {
                            if (x == h) {
                                d++;
                            }
                            else{
                                d = 1;
                                w = drolls[i]-1;
                            }

                        }
                    }
                    if (d == 1) {
                        done = true;
                        highestI = w;
                    }
                    else {
                        say("Tie again, reroll.");
                    }

                }
                else if (choice == 'q' || choice == 'Q') {
                    say("Goodbye!");
                    System.exit(0);
                }
                else {
                    say("Roll the dice!");
                }
            }
        }
        say("Highest was Player " + (highestI +1) + ".");


        say("**********************************************************");
        say("*                                          @@@           *");
        say("*          @@@@  @@@@   @@   @@@   @   @  @   @          *");
        say("*          @  @  @     @  @  @  @  @   @      @          *");
        say("*          @@@@  @@@   @@@@  @  @   @ @     @            *");
        say("*          @ @   @     @  @  @  @    @      @            *");
        say("*          @  @  @@@@  @  @  @@@     @                   *");
        say("*                                           @            *");
        say("*                                                        *");
        say("*           Enter 'y' to Start ('q' to Quit)             *");
        say("*                                                        *");
        say("**********************************************************");

        done = false;
        while (!done) {
            choice = input.next().charAt(0);
            input.nextLine();
            if (choice == 'y' || choice == 'Y') {
                say("Starting Game...");
                done = true;
            }
            else if (choice == 'q' || choice == 'Q') {
                say("Goodbye!");
                System.exit(0);
            }
            else {
                say("Enter 'y' or 'q'.");
            }
        }
        play(highestI);
    }


    public void say(String a) {
        System.out.println(a);
    }

    public void play(int sp) {
        Player current = players.get(sp);
        int ci = sp;
        char ch;
        boolean done;
        ArrayList temp = new ArrayList();

        say("The game has begun!");
        while (!winner) {
            done = false;
            if (!current.computer()) {


                while (!done) {
                    say("" + current.getName() + ", it's your turn.  \nWhat would you like to do?\n");
                    say("**********************************************************");
                    say("*                                                        *");
                    say("*                 v : View Properties                    *");
                    say("*                                                        *");
                    say("*                      t : Trade                         *");
                    say("*                                                        *");
                    say("*                      m : Money                         *");
                    say("*                                                        *");
                    say("*                    r : roll dice                       *");
                    say("*                                                        *");
                    say("*                                                        *");
                    say("*                    ('q' to Quit)                       *");
                    say("*                                                        *");
                    say("**********************************************************");

                    ch = input.next().charAt(0);
                    input.nextLine();

                    if ( ch == 'v' || ch == 'V') {
                        // say("Got to View Properties.");
                        temp = current.properties();
                        say("Currently owned properties:");
                        for (int i = 0; i < temp.size(); i++) {
                            say("(" + i + ") " + temp.get(i).toString());
                        }
                        say("");
                    }
                    else if ( ch == 't' || ch == 'T') {
                        say("Got to Trade.");

                    }
                    else if ( ch == 'm' || ch == 'M') {
                        say("**********************************************************");
                        say("");
                        say("");
                        say("              Hi, " + current.getName() + ", you have");
                        say("");
                        say("                   " + current.money());
                        say("");
                        say("           Dollars in your account!");
                        say("");
                        say("");
                        say("**********************************************************");
                    }
                    else if ( ch == 'r' || ch == 'R') {
                        // add check for jail

                        int x = rand.nextInt(6) + 1;
                        int y = rand.nextInt(6) + 1;
                        say("You rolled a " + x + " and a  " + y + ", which adds up to " + (x+y) + "!");
                        turn(current, (x+y), ci);
                        // add check for doubles

                        done = true;
                    }
                    else if ( ch == 'q' || ch == 'Q') {
                        say("Bye!");
                        System.exit(0);
                    }
                    else {
                        say("That's not an option, choose from the menu.");
                    }
                }
            }
            else {
                say("" + current.getName() + "'s turn.");
                done = true;
            }

            if(ci == 3) {
                ci = 0;
            }
            else{
                ci++;
            }

            current = players.get(ci);

        }

    }

    public void turn(Player cur, int roll, int index) {
        int pos = cur.position();

        for (int i = 0; i < roll; i++) {
            if (pos == 39) {
                cur.setPosition(0);
                cur.passedGo();
                pos = 0;
            }
            else {
                cur.setPosition(pos + 1);
                pos = cur.position();
            }
        }

        switch(pos) {
            case 0:
                say("You landed on "  + s0.name() + ".");
                s0.landedOn(players, index);
                break;

            case 1:
                say("You landed on "  + s1.name() + ".");
                s1.landedOn(players, index);
                break;

            case 2:
                say("You landed on "  + s2.name() + ".");
                s2.landedOn(players, index);
                break;

            case 3:
                say("You landed on "  + s3.name() + ".");
                s3.landedOn(players, index);
                break;

            case 4:
                say("You landed on "  + s4.name() + ".");
                s4.landedOn(players, index);
                break;

            case 5:
                say("You landed on "  + s5.name() + ".");
                s5.landedOn(players, index);
                break;

            case 6:
                say("You landed on "  + s6.name() + ".");
                s6.landedOn(players, index);
                break;

            case 7:
                say("You landed on "  + s7.name() + ".");
                s7.landedOn(players, index);
                break;

            case 8:
                say("You landed on "  + s8.name() + ".");
                s8.landedOn(players, index);
                break;

            case 9:
                say("You landed on "  + s9.name() + ".");
                s9.landedOn(players, index);
                break;

            case 10:
                say("You landed on "  + s10.name() + ".");
                s10.landedOn(players, index);
                break;

            case 11:
                say("You landed on "  + s11.name() + ".");
                s11.landedOn(players, index);
                break;

            case 12:
                say("You landed on "  + s12.name() + ".");
                s12.landedOn(players, index);
                break;

            case 13:
                say("You landed on "  + s13.name() + ".");
                s13.landedOn(players, index);
                break;

            case 14:
                say("You landed on "  + s14.name() + ".");
                s14.landedOn(players, index);
                break;

            case 15:
                say("You landed on "  + s15.name() + ".");
                s15.landedOn(players, index);
                break;

            case 16:
                say("You landed on "  + s16.name() + ".");
                s16.landedOn(players, index);
                break;

            case 17:
                say("You landed on "  + s17.name() + ".");
                s17.landedOn(players, index);
                break;

            case 18:
                say("You landed on "  + s18.name() + ".");
                s18.landedOn(players, index);
                break;

            case 19:
                say("You landed on "  + s19.name() + ".");
                s19.landedOn(players, index);
                break;

            case 20:
                say("You landed on "  + s20.name() + ".");
                s20.landedOn(players, index);
                break;

            case 21:
                say("You landed on "  + s21.name() + ".");
                s21.landedOn(players, index);
                break;

            case 22:
                say("You landed on "  + s22.name() + ".");
                s22.landedOn(players, index);
                break;

            case 23:
                say("You landed on "  + s23.name() + ".");
                s23.landedOn(players, index);
                break;

            case 24:
                say("You landed on "  + s24.name() + ".");
                s24.landedOn(players, index);
                break;

            case 25:
                say("You landed on "  + s25.name() + ".");
                s25.landedOn(players, index);
                break;

            case 26:
                say("You landed on "  + s26.name() + ".");
                s26.landedOn(players, index);
                break;

            case 27:
                say("You landed on "  + s27.name() + ".");
                s27.landedOn(players, index);
                break;

            case 28:
                say("You landed on "  + s28.name() + ".");
                s28.landedOn(players, index);
                break;

            case 29:
                say("You landed on "  + s29.name() + ".");
                s29.landedOn(players, index);
                break;

            case 30:
                say("You landed on "  + s30.name() + ".");
                s30.landedOn(players, index);
                break;

            case 31:
                say("You landed on "  + s31.name() + ".");
                s31.landedOn(players, index);
                break;

            case 32:
                say("You landed on "  + s32.name() + ".");
                s32.landedOn(players, index);
                break;

            case 33:
                say("You landed on "  + s33.name() + ".");
                s33.landedOn(players, index);
                break;

            case 34:
                say("You landed on "  + s34.name() + ".");
                s34.landedOn(players, index);
                break;

            case 35:
                say("You landed on "  + s35.name() + ".");
                s35.landedOn(players, index);
                break;

            case 36:
                say("You landed on "  + s36.name() + ".");
                s36.landedOn(players, index);
                break;

            case 37:
                say("You landed on "  + s37.name() + ".");
                s37.landedOn(players, index);
                break;

            case 38:
                say("You landed on "  + s38.name() + ".");
                s38.landedOn(players, index);
                break;

            case 39:
                say("You landed on "  + s39.name() + ".");
                s39.landedOn(players, index);
                break;

        }
    }



}
