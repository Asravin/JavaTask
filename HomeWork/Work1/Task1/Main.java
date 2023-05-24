package HomeWork.Work1.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int num = iScanner.nextInt();
        System.out.println("Треугольное число: " + Triangular.TriangularNumber(num));
        iScanner.close();
    }
}
