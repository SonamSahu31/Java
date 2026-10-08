package geeks;
import java.util.Scanner;

public class ImplementPow{
    public static double Power(double b, int e){
        if(e==0){
            return 1.0;
        }
        if(e<0){
            return 1.0 / Power(b, -e);
        }
        double half = Power(b, e/2);
        if(e%2==0){
            return half*half;
        }
        else{
            return b*half*half;
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base (b) number:");
        int b = sc.nextInt();
        System.out.println("Enter the exponent (e)number:");
        int e = sc.nextInt();
        double result = Power(b, e);
        System.out.println("Result: " + result);
    }

}