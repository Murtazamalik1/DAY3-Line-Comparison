package day3;
import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        double lengthOfLine1, lengthOfLine2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values for x1,y1 and x2,y2 of line1");
        lengthOfLine1 = getLength(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println("Enter values for x1,y1 and x2,y2 of line2");
        lengthOfLine2 = getLength(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        System.out.println("Length of line1 = " + lengthOfLine1);
        System.out.println("Length of line2 = " + lengthOfLine2);

        Integer l1 = new Integer((int) lengthOfLine1);
        Integer l2 = new Integer((int) lengthOfLine1);

        if (l1.compareTo(l2) > 0) {
            System.out.println("Line1 is greater then Line2");
        } else if (l1.compareTo(l2) < 0) {
            System.out.println("Line1 is less then Line2");
        }
        else {
            System.out.println("Both Lines are not equal");
        }

    }
    static double getLength(double x1, double y1, double x2, double y2) {
        return (Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
    }
}
