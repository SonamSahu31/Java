package pattern;

public class jokerFace {
    public static void main(String[] args) {
        int n = 7; // Size of the face
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Eyes
                if ((i == 2 && (j == 1 || j == 5)) || (i == 3 && (j == 1 || j == 5))) {
                    System.out.print("O");
                }
                // Mouth
                else if (i == 5 && j >= 1 && j <= 5) {
                    System.out.print("-");
                }
                // Face outline
                else if ((i == 0 || i == n - 1) && (j > 0 && j < n - 1)) {
                    System.out.print("*");
                } else if ((j == 0 || j == n - 1) && (i > 0 && i < n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
