package day3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value for x1,y1 and x2,y2 of Line 1");
        Point p1 = new Point(scanner.nextInt(),scanner.nextInt());
        Point p2 = new Point(scanner.nextInt(),scanner.nextInt());
        Line l1 = new Line(p1,p2);
        float length1 = l1.getLength();
        System.out.println(" length of line1 :"+length1);

        System.out.println("Enter the Values for x1,y1 And x2,y2 of Line2  ");
        Point p3 = new Point(scanner.nextInt(),scanner.nextInt());
        Point p4 = new Point(scanner.nextInt(),scanner.nextInt());
        Line l2 = new Line(p3,p4);
        float length2 = l2.getLength();
       // System.out.println("length of line1 :" + length1);
        System.out.println("length of lin2 :" +length2);

        if (l1 == l2){
            System.out.println("both lines are equal");
        }
        else {
            System.out.println("Lines are not equal");
        }
    }
    static double getLength(double x1, double y1, double x2, double y2 ){
        return (Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
    }
}
