import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task3 {
    private static Deque<String> stack = new ArrayDeque<>();
    
    private static String getString() {
        System.out.println("Введите строку: ");
        Scanner in = new Scanner(System.in);
        return in.next();
    }

    private static void saveText(String in) {
        stack.push(in);
    }

    private static void runProgramm(String in) {
        if(in.equalsIgnoreCase("q")) {
            System.exit(0);
        }else if(in.equalsIgnoreCase("print")) {
            System.out.println(stack);  
        }else if(in.equalsIgnoreCase("revert")) {
            revert();
        }else{
            saveText(in);
        }
    }

    private static void revert() {
        stack.pop();
        System.out.println(stack);
    }

    public static void main(String[] args) {
        while(true) {
            String in = getString();
            runProgramm(in);
        }
    }
}
