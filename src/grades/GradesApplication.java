package grades;
import java.util.Scanner;

import java.util.HashMap;


public class GradesApplication {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);


    Student student = new Student("Paris");//object instances of each student//with addGrade and student avg//
        student.addGrade(90);
        student.addGrade(100);
        student.addGrade(67);
//        System.out.println(student.getGradeAverage());

    Student student2 = new Student("Cash");
        student2.addGrade(45);
        student2.addGrade(100);
        student2.addGrade(98);
//        System.out.println(student.getGradeAverage());

    Student student3 = new Student("Grace");
        student3.addGrade(87);
        student3.addGrade(77);
        student3.addGrade(110);
//        System.out.println(student.getGradeAverage());

    Student student4 = new Student("Faith");
        student4.addGrade(77);
        student4.addGrade(89);
        student4.addGrade(120);
//        System.out.println(student.getGradeAverage());


    HashMap<String, Student> students = new HashMap<>();

        students.put("Ptyus1980", student);
        students.put("CashMoney9900", student2);
        students.put("Grace12", student3);
        students.put("Faith34",student4);
        System.out.print(students);


        System.out.println("Welcome\n"+"Here are the usernames of our students");
        students.forEach((key, value) -> System.out.println((key)));

        String userInput = "";
        int userContinue = 1;//true or false statement//
        //function of this do while is the mke sure user exist.//


do {


    do {

        if (userInput != "") {
            System.out.println("No users with that username were found");
        }
        System.out.println("What student would you like to see more information on?: ");
        userInput = scanner.next();


    } while (!students.containsKey(userInput));

    //function for displaying data after userinput is taken in//
    System.out.println(students.get(userInput).name() + "\n" + students.get(userInput).getGradeAverage());

    System.out.println("Do you want to Continue? 1:Yes or 2:no");
    userContinue = scanner.nextInt();

    userInput = "";//reset value to empty//
}while (userContinue == 1);


}

}
