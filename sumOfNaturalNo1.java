package sonam;
import java.util.Scanner;

public class sumOfNaturalNo1{
    public static int findSum(int n){
        if(n==0)
         return 0;
        
        int res  = n*(n+1);
        int result = res/2;
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        
        int result = findSum(n);
        System.out.println("The sum of natural numbers up to " + n + " is: " + result);
        

    }
}