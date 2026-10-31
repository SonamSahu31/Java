import java.util.Scanner;
public class print2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println("Enter the element at position [" + i + "][" + j + "]:");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The 2D array is:");
    }
}
