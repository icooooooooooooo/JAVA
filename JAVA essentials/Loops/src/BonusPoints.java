import java.util.Scanner;

public class BonusPoints {
       public static void main(String[] args) {
              Scanner scanner=new Scanner(System.in);

              int points = Integer.parseInt(scanner.nextLine());
              double bonuspoints = 0;
              if (points<=100) {
                     bonuspoints=5;
              } else if (points>1000) {
                     bonuspoints=points*0.1;
              } else {
                     bonuspoints=points*0.2;
              }
              int additionalbonus = 0;
              if (points%2==0) {
                     additionalbonus = 1;
              } else if (points%10==5) {
                     additionalbonus=2;
              }
              System.out.printf("Bonus points are %.0f.\nTotal points are %.0f.",additionalbonus+bonuspoints,additionalbonus+bonuspoints+points);
       }
}
