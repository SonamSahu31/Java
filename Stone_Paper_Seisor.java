public class Stone_Paper_Seisor {
    public static void main(String[] args) {
        int player1 = 1; // Stone
        int player2 = 2; // Paper

        if (player1 == player2) {
            System.out.println("It's a tie!");
        } else if ((player1 == 1 && player2 == 2) || (player1 == 2 && player2 == 3) || (player1 == 3 && player2 == 1)) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("Player 1 wins!");
        }
    }

    
}
