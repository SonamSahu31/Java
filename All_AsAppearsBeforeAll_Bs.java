package geeks;
import java.util.Scanner;
public class All_AsAppearsBeforeAll_Bs {
    public static boolean checkString(String s){
        for(int i = 0; i+ 1 < s.length(); i++){ // Check if 'b' appears before 'a'
            if(s.charAt(i) == 'b' && s.charAt(i+1) == 'a'){ // If 'b' is found before 'a', return false
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        boolean result = checkString(s);
        System.out.println(result);
        sc.close();
    }
}
        