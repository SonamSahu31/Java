package pattern;

public class whole_heart {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0; i<n; i++) {
            for(int j=0; j<2*n-1; j++) {
                if(i==0 || i==n-1 || j==0 || j==2*n-2 || i+j==n-1 || j-i==n-1 + n) {
                    System.out.print("*" );
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
