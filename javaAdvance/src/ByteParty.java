import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ByteParty {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int countNum = scanner.nextInt();

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < countNum; i++) {
            int num = scanner.nextInt();
            arr.add(num);
        }

        String commands = scanner.nextLine();

        while ("party over".equals(commands)) {
            String[] command = commands.split("\\s+");
            int pattern = Integer.parseInt(command[0]);
            int position = Integer.parseInt(command[1]);

            switch (pattern) {
                case -1:
                    ;
                    break;
                case 0:
                    ;
                    break;
                case 1:
                    ;
                    break;
            }


            commands = scanner.nextLine();
        }

    }
}
