package ro.beta.curs11.homework.exercise2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonService {
    private final List<Person> personsList;

    public PersonService(List<Person> personsList) {
        this.personsList = personsList;
    }

    public Map<String, Integer> getPersonAgeMap() {
        Map<String, Integer> map = new HashMap<>();
        for (Person p : personsList) {
            map.put(p.name(), p.age());
        }
        return map;
    }

    public List<Person> getPersonsOlderThan(int age) {
        List<Person> list = new ArrayList<>();
        for (Person p : personsList) {
            if (p.age() > age) {
                list.add(p);
            }
        }
        return list;
    }

    public Map<String, List<String>> getHairMap() {
        Map<String, List<String>> map = new HashMap<>();
        for (Person p : personsList) {
            map.putIfAbsent(String.valueOf(p.hairColour()), new ArrayList<>());
            map.get(String.valueOf(p.hairColour())).add(p.name());
        }
        return map;
    }

    public Map<Integer, List<Person>> getAgeMap() {
        Map<Integer, List<Person>> map = new HashMap<>();
        for (Person p : personsList) {
            map.putIfAbsent(p.age(), new ArrayList<>());
            map.get(p.age()).add(p);
        }
        return map;
    }
}
