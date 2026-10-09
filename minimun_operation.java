package geeks;
import java.util.Scanner;

public class minimun_operation {
    public static int operation(int a){
        int operation = 0;

        while(a>0){
            if(a%2 == 0){
                a/=2;
            }
            else{
                a-=1;
            }
            operation++;
        }
        return operation;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        int result = operation(a);
        System.out.println("Result: " + result);
    }
    
}
