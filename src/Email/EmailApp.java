package Email;

public class EmailApp {

    public static void main(String[] args) {
    Email em1 = new Email("John", "Smith");
        System.out.println(em1.showInfo());
    Email em2 = new Email("Briana", "Smith");
        System.out.println(em2.showInfo());
    }
}
