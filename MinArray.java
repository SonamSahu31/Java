public class MinArray {
    public static void main(String[] args){
        int arr[] = {10, 20 , 5, 3, 29};
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
            
        }
      System.out.println("Minimum element in the array is: " + min);
    }
    
}
