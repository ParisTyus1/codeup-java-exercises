public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");





/* Complete
Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.*/

        int myFavoriteNumber = 86;
        System.out.println(myFavoriteNumber);




        /* Complete Create a String variable named myString and assign a string value to it, then print the variable out to the console.*/


        String myString = "What is your favorite color?";
        System.out.println(myString);


        /* Complete Change your code to assign a character value to myString. What do you notice?Too many characters in a character literal and incompatible types*/

        char c = 'M';
        String s = Character.toString(c);
        System.out.println("String is: " + s);



        /* Complete Change your code to assign the value 3.14159 to myString. What happens? The string is already defined therefore the value cannot be reassigned and even if we tried this it would be incompatible types*/
//        String myString = 3.14159;



        /* Complete Declare an long variable named myNumber, but do not assign //anything to it. Next try to print out myNumber to the //console. What happens? Error:(54, 28) java: variable myNumber might not have been initialized*/

//        long myNumber;
//        System.out.println(myNumber);


        /* Complete Change your code to assign the value 3.14 to myNumber. What do //you notice?
         Error:(67, 25) java: incompatible types: possible lossy conversion from double to long*/
//
//        long myNumber = 3.14;
//        System.out.println(myNumber);




        /* Complete Change your code to assign the value 123L (Note the 'L' at the end) L is a way to indicate that a literal long number is assigned to myNumber.*/

//        long myNumber = 123L;
//        System.out.println(myNumber);

        long myNumber = 123;
        System.out.println(myNumber);


        /* Complete Change your code to assign the value 123 to myNumber. Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does? Because there is a literal double (3.14) which doesn't fit in a long variable location 123 is an int and an int fits in a long variable location*/


        /* Complete Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this? Put an f on the end of 3.14 or float myNumber = (float) 3.14*/

//        float myNumber = 123;
//        System.out.println(myNumber);

        /*Copy and paste the following code blocks one at a time and execute them What is the difference between the above code blocks? Explain why the code outputs what it does*/

//    int x = 5;
//System.out.println(x++);
//        System.out.println(x);
//
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        /* Complete Try to create a variable named class. What happens? Words reserved by the Java language may not be used as an identifier are called reserved words*/


        byte num = 127;
        System.out.println(++num);


        /*Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?*/

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
        //The above code is considered inconvertible types.

        /*What are the two different types of errors we are observing? Inconvertible Types &*/
//        int three = (int) "three";

        Integer theNumberThree = 3;
        Object o = theNumberThree;
        int three = (int) o;
        System.out.println(three);


       /* What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?




        Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type*/

        int num2 = Integer.MAX_VALUE;
        System.out.println(num2++);
        System.out.println(num2);
    }



        }





