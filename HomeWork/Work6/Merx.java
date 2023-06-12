package HomeWork.Work6;

public class Merx {
    String color;
    String brand;
    int id;


    public Merx(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    public boolean equals(Object o) {
        Merx i = (Merx) o;
        return id == i.id;
    }

    public  String toString() {
        return String.format("color: %s, brand: %s", color, brand);
    }
}
