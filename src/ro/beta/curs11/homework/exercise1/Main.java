package ro.beta.curs11.homework.exercise1;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Map<String, Integer> map = new HashMap<>();
        map.put("Alex", rand.nextInt(1, 11));
        map.put("Petric", rand.nextInt(1, 11));
        map.put("Ana", rand.nextInt(1, 11));
        map.put("Rares", rand.nextInt(1, 11));
        map.put("Catalin", rand.nextInt(1, 11));

        for (Map.Entry<String, Integer> hm : map.entrySet()) {
            System.out.println("Student: " + hm.getKey() + " Grade: " + hm.getValue());
        }

        System.out.println("----------------------------");
        String bestStudent = "";
        int maxGrade = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxGrade) {
                maxGrade = entry.getValue();
                bestStudent = entry.getKey();
            }
        }
        System.out.print("Student with the hughest grade is " + bestStudent + " (grade: " + maxGrade + ")");
    }
}
