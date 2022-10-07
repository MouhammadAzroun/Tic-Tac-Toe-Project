public class Game {

    private Player p1;
    private Player p2;
    private final String[][] gameTable;


    public Game(Player p1, Player p2) {

        this.p1 = p1;
        this.p2 = p2;
        gameTable = new String[][]{
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}

        };
    }

    public String[][] getGameTable() {
        return gameTable;
    }

    public void print(){

        for(int i = 0; i< gameTable.length; i++){
            for(int j = 0; j<gameTable[i].length; j++){
                System.out.print(gameTable[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void playerChoice(String choice, String symbol) {
            for ( int i = 0; i < gameTable.length; i++) {
                for ( int j = 0; j < gameTable[i].length; j++) {
                    if (gameTable[i][j].equals(choice)) {
                        gameTable[i][j] = symbol;
                    }
                }
            }

        }



    public String winner(){


            if(gameTable[0][0].equals("X") && gameTable[0][1].equals("X") && gameTable[0][2].equals("X")){
                return "X";
            } else if (gameTable[0][0].equals("O") && gameTable[0][1].equals("O") && gameTable[0][2].equals("O")){
                return "O";
            }



            else if(gameTable[1][0].equals("X") && gameTable[1][1].equals("X") && gameTable[1][2].equals("X")){
                return "X";
            } else if (gameTable[1][0].equals("O") && gameTable[1][1].equals("O") && gameTable[1][2].equals("O")){
                return "O";
            }



            else if(gameTable[2][0].equals("X") && gameTable[2][1].equals("X") && gameTable[2][2].equals("X")){
                return "X";
            } else if (gameTable[2][0].equals("O") && gameTable[2][1].equals("O") && gameTable[2][2].equals("O")){
                return "O";
            }



            else if(gameTable[0][0].equals("X") && gameTable[1][0].equals("X") && gameTable[2][0].equals("X")){
                return "X";
            } else if (gameTable[0][0].equals("O") && gameTable[1][0].equals("O") && gameTable[2][0].equals("O")){
                return "O";
            }



           else  if(gameTable[0][1].equals("X") && gameTable[1][1].equals("X") && gameTable[2][1].equals("X")){
                return "X";
            } else if (gameTable[0][1].equals("O") && gameTable[1][1].equals("O") && gameTable[2][1].equals("O")){
                return "O";
            }



            else if(gameTable[0][2].equals("X") && gameTable[1][2].equals("X") && gameTable[2][2].equals("X")){
                return "X";
            } else if (gameTable[0][2].equals("O") && gameTable[1][2].equals("O") && gameTable[2][2].equals("O")){
                return "O";
            }


       else if(gameTable[0][0].equals("X") && gameTable[1][1].equals("X") && gameTable[2][2].equals("X")){
            return "X";
        } else if (gameTable[0][0].equals("O") && gameTable[1][1].equals("O") && gameTable[2][2].equals("O")) {
            return "O";
        }

        else if (gameTable[0][2].equals("X") && gameTable[1][1].equals("X") && gameTable[2][0].equals("X")){
            return "X";
        } else if (gameTable[0][2].equals("O") && gameTable[1][1].equals("O") && gameTable[2][0].equals("O")) {
            return "O";

        }

        else if (!gameTable[0][0].equals("1") && !gameTable[0][1].equals("2") && !gameTable[0][2].equals("3") &&
                !gameTable[1][0].equals("4") && !gameTable[1][1].equals("5") && !gameTable[1][2].equals("6") &&
                !gameTable[2][0].equals("7") && !gameTable[2][1].equals("8") && !gameTable[2][2].equals("9")) {
            return "Draw";
        }
        return null;
    }


}
