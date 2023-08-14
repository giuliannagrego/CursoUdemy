package app;

import entity.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        System.out.print("Student name: ");
        student.name = sc.nextLine();
        System.out.println();
        System.out.print("1º semester note: ");
        student.note1 = sc.nextDouble();
        System.out.println();
        System.out.print("2º semester note: ");
        student.note2 = sc.nextDouble();
        System.out.println();
        System.out.print("3º semester note: ");
        student.note3 = sc.nextDouble();

        System.out.println();
        System.out.println("Final note: " + student.finalNote());

        System.out.println();
        System.out.println(student.studentPassedOrFailed());

        sc.close();
    }
}
