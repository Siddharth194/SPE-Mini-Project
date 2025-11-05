package org.spe_mini;
import java.util.Scanner;
// test
class ScientificCalculator
{
    public static double sqrt(double x)
    {
        if (x < 0)
        {
            throw new IllegalArgumentException("Only positive numbers are accepted as input for square root");
        }
        return Math.sqrt(x);
    }

    public static long factorial(int x)
    {
        if (x < 0)
        {
            throw new ArithmeticException("Only positive numbers are accepted as input for factorial");
        }

        long product = 1;
        for (int i = 2; i <= x; i++) product *= i;

        return product;
    }

    public static double naturalLog(double x)
    {
        if (x <= 0) {
            throw new IllegalArgumentException("Logarithm undefined for zero or negative numbers.");
        }
        return Math.log(x);
    }

    // Power function
    public static double power(double base, double exponent)
    {
        return Math.pow(base, exponent);
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n\n Scientific Calculator \n");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (!x)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power Function (x^b)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter number: ");
                        double num1 = sc.nextDouble();
                        System.out.println("√" + num1 + " = " + ScientificCalculator.sqrt(num1));
                        break;

                    case 2:
                        System.out.print("Enter integer: ");
                        int n = sc.nextInt();
                        System.out.println(n + "! = " + ScientificCalculator.factorial(n));
                        break;

                    case 3:
                        System.out.print("Enter number: ");
                        double num2 = sc.nextDouble();
                        System.out.println("ln(" + num2 + ") = " + ScientificCalculator.naturalLog(num2));
                        break;

                    case 4:
                        System.out.print("Enter base (x): ");
                        double base = sc.nextDouble();
                        System.out.print("Enter exponent (b): ");
                        double exp = sc.nextDouble();
                        System.out.println(base + "^" + exp + " = " + ScientificCalculator.power(base, exp));
                        break;

                    case 5:
                        System.out.println("Exiting... Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice. Try again!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 5);

        sc.close();
    }
}