package loop.ForLoop;
import java.util.Scanner;

public class One_n_number {
    public static void main(String[] args){
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }

    }
    
}
