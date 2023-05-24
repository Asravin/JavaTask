package Seminar.FirstSeminar;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        int count = 0;
        int NewCount = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                NewCount ++;
            
            }else if(count < NewCount) {
                count = NewCount;
                NewCount = 0;
            }
        }
        if(count < NewCount) {
            System.out.println("Подряд идущих 1: " +NewCount);
        }
    }
}
