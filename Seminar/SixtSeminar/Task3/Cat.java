package Seminar.SixtSeminar.Task3;

import java.time.LocalDate;
import java.util.Objects;

public class Cat {
    Bread bread;
    LocalDate birthday;
    Owner owner;
    Pedigree pedigree;
    Color color;
    Gender gender;

    public Cat(Bread bread, LocalDate birthday, Owner owner, Pedigree pedigree, Color color, Gender gender) {
        this.bread = bread;
        this.birthday = birthday;
        this.owner = owner;
        this.pedigree = pedigree;
        this.color = color;
        this.gender = gender;
    }

    public void eat(){
        System.out.println("text");
    }
    public void eat(int weight){
        System.out.println("text2 " + weight);
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String toString() {
        return "Cat{" +
                "bread=" + bread +
                ", birthday=" + birthday +
                ", owner=" + owner +
                ", pedigree=" + pedigree +
                ", color=" + color +
                ", gender=" + gender +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return bread == cat.bread && Objects.equals(birthday, cat.birthday) && color == cat.color && gender == cat.gender;
    }

    public int hashCode() {
        return Objects.hash(bread, birthday, color, gender);
    }
}


    

