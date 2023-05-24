package Seminar.FirstSeminar;

public class Task4 {
    public static void main(String[] args) {
        String str = "Добро пожаловать на курс Java";
        String[] arr = str.split(" ");
        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
