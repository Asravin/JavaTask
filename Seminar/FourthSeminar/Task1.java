import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static List<Integer> createArray(int size) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < size; i++) {
            list.add(i);
    }
    return(list);
    }

    public static List<Integer> createLinked(int size) {
        List<Integer> list = new LinkedList<>();
        for(int i = 0; i < size; i++) {
            list.add(i);
    }
    return(list);
    }

    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        createArray(10000);
        createLinked(10000);
        long after = System.currentTimeMillis();
        System.out.println(after - before);
        
    }
}
