import java.util.*;

public class Stone_Paper_Scissors {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Random rand = new Random();
       System.out.println("Welcome to Stone Paper Scissors Game!");
      String[] choices = {"stone", "paper", "scissors"};
       // User input
       System.out.print("Enter your choice (stone, paper, scissors): ");
       String userchoice = sc.nextLine().toLowerCase();

         // Computer choice
       String computerchoice = choices[rand.nextInt(3)];
       System.out.println("Computer chooses: " + computerchoice);

         // Determine winner
       if(userchoice==computerchoice){
         System.out.println("It's a tie!");
    }
       else if(userchoice=="stone" && computerchoice=="scissors" ||
                userchoice=="paper" && computerchoice=="stone" || 
                userchoice=="scissors" && computerchoice=="paper"){
         System.out.println("You win!");
        }
        else{
         System.out.println("Computer wins!");
        }
    }

    
}
