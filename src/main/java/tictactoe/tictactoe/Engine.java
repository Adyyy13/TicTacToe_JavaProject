package tictactoe.tictactoe;



public class Engine {


        protected static String[] board = new String[9];




        public String gameStateCheck() {
                String line = null;

                for (int i = 0; i < 8; i++) {

                        switch (i) {
                                case 0 ->  line = board[0] + board[1] + board[2];
                                case 1 ->  line = board[3] + board[4] + board[5];
                                case 2 ->  line = board[6] + board[7] + board[8];
                                case 3 ->  line = board[0] + board[3] + board[6];
                                case 4 ->  line = board[1] + board[4] + board[7];
                                case 5 ->  line = board[2] + board[5] + board[8];
                                case 6 ->  line = board[0] + board[4] + board[8];
                                case 7 ->  line = board[2] + board[4] + board[6];
                        }

                        if (line.equals("XXX")) {
                                return "X";
                        } else if (line.equals("OOO")) {
                                return "O";
                        }
                }

                int drawCheck = 0;

                for (int i = 0; i < 9; i++) {

                        if (board[i] != null) {
                        if (board[i].equals("X") || board[i].equals("O")) {
                                drawCheck++;
                                if (drawCheck == 9) {
                                        return "draw";
                                }
                        }
                        }
                }

                return "ZZZZZZZZZ";

        }
}
