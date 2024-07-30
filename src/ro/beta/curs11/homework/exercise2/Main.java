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
        for (Person p : personList) {
            System.out.println(p);
        }
        System.out.println("---------------------------------------------------");
        PersonService newService = new PersonService(personList);
        System.out.println(newService.getPersonAgeMap());
        System.out.println(newService.getPersonsOlderThan(34));
        System.out.println(newService.getHairMap());
        System.out.println(newService.getAgeMap());
    }
}
