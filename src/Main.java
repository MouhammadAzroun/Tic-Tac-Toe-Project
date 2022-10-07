import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int X=0;
        int O=0;
        String n = null;
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Tic-Tac... ");
        System.out.println("First player name: ");
        Player p1 = new PlayerX(scan.next());
        System.out.println("Second player name: ");
        Player p2 = new PlayerO(scan.next());

        System.out.println(p1.name + " is the 'X' player. \n" + p2.name + " is the 'O' player.");


        int s=0;
            while (s==0) {
                Game game = new Game(p1, p2);
                game.print();
            do {
                int o = 0;
                int t = 0;
                int d = 0;
                while (d == 0) {
                    if (game.winner() != null && game.winner().equals("Draw")) {
                        d = 1;
                    } else {
                        if (game.winner() != null && game.winner().equals("O")) {
                            d = 1;
                        } else {
                            String c1 = scan.next();

                            if (!c1.equals("1") && !c1.equals("2") && !c1.equals("3") && !c1.equals("4") && !c1.equals("5") && !c1.equals("6") && !c1.equals("7") && !c1.equals("8") && !c1.equals("9")) {
                                System.out.println("Please , enter a valid number");
                            } else if (Integer.parseInt(c1) >= 1 || Integer.parseInt(c1) <= 9) {
                                for (int i = 0; i < game.getGameTable().length; i++) {
                                    for (int j = 0; j < game.getGameTable()[i].length; j++) {
                                        if (game.getGameTable()[i][j].equals(c1)) {
                                            o = i;
                                            t = j;
                                        }
                                    }
                                }
                                if (game.getGameTable()[o][t].equals("X") || game.getGameTable()[o][t].equals("O")) {

                                    System.out.println("Position is already occupied");
                                } else {
                                    game.playerChoice(c1, p1.playerSymbol);
                                    game.print();
                                    n = game.winner();
                                    d = 1;
                                }
                            }
                        }
                    }
                }

                int u = 0;
                while (u == 0) {
                    if (game.winner() != null && game.winner().equals("Draw")) {
                        u = 1;
                    } else {
                        if (game.winner() != null && game.winner().equals("X")) {
                            u = 1;
                        } else {
                            String c2 = scan.next();
                            if (!c2.equals("1") && !c2.equals("2") && !c2.equals("3") && !c2.equals("4") && !c2.equals("5") && !c2.equals("6") && !c2.equals("7") && !c2.equals("8") && !c2.equals("9")) {
                                System.out.println("Please , enter a valid number");
                            } else if (Integer.parseInt(c2) >= 1 || Integer.parseInt(c2) <= 9) {
                                for (int i = 0; i < game.getGameTable().length; i++) {
                                    for (int j = 0; j < game.getGameTable()[i].length; j++) {
                                        if (game.getGameTable()[i][j].equals(c2)) {
                                            o = i;
                                            t = j;
                                        }
                                    }
                                }
                                if (game.getGameTable()[o][t].equals("X") || game.getGameTable()[o][t].equals("O")) {
                                    System.out.println("Position is already occupied");
                                } else {
                                    game.playerChoice(c2, p2.playerSymbol);
                                    game.print();
                                    n = game.winner();
                                    u = 1;
                                }

                            }
                        }
                    }
                }
            } while (n == null);
            if (n.equals("X")) {
                System.out.println(p1.getName() + " won the game");
            } else if (n.equals("O")) {
                System.out.println(p2.getName() + " won the game");

            } else {
                System.out.println("Draw");
            }

            int s2=0;



            if (n.equals("X")){
              X++;
            }
            else if(n.equals("O")){
                O++;
            }
            System.out.println(p1.getName()+ " Won"+ " "+ X+ " Times");
            System.out.println(p2.getName()+ " Won"+ " "+ O+" Times");
            System.out.println("Do you want to play again?(y/n)");
            while (s2==0) {
                String answer = scan.next();
                if (answer.equals("y")) {
                    s = 0;
                    s2 = 1;
                } else if (answer.equals("n")) {
                    s = 1;
                    s2 = 1;
                } else {
                    System.out.println("Please write y/n");
                    s2=0;
                }
            }
        }
    }
}