import java.util.Scanner;

public class ParseTags {
    public static void main(String[] args) {


        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine ();

        while (input.contains ("<upcase>")) {
            int indexStart = input.indexOf ("<upcase>");
            int indexEnd = input.indexOf ("</upcase>");

            String padding = input.substring (indexStart+8,indexEnd).toUpperCase ();

            int endElement = indexEnd + 9;
            input = input.replaceFirst (input.substring (indexStart, endElement), padding);
        }
        System.out.print (input);
    }
}
