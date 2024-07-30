package ro.beta.curs11.homework.exercise3;

public class Employees extends Person {
    private final Companies company;
    private final int salary;

    public Employees(String name, int age, HairColour hairColour, Companies company, int salary) {
        super(name, age, hairColour);
        this.company = company;
        this.salary = salary;
    }

    public Companies getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "company='" + company + '\'' +
                ", salary=" + salary +
                "} " + super.toString();
    }
}
