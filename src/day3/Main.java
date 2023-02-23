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
        float length = l1.getLength();
        System.out.println(length);
    }
}
