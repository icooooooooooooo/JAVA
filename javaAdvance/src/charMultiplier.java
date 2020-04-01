import java.util.Scanner;

public class charMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.next();
        String input2 = scanner.next();

        int lengthMin = Math.min(input1.length(), input2.length());
        int lengthMax = Math.max(input1.length(), input2.length());

        int result = 0;

        for (int i = 0; i < lengthMin; i++) {
            result += input1.charAt(i) * input2.charAt(i);
        }
        if (input1.length()>input2.length()) {
            for (int i = lengthMin; i < lengthMax; i++) {
                result +=input1.charAt(i);
            }
        } else if(input1.length()<input2.length()){
            for (int i = lengthMin; i < lengthMax; i++) {
                result +=input2.charAt(i);
            }
        }


        System.out.println(result);
    }
}
