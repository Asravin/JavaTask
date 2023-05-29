package HomeWork.Work2;
public class Task3 {
    public static void main(String[] args) throws Exception {
        
        String [] array = selectLine.selectFromFile("/JavaLesson/HomeWork/Work2/assessment.txt");
        for(int i = 0; i < array.length; i++) {
            System.out.println(FileReader(array[i]));
        }
    }
    public static StringBuilder FileReader(String line) {
        String line1 = line.replace("{", " ");
        String line2 = line1.replace("}", " ");
        String line3 = line2.replaceAll("\"", " ");
        String line4 = line3.replace("[", " ");
        String line5 = line4.replace("]", " ");
        StringBuilder result = new StringBuilder( "");
        String[] array = line5.split(",");
        String[] selectJoin = {"Студент", "получил", "по предмету"};
        for(int i = 0; i < array.length; i++) {
            String[] select = array[i].split(":");
            result.append(selectJoin[i]);
            result.append(select[1]);
        }
        return result;
    }
}
