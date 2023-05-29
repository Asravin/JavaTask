package HomeWork.Work2;
import java.io.BufferedReader;
import java.io.FileReader;
public class selectLine {
    public  static String[] selectFromFile(String select) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(select));
        String str;
        int count = 0;
        int index = 0;
        while ((str = br.readLine()) != null) {
            count +=1;}
        br.close();
        String [] array = new String[count];
        BufferedReader read = new BufferedReader(new FileReader(select));
        while ((str = read.readLine()) != null) {
            array[index] = str;
            index += 1;}
            read.close();
            return array;
    }
}