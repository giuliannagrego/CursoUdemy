package app;

import entity.DadosFuncionario;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner((System.in));

        DadosFuncionario funcionario = new DadosFuncionario();
        System.out.print("Name: ");
        funcionario.name = sc.nextLine();
        System.out.print("Gross salary: ");
        funcionario.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        funcionario.tax = sc.nextDouble();

//        System.out.println("Employee: " + funcionario.name + ", $ " + funcionario.netSalary());
        System.out.println();
        System.out.println("Employee: " + funcionario);

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        funcionario.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + funcionario);
        sc.close();



    }
}
