package pattern;
public class LOVE {
    public static void main(String[] args) {
        // L pattern
        for(int i=0; i<5; i++) {
            if(i==4) {
                System.out.println("*  *  *");
            } else {
                System.out.println("*");
            }
        }
        
        // O pattern
        for(int i=0; i<5; i++) {
            if(i==0 || i==4) {
                System.out.println(" * * * ");
            } else {
                System.out.println("*     *");
            }
        }
        
        // V pattern
        for(int i=0; i<5; i++) {
            if(i<4) {
                System.out.println("*     *");
            } else {
                System.out.println("  * *");
            }
        }
        
        // E pattern
        for(int i=0; i<5; i++) {
            if(i==0 || i==2 || i==4) {
                System.out.println("* * * *");
            } else {
                System.out.println("*");
            }
        }
    }
}