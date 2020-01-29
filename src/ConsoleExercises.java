import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

//        double pi = 3.14159;
//        System.out.println("PI = " + Math.PI);
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");


//        double radius = 8;
//        double circleArea = Math.PI * Math.pow(radius, 2);
//        System.out.println("Circle Area = " + circleArea);

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter 3 words: ");
//        String userInput = scanner.next();

        System.out.print("Enter first word: ");
        String word_one = scanner.next();

        System.out.print("Enter Second word: ");
        String word_two = scanner.next();

        System.out.print("Enter third word: ");
        String word_three = scanner.next();


        System.out.println("You entered: --> \"" + word_one +"," + word_two + "," + word_three +"\" <--");
    }
}
