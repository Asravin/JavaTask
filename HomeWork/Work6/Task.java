package HomeWork.Work6;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Merx id0 = new Merx("Black","Apple");
        Merx id1 = new Merx("Black","Sumsung");
        Merx id2 = new Merx("Black","MSI");
        Merx id3 = new Merx("Black","HP");
        Merx id4 = new Merx("White","Lenovo");
        Merx id5 = new Merx("White","Apple");
        Merx id6 = new Merx("White","Sumsung");
        Merx id7 = new Merx("Grey","MSI");
        Merx id8 = new Merx("Grey","Apple");


        System.out.println("Выберите параметр поиска: ");
        System.out.println("1 - Поиск по цвету: ");
        System.out.println("2 - Поиск по производителю: ");
        Scanner sc = new Scanner(System.in);
        Integer characteristic = sc.nextInt();

        if(characteristic == 1) {
            System.out.println("Введите цвет: ");
            Scanner seath0 = new Scanner(System.in);
            String color = seath0.nextLine();
            if(color.equals("Black")) {
                System.out.printf(id0.toString(), id1.toString(), id2.toString(), id3.toString());
            }else if(color.equals("White")) {
                System.out.printf(id4.toString(), id5.toString(), id6.toString());
            }else if(color.equals("Grey")) {
                System.out.printf(id7.toString(), id8.toString());
            }
           
        }else if(characteristic == 2) {
            System.out.println("Введите производителя: ");
            Scanner seath1 = new Scanner(System.in);
            String brand = seath1.nextLine();
            if(brand.equals("Apple")) {
                System.out.printf(id0.toString(), id5.toString(), id8.toString());
            }else if(brand.equals("Sumsung")) {
                System.out.printf(id1.toString(), id6.toString());
            }else if(brand.equals("MSI")) {
                System.out.printf(id2.toString(), id7.toString());
            }else if(brand.equals("HP")) {
                System.out.printf(id3.toString());
            }else if(brand.equals("Lenovo")) {
                System.out.printf(id4.toString());
            }
        }
    }
}
