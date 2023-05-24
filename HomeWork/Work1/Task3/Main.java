package HomeWork.Work1.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNum;
        int secondNum;
        int result = 0;
        char oper;
        Scanner iScanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        firstNum = iScanner.nextInt();
        System.out.println("Введите оператор: ");
        oper = iScanner.next().charAt(0);
        System.out.println("Введите второе число: ");
        secondNum = iScanner.nextInt();
        

        switch(oper) {
            case '+' : result = firstNum + secondNum;
                break;
        }

        switch(oper) {
            case '-' : result = firstNum - secondNum;
                break;
        }

        switch(oper) {
            case '*' : result = firstNum * secondNum;
                break;
        }

        switch(oper) {
            case '/' : result = firstNum / secondNum;
                break;
        }

        System.out.print(firstNum + " " + oper + " " + secondNum + " = " + result);
        iScanner.close();

    }
}
