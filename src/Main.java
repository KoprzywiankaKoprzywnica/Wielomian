import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] wielomian = wielomian();
        System.out.print("Liczba do sprawdzenia: ");
        double root = scanner.nextDouble();

        if (isRoot(root, wielomian)) System.out.println("Liczba jest pierwiastkiem wielomianu");
        else System.out.println("Liczba nie jest pierwiastkiem wielomianu");
    }

    public static double[] wielomian() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Stopień wielomianu: ");
        int degree = scanner.nextInt();
        double[] wielomian = new double[degree + 1];
        for (int i = 0; i < wielomian.length; i++) {
            if (i < wielomian.length-1)  System.out.print("Współczynnik stopnia " + (wielomian.length - i - 1) + ": ");
            else System.out.print("Wyraz wolny: ");
            wielomian[i] = scanner.nextDouble();
        }
        return wielomian;
    }

    public static boolean isRoot(double root, double[] arrayElements) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        int arraySize = arrayElements.length;
        for (int i = 0; i < arraySize; i++) {
            result += arrayElements[i] * pow(root, arraySize - i - 1);

        }
        if (result == 0) return true;
        else return false;
    }
}
