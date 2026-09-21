package pattern;

public class InvertHalfPyramid {
    public static void main(String[] args){
        for(int i=5; i>=1; i--){ //Outer loop for rows
            for(int j=1; j<=i; j++){ //Inner loop for columns
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    
}
