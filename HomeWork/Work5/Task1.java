package HomeWork.Work5;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
    public static Map<String, Integer> phoneBook = new HashMap<>();
    public static void main(String[] args) {

        phoneBook.put("Алиса", 892144);
        phoneBook.put("Анна", 891342);
        phoneBook.put("Ева", 898982);
        phoneBook.put("Елена", 892356);
        phoneBook.put("Марина", 890123);
        phoneBook.put("Алиса", 895012);
        phoneBook.put("Вика", 897102);
        phoneBook.put("Марина", 890012);
        phoneBook.put("Алиса", 894500);
        phoneBook.put("Анна", 898012);
        Map<String, Integer> outMap = phoneBook.entrySet().stream() 
        .sorted(Comparator.comparingInt(e -> -e.getValue())) 
        .collect(Collectors.toMap( 
        Map.Entry::getKey, 
        Map.Entry::getValue, 
        (a, b) -> { throw new AssertionError(); }, 
        LinkedHashMap::new 
        )); 
        outMap.entrySet().forEach(System.out::println);
    }
}
