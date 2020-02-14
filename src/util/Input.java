package util;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        String answer;
        System.out.println("Enter a string: ");
        answer = this.scanner.next();
        return answer;
    }

    public String getString(String prompt) {
        String answer;
        System.out.println(prompt);
        answer = this.scanner.next();
        return answer;
    }

    public boolean yesNo(){
        String answer;
        System.out.println("What is your answer? (yes/no): ");
        answer = this.scanner.next();
        return answer.toLowerCase().startsWith("y");
    }

    public boolean yesNo(String prompt){
        String answer;
        System.out.println(prompt);
        answer = this.scanner.next();
        return answer.toLowerCase().startsWith("y");
    }
    public int getInt(int min, int max) {
        int answer = 0;

        do {
            System.out.println("Enter an integer betweeen " + min + " and " + max +": ");
            answer = this.scanner.nextInt();
        } while (answer < min || answer > max);
        return answer;
    }

    public int getInt(String prompt, int min, int max) {
        int answer;
        do {
            System.out.println(prompt);
            answer = this.scanner.nextInt();
        } while (answer < min || answer > max);
        return answer;
    }


    public int getInt() {
        int answer = 0;
        boolean error = true;


        do {
            try {
                System.out.println("please enter an integer: ");
                answer = Integer.valueOf(this.scanner.next());
//.valueOF => built in method use to return an integer instance representing the value//
//set answer variable  = valueOf with the parameter being the scanner.next property//
                error = false;
                System.out.println("Integer entered is:  " + answer);

            } catch (NumberFormatException nfe) {
                System.out.println("That's not an integer, please try again");
            }
        }while(error);
        return answer;

    }

    public int getInt(String prompt) {
        int answer;
        System.out.println(prompt);
        answer = this.scanner.nextInt();
        return answer;
    }

    public double getDouble(double min, double max) {
        double answer;
        do {
            System.out.println("Enter a double betweeen " + min + " and " + max +": ");
            answer = this.scanner.nextDouble();
        } while (answer < min || answer > max);
        return answer;
    }

    public double getDouble(String prompt, double min, double max) {
        double answer;
        do {
            System.out.println(prompt);
            answer = this.scanner.nextDouble();
        } while (answer < min || answer > max);
        return answer;
    }

    public double getDouble() {
        double userInput = 0;
        boolean error = true;

        do {
            try {
                System.out.println("please enter an Double: ");
                userInput = Double.valueOf(this.scanner.next());//listening for the double of \ passing it as userInput//
                error = false;
                System.out.println("Integer entered is:  "+userInput);

            } catch (NumberFormatException nfe) {
                System.out.println("That's not an double, please try again");
            }
        }while(error);
        return userInput;
    }

    public double getDouble(String prompt) {
        double answer;
        System.out.println(prompt);
        answer = this.scanner.nextDouble();
        return answer;
    }

}

