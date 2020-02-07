package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
//    private HashMap<String, String> attendance;

    public Student(String name) {//constructor//

        this.name = name;
        this.grades = new ArrayList<>();
}

    // returns the student's name
    public String name() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {//use .add function//
        grades.add(grade);
    }



    // returns the average of the students grades
    public double getGradeAverage() {//create loop to traverse through all students and get averages//
        double total = 0;
        for (Integer grade: grades){
            total += grade;
        }
        return total/grades.size();
    }
    public String getName(){
        return this.name;
    }





    public static void main(String[] args) {
      Student student = new Student("Paris");//object instances of each student//with addGrade and student avg//
        student.addGrade(90);
        student.addGrade(100);
        student.addGrade(67);
        System.out.println(student.getGradeAverage());

        Student student2 = new Student("Cash");
        student.addGrade(45);
        student.addGrade(100);
        student.addGrade(98);
        System.out.println(student.getGradeAverage());

        Student student3 = new Student("Grace");
        student.addGrade(87);
        student.addGrade(77);
        student.addGrade(110);
        System.out.println(student.getGradeAverage());

        Student student4 = new Student("Faith");
        student.addGrade(77);
        student.addGrade(89);
        student.addGrade(120);
        System.out.println(student.getGradeAverage());
    }
}