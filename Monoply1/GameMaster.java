

import java.util.*;

public class GameMaster {

    public static Scanner input = new Scanner(System.in);
    public static Game currentGame;
    public static ArrayList<Game> games = new ArrayList<Game>();

    public static void main(String[] args) {
        startMenu();
    }

    public static void startMenu() {


        char in;
        boolean done = false;


        say("*******************************************************************");
        say("* *************************************************************** *");
        say("* *                                                             * *");
        say("* *          @   @  @@@  @  @  @@@  @@@  @@@  @   @  @          * *");
        say("* *          @@ @@ @   @ @@ @ @   @ @ @ @   @ @   @  @          * *");
        say("* *          @ @ @ @   @ @ @@ @   @ @@@ @   @ @     @           * *");
        say("* *          @   @ @   @ @  @ @   @ @   @   @ @     @           * *");
        say("* *          @   @  @@@  @  @  @@@  @    @@@  @@@@  @           * *");
        say("* *                                                             * *");
        say("* *     ///////////////////////////////////////////////////     * *");
        say("* *                                                             * *");
        say("* *                                                             * *");
        say("* *                     ### ###  #  ### ###                     * *");
        say("* *                     #    #  # # # #  #                      * *");
        say("* *                     ###  #  ### ###  #                      * *");
        say("* *                       #  #  # # ##   #                      * *");
        say("* *                     ###  #  # # # #  #                      * *");
        say("* *                    *****                                    * *");
        say("* *                                                             * *");
        say("* *                     #    ###   #   ###                      * *");
        say("* *                     #   #   # # #  #  #                     * *");
        say("* *                     #   #   # ###  #  #                     * *");
        say("* *                     #   #   # # #  #  #                     * *");
        say("* *                     ###  ###  # #  ###                      * *");
        say("* *                    *****                                    * *");
        say("* *                                                             * *");
        say("* *               Enter 's' or 'l' ('q' to quit)                * *");
        say("* *                                                             * *");
        say("* *************************************************************** *");
        say("*******************************************************************");

        while(!done) {
            in = input.next().charAt(0);
            if (in == 's' || in ==  'S') {
                say("Starting game...");
                //done = true;
                decidePlayers();
            }
            else if (in == 'l' || in ==  'L') {
                say("Loading games...");
                //done = true;
                loadGames();
            }
            else if (in == 'q' || in ==  'Q') {
                say("Goodbye!");
                System.exit(0);
            }
            else {
                say("Please enter 's' or 'l'.");
            }
        }
    }

    public static void decidePlayers() {

        boolean done = false;
        char in;
        String n1, n2, n3, n4, gn;

        say("*******************************************************************");
        say("* *************************************************************** *");
        say("* *                                                             * *");
        say("* *     @ @  @@  @   @                                          * *");
        say("* *     @ @ @  @ @   @                                          * *");
        say("* *     @@@ @  @ @ @ @                                          * *");
        say("* *     @ @ @  @ @@ @@                                          * *");
        say("* *     @ @  @@  @   @                                          * *");
        say("* *                                                             * *");
        say("* *         @   @  @  @  @ @ @                                  * *");
        say("* *         @@ @@ @ @ @@ @ @ @                                  * *");
        say("* *         @ @ @ @@@ @ @@  @                                   * *");
        say("* *         @   @ @ @ @  @  @                                   * *");
        say("* *         @   @ @ @ @  @  @                                   * *");
        say("* *                                             @@@             * *");
        say("* *               @@@ @    @  @ @ @@@ @@@ @@@  @   @            * *");
        say("* *               @ @ @   @ @ @ @ @   @ @ @       @             * *");
        say("* *               @@@ @   @@@  @  @@  @@@ @@@    @              * *");
        say("* *               @   @   @ @  @  @   @@    @    @              * *");
        say("* *               @   @@@ @ @  @  @@@ @ @ @@@                   * *");
        say("* *                                              @              * *");
        say("* *                                                             * *");
        say("* *                                                             * *");
        say("* *                                                             * *");
        say("* *           @@         @@@        @@@         @@              * *");
        say("* *          @ @        @   @      @   @       @ @              * *");
        say("* *            @           @          @       @@@@@             * *");
        say("* *            @          @        @   @         @              * *");
        say("* *          @@@@@      @@@@@       @@@          @              * *");
        say("* *         *******    *******    *******    *******            * *");
        say("* *                                                             * *");
        say("* *                                                             * *");
        say("* *                                                             * *");
        say("* *                                                             * *");
        say("* *            Enter a number up to 4 ('q' to quit)             * *");
        say("* *                                                             * *");
        say("* *************************************************************** *");
        say("*******************************************************************");



        while(!done) {
            in = input.next().charAt(0);
            input.nextLine();
            if (in == '1') {
                say("What name would you like to save your game as?");
                gn = input.nextLine();
                say("Starting game " + gn + "...");
                say("Please Enter your name Player 1: ");
                n1 = input.nextLine();
                n2 = "CP - Jimmy";
                n3 = "CP - Margret";
                n4 = "CP - Thomas";
                Game a = new Game(1, gn, n1, n2, n3, n4, false, true, true, true);
                games.add(a);
                a.start();
            }
            else if (in == '2') {
                say("What name would you like to save your game as?");
                gn = input.nextLine();
                say("Starting game " + gn + "...");
                say("Please Enter your name Player 1: ");
                n1 = input.nextLine();
                say("Please Enter your name Player 2: ");
                n2 = input.nextLine();
                n3 = "CP - Margret";
                n4 = "CP - Thomas";
                Game b = new Game(2, gn, n1, n2, n3, n4, false, false, true, true);
                games.add(b);
                b.start();
            }
            else if (in == '3') {
                say("What name would you like to save your game as?");
                gn = input.nextLine();
                say("Starting game " + gn + "...");
                say("Please Enter your name Player 1: ");
                n1 = input.nextLine();
                say("Please Enter your name Player 2: ");
                n2 = input.nextLine();
                say("Please Enter your name Player 3: ");
                n3 = input.nextLine();
                n4 = "CP - Thomas";
                Game c = new Game(3, gn, n1, n2, n3, n4, false, false, false, true);
                games.add(c);
                c.start();
            }
            else if (in == '4') {
                say("What name would you like to save your game as?");
                gn = input.nextLine();
                say("Starting game " + gn + "...");
                say("Please Enter your name Player 1: ");
                n1 = input.nextLine();
                say("Please Enter your name Player 2: ");
                n2 = input.nextLine();
                say("Please Enter your name Player 3: ");
                n3 = input.nextLine();
                say("Please Enter your name Player 4: ");
                n4 = input.nextLine();
                Game d = new Game(4, gn, n1, n2, n3, n4, false, false, false, false);
                games.add(d);
                d.start();
            }
            else if (in == 'q') {
                say("Goodbye!");
                System.exit(0);
            }
            else {
                say("Please enter '1', '2', '3', or '4' (q to quit).");
            }
        }
    }

    public static void loadGames() {
        say("Games Loading...");
    }

    public static void say(String a) {
        System.out.println(a);
    }
}
