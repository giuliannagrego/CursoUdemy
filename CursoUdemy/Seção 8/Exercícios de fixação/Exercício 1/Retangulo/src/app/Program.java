package app;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner((System.in));

        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle parameters");
        System.out.print("Width: ");
        rectangle.width = sc.nextDouble();
        System.out.print("Height: ");
        rectangle.height = sc.nextDouble();

        System.out.println("Rectangle with and height: " + String.format("%.0f", rectangle.width) + " and " + String.format("%.0f", rectangle.height));
        System.out.println("Rectangle area: " + String.format("%.0f", rectangle.areaRectangle()));
        System.out.println("Rectangle perimeter: " + String.format("%.0f", rectangle.perimeterRectangle()));
        System.out.println("Rectangle diagonal: " + String.format("%.0f", rectangle.diagonalRectangle()));

        sc.close();
    }
}
