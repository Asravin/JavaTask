package Seminar.SecondSeminar.Task1;
public class Builder {
   public void Build(int num) {
        StringBuilder Build = new StringBuilder();
        for(int i = 0; i < num; i++) {
            if(i % 2 == 0) {
                Build.append("c1");
            }else{
                Build.append("c2");
            }
            System.out.println(Build);
    }
    }
}