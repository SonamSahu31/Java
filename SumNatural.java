package Function;

public class SumNatural {
    public static int SumNatural(int n){
        int sum = 0;
        if(n==0){
            return 0;
        }
        else{
            int res = n*(n+1);
            int result = res/2;
            return result;
        }
           
    }
    public static void main(String[] args){
        System.out.println(SumNatural(3));
    }
}
