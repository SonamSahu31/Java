package loop.ForLoop;
import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n =sc.nextInt();

        int count = 0;
        do{
            n/=10; // Remove the last digit from n
            count++;
        }while(n!=0); // Continue until n becomes 0
        System.out.println("The number of digits in the number is: " + count);
    }
    
}
