package geeks;
import java.util.Scanner;

public class closestNumber {
    static int closestNumber(int n, int m){
        int lower = (n/m)*m;
        int upper;
        if (n >= 0) {
            upper = lower + Math.abs(m);
        } else {
            upper = lower - Math.abs(m);
        }
        
        int difflower = Math.abs(n - lower);
        int diffupper = Math.abs(n - upper);

        if(difflower < diffupper){
            return lower;
        }
        else if(diffupper < difflower){
            return upper;
        }
        else{
            return (Math.abs(lower) > Math.abs(upper)) ? lower : upper;
        }

    }
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    int n = sc.nextInt();
    int m = sc.nextInt();

    int result = closestNumber(n, m);
    System.out.println("The closest number to " + n + " that is divisible by " + m + " is: " + result);

   }
    
}
