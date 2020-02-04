import java.util.Arrays;


public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


        Person[] persons = new Person[3];//creating the array//
        Person aPerson = new Person("Paris");//declaring the new person with a instance of name//
        persons[0] = aPerson;
        aPerson = new Person("Kim");
        persons[1] = aPerson;
        aPerson = new Person("Ralph");
        persons[2] = aPerson;


        for (Person person : persons) {//looping through the array//
            System.out.println(person);
        }

        System.out.println("----------");

        aPerson = new Person("Carol");//looping through the array and adding the new person//
        Person[] people = addPerson(persons, aPerson);
        for (Person person : people) {
            System.out.println(person);
        }
    }

    public static Person[] addPerson(Person[] persons, Person newPerson) {//method for adding the new person//

        Person[] persons2 = Arrays.copyOf(persons, persons.length + 1);
        persons2[persons.length] = newPerson;

        return persons2;
    }

}
