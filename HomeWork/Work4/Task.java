package HomeWork.Work4;

import java.util.LinkedList;
import java.util.Random;

public class Task {
    static Random rand = new Random();
    static LinkedList<Integer> list = new LinkedList<>();

    private static void listNumbers() {
        for(int i = 0; i < 10; i++) {
            int ints = rand.nextInt(1, 100);
            list.add(ints);
        }
        System.out.println("Изначальный массив: " + list);
    }

    private static void printList() {
        int count = 0;
        while(count != list.size() - 1) {
            list.add(list.size() - count, list.getFirst());
            list.removeFirst();
            count++;
        }
        System.out.println("Перевернутый массив: " + list);
    }

    public static void enqueue(LinkedList<Integer> list, int ints) {
        list.addLast(ints);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int ints = 0;
        ints = list.get(0);
        list.remove(0);
        return ints;
    }

    public static int first(LinkedList<Integer> list) {
        int ints = 0;
        ints = list.get(0);
        return ints;
    }

    public static void main(String[] args) {
        listNumbers();
        printList();
        enqueue(list, 66);
        System.out.println("цифра '66' перемещена в конец очереди : " + list);
        System.out.println("Удаление первого элемента: " + dequeue(list));
        System.out.println("Первый индекс очереди теперь: " + first(list));
    }
}
