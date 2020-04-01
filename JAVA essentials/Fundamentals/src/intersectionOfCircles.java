import java.util.Scanner;

public class intersectionOfCircles {
    public static boolean intersects(Circle first, Circle second) {

        double firstPart = Math.pow(first.getCenter().getX() - second.getCenter().getX(), 2);
        double secondPart = Math.pow(first.getCenter().getY() - second.getCenter().getY(), 2);

        double centreDist = Math.sqrt(firstPart + secondPart);

        return centreDist <= first.getRadius()+second.getRadius();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle first = new Circle(new Point(scanner.nextInt(), scanner.nextInt()) //points
                , scanner.nextInt());                                             //radius
        Circle second = new Circle(new Point(scanner.nextInt(), scanner.nextInt()) //points
                , scanner.nextInt());                                             //radius

        if(intersects(first,second) == true){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
