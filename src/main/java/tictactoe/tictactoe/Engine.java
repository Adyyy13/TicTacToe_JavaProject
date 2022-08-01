package tictactoe.tictactoe;

import java.util.Arrays;

public class Engine {
        public String x = "X";
        public String o = "O";

        public String [] board = new String[9];

        public  String gameStateCheck() {
                String line = null;

                for (int i=0; i<8; i++) {

                        switch (i) {
                                case 0 -> line = board[0] + board[1] + board[2];
                                case 1 -> line = board[3] + board[4] + board[5];
                                case 2 -> line = board[6] + board[7] + board[8];
                                case 3 -> line = board[0] + board[3] + board[6];
                                case 4 -> line = board[1] + board[4] + board[7];
                                case 5 -> line = board[2] + board[5] + board[8];
                                case 6 -> line = board[0] + board[4] + board[8];
                                case 7 -> line = board[2] + board[4] + board[6];
                        }

                        if (line.equals("XXX")) {
                                return "X";
                        }

                        else if (line.equals("OOO")) {
                                return "O";
                        }
                }

                for (int i=0; i < 9; i++) {
                        if (Arrays.asList(board).contains(
                                String.valueOf(i+1)))
                        {break;}
                        else if (i == 8) {
                                return "draw";
                        }
                }
        return null;}

        }
