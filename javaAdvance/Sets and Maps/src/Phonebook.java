import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        Map<String, String> phonebook = new HashMap<> ();
        String input = scanner.nextLine ();

        while (!"search".equals (input)) {
            String[] data = input.split ("-");
            String name = data[0];
            String phone = data[1];
            if (phonebook.isEmpty ()) {
                phonebook.put (name, phone);
            } else if (phonebook.containsKey (name)) {
                phonebook.replace (name, phone);
            } else {
                phonebook.put (name, phone);
            }
            input = scanner.nextLine ();
        }
        input = scanner.nextLine ();
        while (!"stop".equals (input)) {
            if (phonebook.containsKey (input)) {
                System.out.printf ("%s -> %s\n",input ,phonebook.get (input));
            } else {
                System.out.printf ("Contact %s does not exist.\n", input);
            }
            input = scanner.nextLine ();
        }
    }
}
