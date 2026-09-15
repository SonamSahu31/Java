package loop.ForLoop;
import java.util.Scanner;

public class SumOf_Nnumber {
    public static void main(String[] args){
        System.out.println("Enter your number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1
;        int sum =0;
        while(i<=n){

            sum = sum+=i;
            i++;
        }
        System.out.println("The sum of numbers: " + sum);
    }
    
}
