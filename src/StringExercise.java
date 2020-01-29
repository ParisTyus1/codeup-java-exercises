public class StringExercise {
    public static void main(String[] args){
        String string = new String("We don't need no education,\n");
        string += "We don't need no thought control\n";
        System.out.println(string);
        string = "Check \"this\" out!, \"s inside of \"s!\n";
        System.out.println(string);
        string = "In windows, the main drive is usually C:\\\n";
        System.out.println(string);
        string = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!\n";
        System.out.println(string);
    }
}
