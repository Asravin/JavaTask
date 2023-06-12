package Seminar.SixtSeminar;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task2 {
    private static int[] getArray() {
        Random rand = new Random();
        int[] array = new int[1000];
        for(int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(25);
        }
        return array;
    }

    private static float getUniquePercent(int[] array) {
        Set<Integer> intg = new HashSet<>();
        for(int j : array) {
            intg.add(j);
        }
        return intg.size() * 100f / array.length;
    }

    public static void main(String[] args) {
        System.out.println(getUniquePercent(getArray()));
    }
}
