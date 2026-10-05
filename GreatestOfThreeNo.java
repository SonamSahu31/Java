package geeks;
import java.util.Scanner;

public class GreatestOfThreeNo {

    public static int greatestNumber(int a, int b, int c){
         if(a>b && a>c){
            return a;
         }
         else if(b>c){
            return b;
         }
         else{
            return c;
         }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = greatestNumber(a, b, c);
        System.out.println(result+ " is the greatest number");


    }
    
}
