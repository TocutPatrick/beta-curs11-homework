package ro.beta.curs11.homework.exercise2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Vasile", 25, HairColour.BLACK));
        personList.add(new Person("Ghorghe", 77, HairColour.BLACK));
        personList.add(new Person("Maria", 44, HairColour.BLONDE));
        personList.add(new Person("Mirel", 77, HairColour.BROWN));
        personList.add(new Person("Nelu", 22, HairColour.BLACK));

        // extract person list
        for (Person p : personList) {
            System.out.println(p);
        }

        // create a person -> age map
        Map<String, Integer> map = new HashMap<>();
        for (Person p : personList) {
            map.put(p.name(), p.age());
        }

        // extract from map persons older than a given age
        Scanner scan = new Scanner(System.in);
        System.out.println("Extract persons older than: ");
        int age = scan.nextInt();
        for (Map.Entry<String, Integer> mp : map.entrySet()) {
            if (mp.getValue() > age) {
                System.out.println(mp.getKey() + " is " + mp.getValue());
            }
        }

        // map from persons hair to names
        Map<HairColour, List<String>> hairMap = new HashMap<>();
        for (Person p : personList) {
            hairMap.putIfAbsent(p.hairColour(), new ArrayList<>());
            hairMap.get(p.hairColour()).add(String.valueOf(p));
        }
        System.out.println(hairMap);

        // map from age to list of persons
        Map<Integer, List<Person>> ageMap = new HashMap<>();
        for (Person p : personList) {
            ageMap.putIfAbsent(p.age(), new ArrayList<>());
            ageMap.get(p.age()).add(p);
        }
        System.out.println(ageMap);
    }

}
