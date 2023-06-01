package Seminar.ThirdSeminar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task2 {
    private static List<String> planets = new ArrayList<>();
    public static void main(String[] args) {
        printPlanets();
    }
    private static void fillPlanets() {
        planets.add("Меркурий");
        planets.add("Юпитер");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Венера");
        planets.add("Плутон");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
    }
    private static void printPlanets() {
        fillPlanets();
        StringBuilder sb = new StringBuilder();
        List<String> result = new LinkedList<>();
        for(int i = 0; i < planets.size(); i++) {
            String currentPlanet = planets.get(i);
            if(!result.contains(currentPlanet)) {
                result.add(currentPlanet);
                int count = 0;
                for(int j = 0; j < planets.size(); j++) {
                    if(planets.get(j).equals(currentPlanet)) {
                        count++;
                    }
                    sb.append(currentPlanet).append(" : ").append(count).append(" ");
                }
            }
            System.out.println(sb);
        }
    }
}
