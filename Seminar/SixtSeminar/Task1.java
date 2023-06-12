package Seminar.SixtSeminar;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>(List.of(1, 2, 3, 2, 4, 5, 6, 3));
        Set<Integer> lhs = new LinkedHashSet<>(List.of(1, 2, 3, 2, 4, 5, 6, 3));
        Set<Integer> ts = new TreeSet<>(List.of(1, 2, 3, 2, 4, 5, 6, 3));

        System.out.println(hs);
        System.out.println(lhs);
        System.out.println(ts);
    }
}
