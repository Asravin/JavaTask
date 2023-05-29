package HomeWork.Work2;

public class Task1 {
    public static  void main(String[] args) throws Exception {
        String [] list = selectLine.selectFromFile("students.txt");
        System.out.println(list[0]);
        StringBuilder stringBuilder = outList(list[0]);
        System.out.println(stringBuilder);
    }

    public static StringBuilder outList(String line) {

        String line1 = line.replace("{", " ");
        String line2 = line.replace("}", " ");
        String line3 = line2.replaceAll("\" ", " ");
        System.out.println(line3);
        
            StringBuilder result = new StringBuilder("select * from students where");
            String[] array = line3.split(", ");
            for (int i = 0; i < array.length; i++) {
                String[] select = array[i].split(":");
                if(array[1].equals("null") == false) {
                    if(i != 0) {
                        result.append(", ");
                        result.append(select[0]);
                        result.append("=");
                        result.append(select[1]);

                    }else {
                        result.append(select[0]);
                        result.append("=");
                        result.append(select[1]);
                    }
                    
                }
            }
            return result;
    }
}
            
        
        




    
