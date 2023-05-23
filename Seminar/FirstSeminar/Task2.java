package Seminar.FirstSeminar;
import java.time.LocalTime;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = iScanner.nextLine();
        iScanner.close();
        int time = LocalTime.now().getHour();

        if(time == 5 || time < 12) {
            System.out.printf("Доброе утро, %s!", name);
        
        }else if(time == 12 || time < 18) {
            System.out.printf("Добрый день, %s!", name);
        
        }else if(time == 18 || time < 23) {
            System.out.printf("Добрый вечер, %s!", name);
        
        }else if(time == 23 || time < 5) {
        System.out.printf("Доброй ночи, %s!", name);
        }
    }
}
