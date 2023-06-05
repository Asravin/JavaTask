package HomeWork.Work3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task {
    static Random rand = new Random();
    static ArrayList<Integer> ints = new ArrayList<Integer>();
    public static void main(String[] args) {
        listNumbers();
        deleteEvenNumbers();
        selectNumbers();
    }

    private static void listNumbers() {
        for(int i = 0; i < 14; i++) {
            int size = rand.nextInt(1, 100);
            ints.add(size);
        }
        System.out.println("Список случайных чисел от 1 до 100: " + ints);
    }

    private static void deleteEvenNumbers() {
        int even = 0;
        while(even < ints.size()) {
            if(ints.get(even) % 2 == 0) {
                ints.remove(even);
             }else{
                even++;
            }
        }
        System.out.println("Список случайных нечетных чисел от 1 до 100: " + ints);
    }

    private static void selectNumbers() {
        double result = 0;
        for(double avg : ints) {
            result += avg;
        }
        System.out.println("Среднее арифмеичекое списка из нечетных чисел: " + result/ints.size());
        System.out.println("Минимальное число списка: " + Collections.min(ints));
        System.out.println("Максимальное число списка: " + Collections.max(ints));
    }
}

