package loop.ForLoop;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int n = sc.nextInt();

        int reverse = 0; // Initialize reverse to 0
        while(n!=0){     // Loop until n becomes 0
            int digit = n % 10;  // Get the last digit of n
            reverse = reverse * 10 + digit;  // Append the digit to reverse
            n /= 10;   // Remove the last digit from n
        }
        System.out.println("The reverse of the number is: " + reverse);
    }
    
}
