package grades;

import java.util.ArrayList;

public class student {
    private String name;
    private ArrayList<Integer> grades;

    public student(String name) {

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

    public static void main(String[] args) {
      student student = new student("Paris");//object instances of each student//with addGrade and student avg//
        student.addGrade(90);
        student.addGrade(100);
        student.addGrade(67);
        System.out.println(student.getGradeAverage());

        student student2 = new student("Cash");
        student.addGrade(45);
        student.addGrade(100);
        student.addGrade(98);
        System.out.println(student.getGradeAverage());

        student student3 = new student("Grace");
        student.addGrade(87);
        student.addGrade(77);
        student.addGrade(110);
        System.out.println(student.getGradeAverage());

        student student4 = new student("Faith");
        student.addGrade(77);
        student.addGrade(89);
        student.addGrade(120);
        System.out.println(student.getGradeAverage());
    }
}