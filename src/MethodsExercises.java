import java.util.Scanner;


public class MethodsExercises {
     public static void main(String[] args) {
//    System.out.println(addition(a,b));
//    System.out.println(subtraction(21,7));
//    System.out.println(multiplication(14,3));
//    System.out.println(division(50,2));
//    System.out.println(modulus(50,2));

    factorial();
    getInteger(1,10);
    System.out.println(rollDice());
    }

    public static double addition(double a, double b){
         return (a + b);
    }
    public static double subtraction(double c, double d){
        return(c - d);

    }
    public static double multiplication(double e, double d){
        return (e * d);

    }
    public static double division(double f, double g){
        return (f / g);

    }
    public static double modulus(double h, double i){
        return (h % i);

    }


//pick a number between 1 and 10//
    public static int getInteger(int min, int max) {
         int answer;
         Scanner scanner = new Scanner(System.in);

         do{
             System.out.print("\n\nPlease enter a number between " + min + " and " + max + ": ");
             answer = scanner.nextInt();
         }while (answer < min || answer > max);
         return answer;

    }


//factorial//
    public static int factorial(){
        System.out.print("\n\nPlease enter a number between 1 and 10:");
        Scanner scanner = new Scanner(System.in);
        int base = getInteger(1,10);
        long fact = 1;
        String output = "! = 1";
        System.out.print("1%s\n");

        for (int i = 2;i <= base;i++){
            fact *=i;
            output += " x "+i;
            System.out.printf("%d%s = %d\n",i,output,fact);
        }

        return 0;
    }
//roll dice//
    public static int rollDice() {
        Scanner scanner = new Scanner(System.in);
        int sides;
        int dice1;
        int dice2;
        String ready;
        do {
            System.out.print("\n\nRoll the Dice: ");

            System.out.print("pick number of sides: ");
            sides = scanner.nextInt();
            dice1 = (int) (Math.random() * sides) + 1;
            System.out.println(dice1);
            dice2 = (int) (Math.random() * sides) + 1;
            System.out.println(dice2);
            System.out.println("You rolled a \n" + (dice1 + dice2));
            System.out.print("would you like to continue?: ");
            ready = scanner.next();

        } while (!ready.equals("no"));

        return 0;

    }






}




