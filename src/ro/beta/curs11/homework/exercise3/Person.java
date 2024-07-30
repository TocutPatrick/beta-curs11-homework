package ro.beta.curs11.homework.exercise3;

public class Person {
    private final String name;
    private final int age;
    private final HairColour hairColour;

    public Person(String name, int age, HairColour hairColour) {
        this.name = name;
        this.age = age;
        this.hairColour = hairColour;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public HairColour getHairColour() {
        return hairColour;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hairColour=" + hairColour +
                '}';
    }
}
