public class reverse {
    public static void main(String [] agrs){
        int arr[] = {1,2,3,4,5};
        int start = 0;
        int end = arr.length-1;
        int temp;
        while(start  < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
       System.out.println("Reversed Array is: "); 
       for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
       }
    }
    
}
