import java.util.Scanner;


public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int i = 100;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            ++i;
//        }
//        }

//        do {
//                System.out.println(i);
//                i-=5;
//        } while (i <= -10); // notice that you end with a simi-colon


//        for(int i = 100; i >= -10; i-=5) {
//            System.out.println(i);
//            ++i;
//        }
//            do {
//                {
//                    System.out.println(i);
//                    i*=2;
//                }
//            }while(i <= 100000000);
//    }
//        for(long i = 2; i <= 1000000; i *= i) {
//            System.out.println(i);
//            i += 2;
//        }
//
//        int n = 100;
//        for (int i = 1; i <= n; i++)
//        {
//            if (i % 15 == 0)
//                System.out.print("FizzBuzz"+" ");
//
//            else if (i % 5 == 0)
//                System.out.print("Buzz"+" ");
//
//
//            else if (i % 3 == 0)
//                System.out.print("Fizz"+" ");
//
//
//
//            else
//                System.out.print(i +" ");
//        }
//    }

//        System.out.println("Welcome to the Squares and Cubes Table");
//
//        Scanner sc = new Scanner(System.in);
//        String choice = "y";
//
//        while(choice.equalsIgnoreCase("y"))
//        {
//            // get the input from the user
//            System.out.println("Enter an Integer: ");
//            int integerNext = sc.nextInt();//create function for integerNext// then pass in choice
//
//            System.out.println("Number" + "  " + "Squared" + "  " + "Cubed");
//            System.out.println("======" + "  " + "======" + "  " + "======");
//
//            for(int i = 1; i <= integerNext; i++)
//            {
//                i = integerNext;
//                int numberSquared = (int) Math.pow(i, 2);
//                int numberCubed = (int) Math.pow (i, 3);
//
//                String message = "\n" + i + "       " + numberSquared + "       " + numberCubed;
//
//                System.out.println(message);
//                System.out.println();
//
//                // see if the user wants to continue
//                System.out.print("Continue? (y/n): ");
//                choice = sc.next();
//                System.out.println();
//            }
//        }
        int numberGrade;
        String userInput;

        do {
            System.out.println("\nEnter an Integer: ");
            numberGrade = scanner.nextInt();
            if (numberGrade <= 59)
                System.out.print(" You're grade is an F");

            else if (numberGrade <= 60)
                System.out.print("You're grade is a D");

            else if (numberGrade <= 79)
                System.out.print("you're grade is a C");

            else if (numberGrade <= 87)
                System.out.print("you're grade is a B");

            else if (numberGrade >= 88)
                System.out.print("You're grade is a A");

            else
                System.out.print("Error, please enter a number between 0 and 100");

        System.out.println("\nwould you like to continue?");
        userInput = scanner.next();
    }while (userInput.equals("yes"));


    }
}

