import java.util.Scanner;

public class Bob{
public static void main (String [] args )
     {
        String textMessage = "";
        Scanner s = new Scanner(System.in);
        System.out.printf("\n\nBob is in. You can message him.\n");
        do {
        System.out.print("\nType text to Bob: ");
        textMessage = s.nextLine();

        // empty text
        if (textMessage == null || textMessage.length() == 0) {
        System.out.println("Fine. Be that way!");
        continue;
        }

        // convert to letter
        char c = textMessage.charAt(textMessage.length()-1);
        switch (c) {
        case '?':
        System.out.println("Sure.");
        break;
        case '!':
        System.out.println("Whoa, chill out!");
        break;
default:
        System.out.println("Whatever.");
        break;
        }

        } while (!textMessage.equals("Bye."));
        System.out.printf("\n\nGoodbye\n\n");
        s.close();
        }
}