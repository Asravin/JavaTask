import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    private static List<String> strings = new LinkedList<>();
    
    private static String getString() {
        System.out.println("Введите строку вида \"text:num\"");
        Scanner in = new Scanner(System.in);
        return in.next();
    }

    private static void saveText() {
        String input = getString();
        String[] split = input.split(":");
        int index = Integer.parseInt(split[1]);
        if(index > strings.size()) {
            for(int i = 0; i < index; i++) {
                strings.add(null);
            }
        }
        String text = split[0];
        if(text.equalsIgnoreCase("print")) {
            System.out.println(strings.get(index));
            strings.remove(index);
        }else{
            strings.add(index, text);
        }
    }

    public static void main(String[] args) {
        while(true) {
            saveText();
        }
    }
}
