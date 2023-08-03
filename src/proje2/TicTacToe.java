package proje2;

import java.util.Scanner;

 import java.util.Scanner;
        public class TicTacToe {
            public char[][] board;
            public char currentPlayer;

            public TicTacToe() {
                board = new char[3][3];
                currentPlayer = 'X';
                initializeBoard();
            }

            public void initializeBoard() {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        board[i][j] = '-';
                    }
                }
            }

            public void printBoard() {
                System.out.println("-----------");
                for (int i = 0; i < 3; i++) {
                    System.out.print("| ");
                    for (int j = 0; j < 3; j++) {
                        System.out.print(board[i][j] + " | ");
                    }
                    System.out.println();
                    System.out.println("-----------");
                }
            }

            public boolean isBoardFull() {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (board[i][j] == '-') {
                            return false;
                        }
                    }
                }
                return true;
            }

            public boolean makeMove(int row, int col) {
                if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
                    board[row][col] = currentPlayer;
                    return true;
                } else {
                    return false;
                }
            }

            public boolean checkWin() {
                // Diagonal checks
                if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
                    return true;
                }
                if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
                    return true;
                }
                // Row and column checks
                for (int i = 0; i < 3; i++) {
                    if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                        return true;
                    }
                    if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                        return true;
                    }
                }
                return false;
            }

            public void switchPlayer() {
                if (currentPlayer == 'X') {
                    currentPlayer = 'O';
                } else {
                    currentPlayer = 'X';
                }
            }

            public static void main(String[] args) {
                TicTacToe game = new TicTacToe();
                Scanner scanner = new Scanner(System.in);
                boolean playAgain = true;

                while (playAgain) {
                    game.initializeBoard();
                    boolean gameEnd = false;

                    while (!gameEnd) {
                        game.printBoard();
                        System.out.println("Player " + game.currentPlayer + ", enter your move (row and column): ");
                        int row = scanner.nextInt();
                        int col = scanner.nextInt();

                        boolean validMove = game.makeMove(row, col);
                        if (!validMove) {
                            System.out.println("Invalid move! Try again.");
                            continue;
                        }

                        if (game.checkWin()) {
                            game.printBoard();
                            System.out.println("Player " + game.currentPlayer + " wins!");
                            gameEnd = true;
                        } else if (game.isBoardFull()) {
                            game.printBoard();
                            System.out.println("It's a tie!");
                            gameEnd = true;
                        } else {
                            game.switchPlayer();
                        }
                    }

                    System.out.println("Do you want to play again? (Yes/No)");
                    String playAgainResponse = scanner.next();
                    playAgain = playAgainResponse.equalsIgnoreCase("Yes");
                }

                System.out.println("Thanks for playing!");
                scanner.close();
            }
        }



        /*
    }
        arrMatris = new String[3][3];
        bilgisayarBilgisayarOyna();
    }

    public static void bilgisayarBilgisayarOyna() {
        Random rnd = new Random();
        basla();
        olasiHamleler();
        for (int i = 0; i < 9; i++) {
            kazananVarMı() = kazananVarMı();
            if (!kazananVarMı()) {
                int randomHamle = rnd.nextInt(arrHamleler.size());
                String koordinat = arrHamleler.get(randomHamle);
                arrHamleler.remove(randomHamle);

                System.out.println(koordinat);
                int satir = Integer.parseInt("" + koordinat.charAt(0));
                int sutun = Integer.parseInt("" + koordinat.charAt(2));
                oyna(!hamle, satir, sutun);
                yazdir();
            } else {
                String kazanan;
                if (hamle) {
                    kazanan = "o";
                } else {
                    kazanan = "x";
                }
                System.out.println("Oyun Bitti.Kazanan " + kazanan);
                return;
            }
            System.out.println("");
        }
        System.out.println("Oyun Bitti.Oyun Berabere.");
    }

    public static void ikiKisilikOyna() {

        Scanner giris = new Scanner(System.in);
//System.out.println(arrMatris.length);
        basla();
        yazdir();
        for (int i = 0; i < 9; i++) {
            kazananVarMı = kazananVarMı();
            if (!kazananVarMı) {
                System.out.println("Hamle Girin:");
                String koordinat = giris.nextLine();
                System.out.println(koordinat);
                int satir = Integer.parseInt("" + koordinat.charAt(0));
                int sutun = Integer.parseInt("" + koordinat.charAt(2));
                System.out.println(satir + "," + sutun);
                oyna(!hamle, satir, sutun);
                yazdir();
            } else {
                String kazanan;
                if (hamle) {
                    kazanan = "o";
                } else {
                    kazanan = "x";
                }
                System.out.println("Oyun Bitti.Kazanan " + kazanan);
                return;
            }

        }
        System.out.println("Oyun Bitti.Oyun Berabere.");
    }

    public static void olasiHamleler() {
        arrHamleler = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                String strHamle = i + " " + j;
                arrHamleler.add(strHamle);
// System.out.println(strHamle);
            }
        }
    }

    public static void yazdir() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arrMatris[i][j]);
            }
            System.out.println("");
        }
    }

    public static void basla() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrMatris[i][j] = "- ";
            }
        }
    }

    public static void oyna(boolean x, int i, int j) {
        if (arrMatris[i - 1][j - 1].equalsIgnoreCase("- ")) {
            if (x) {
                arrMatris[i - 1][j - 1] = "o ";
            } else {
                arrMatris[i - 1][j - 1] = "x ";
            }
            hamle = !hamle;
        } else {
            System.out.println("Buraya Hamle Yapamazsınız");
        }
    }

    public static boolean kazananVarMı() {
        String harf = arrMatris[1][1];
        if (!harf.equalsIgnoreCase("- ")) {
            if (arrMatris[1][0].equals(harf) && arrMatris[1][2].equals(harf)) {
                System.out.println("orta yatay");
                return true;
            } else if (arrMatris[2][0].equals(harf) && arrMatris[0][2].equals(harf)) {
                System.out.println("sag ustten,sol alta capraz");
                return true;
            } else if (arrMatris[0][0].equals(harf) && arrMatris[2][2].equals(harf)) {
                System.out.println("sol ustten,sag alta capraz");
                return true;
            } else if (arrMatris[0][1].equals(harf) && arrMatris[2][1].equals(harf)) {
                System.out.println("orda dikey");
                return true;
            }
        }

        harf = arrMatris[0][0];
        if (!harf.equalsIgnoreCase("- ")) {
            if (arrMatris[0][1].equals(harf) && arrMatris[0][2].equals(harf)) {
                System.out.println("ust yatay");
                return true;
            } else if (arrMatris[1][0].equals(harf) && arrMatris[2][0].equals(harf)) {
                System.out.println("ust dikey");
                return true;
            }
        }

        harf = arrMatris[2][0];
        if (!harf.equalsIgnoreCase("- ")) {

            if (arrMatris[2][1].equals(harf) && arrMatris[2][2].equals(harf)) {
                System.out.println("alt yatay");
                return true;
            }
        }

        harf = arrMatris[0][2];
        if (!harf.equalsIgnoreCase("- ")) {
            if (arrMatris[1][2].equals(harf) && arrMatris[2][2].equals(harf)) {
                System.out.println("son dikey");

         */