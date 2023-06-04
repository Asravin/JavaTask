public class Task4 {
    public static void main(String[] args) {
        GlobalStack print = new GlobalStack();
        print.push(5).push(1).push(7);
        System.out.println(print.size());
        print.pop();
        System.out.println(print.size());
        System.out.println(print.peek());
        System.out.println(print.empty());
        print.pop();
        print.pop();
        System.out.println(print.empty());
    }
}
