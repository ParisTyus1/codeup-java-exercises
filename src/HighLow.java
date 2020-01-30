import java.util.Scanner;


public class HighLow {
    public static void main(String[] args) {

      game(10);
    }
static int randomNumber = (int) (Math.floor(Math.random() * 100) + 1);//similar to a const function//
    public static int game(int limit){
        Scanner scanner = new Scanner(System.in);
        int userGuess;
        int counter = 0;

    System.out.print("\n\nPlease enter a number between 1 and 100: \t");
    userGuess = scanner.nextInt();

        if (limit == 0 ) {
            System.out.println("\nGAME OVER!\n");
            System.out.println("The number was\t" + randomNumber);
            System.out.println("Chances remaining: \t");
            return counter;
        }else if (userGuess > randomNumber){
            System.out.println("\nLOWER\n");
            ++counter;
            System.out.println("Chances remaining:\t" +(limit -= counter));
            System.out.println("\nTry again!\n");
            return game(limit);
        }else if (userGuess < randomNumber){
            System.out.println("\nHIGHER\n");
            ++counter;
            System.out.println("Chances remaining:\t" +(limit -= counter));
            System.out.println("\nTry again!\n");
            return game(limit);
        }else{
            System.out.println("GOOD GUESS\n");
            System.out.println("Chances used: ");
            return 10-limit;
         }
    }
}
