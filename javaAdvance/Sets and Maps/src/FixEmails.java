import java.util.*;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine ();
        Map<String, String> emailBook = new TreeMap<> ();
        String name = "name";
        String email = "@";


        int count = 0;
        while (!"stop".equals (input)) {
            count++;
            if (count % 2 != 0) {
                name = input;
            } else if (count % 2 == 0) {
                email = input.toLowerCase ();

                boolean isEligble = isEligibleTester (email);
                if (isEligble == true) {
                    if (emailBook.containsKey (name)) {
                        emailBook.replace (name, email);
                    } else {
                        emailBook.put (name, email);

                    }
                }
            }
            input = scanner.nextLine ();
        }

        for (Map.Entry<String, String> entry : emailBook.entrySet ()) {
            System.out.printf ("%s -> %s\n", entry.getKey (), entry.getValue ());

        }
    }

    private static boolean isEligibleTester(String email) {
        Set<String> limitations = new HashSet<> ();
        limitations.add ("uk");
        limitations.add ("us");
        limitations.add ("com");

        String[] arr = email.split ("\\.");
        String ending = arr[arr.length - 1];

        boolean output = true;

        if (limitations.contains (ending)) {
            output = false;
        }
        return output;
    }
}

