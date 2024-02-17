package week04;
import java.util.Scanner;

import week03.geometry.Point;
public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPoints = scanner.nextInt();
        scanner.nextLine(); 
        Point[] points = new Point[numPoints];

        for (int i = 0; i < numPoints; i++) {
            float x = scanner.nextFloat();
            float y = scanner.nextFloat();
            points[i] = new Point(x, y);
            scanner.nextLine(); 
        }

        Point northern = points[0];
        Point southern = points[0];
        Point western = points[0];
        Point eastern = points[0];

        for (int i = 1; i < points.length; i++) {
            if (points[i].getY() > northern.getY()) {
                northern = points[i];
            }
            if (points[i].getY() < southern.getY()) {
                southern = points[i];
            }
            if (points[i].getX() < western.getX()) {
                western = points[i];
            }
            if (points[i].getX() > eastern.getX()) {
                eastern = points[i];
            }
        }

        printExtremePoints(points, northern.getY());
        printExtremePoints(points, southern.getY());
        printExtremePoints(points, western.getX());
        printExtremePoints(points, eastern.getX());

        scanner.close();
    }

    public static void printExtremePoints(Point[] points, float value) {
        for (Point point : points) {
            if (point.getX() == value || point.getY() == value) {
                System.out.println("(" + point.getX() + ", " + point.getY() + ")");
            }
        }
    }
}
