package Seminar.ThirdSeminar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task1 {
    static Random random = new Random();
    static ArrayList<Integer> ints = new ArrayList<>();

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            ints.add(random.nextInt(11));
        }
        System.out.println(ints);
        Collections.sort(ints);
        System.out.println(ints);
    }
}