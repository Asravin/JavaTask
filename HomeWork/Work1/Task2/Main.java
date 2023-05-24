package HomeWork.Work1.Task2;

public class Main {
    public static void main(String[] args) {
        int number = 1000;
        for(int i = 2; i < number; i++) {
            boolean primal = true;
            int num = (int) Math.sqrt(i);
            for(int j = 2; j <= num; j++) {
                if((i % j) == 0) {
                    primal = false;
                    break;
                }
            }

            if(primal) {
                System.out.print(i + " ");
            }
        }
   }
}

