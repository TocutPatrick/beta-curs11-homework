package ro.beta.curs11.homework.exercise3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employees> employeesList = new ArrayList<>();
        employeesList.add(new Employees("Viorel", 19, HairColour.BLACK, Companies.APPLE, 3000));
        employeesList.add(new Employees("Marcel", 32, HairColour.BLONDE, Companies.SAMSUNG, 4500));
        employeesList.add(new Employees("Sergiu", 23, HairColour.BROWN, Companies.SAMSUNG, 2500));
        employeesList.add(new Employees("Andrei", 34, HairColour.BLACK, Companies.APPLE, 10000));

        // extract persons that have salaries more than a specified ammount
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter salary: ");
        int salaryAmount = scan.nextInt();
        for (Employees e : employeesList) {
            if (e.getSalary() > salaryAmount) {
                System.out.println(e.getName());
            }
        }

        //extract a Map that gathers all the persons for a company
        Map<Companies, List<Employees>> companiesMap = new HashMap<>();
        for (Employees e : employeesList) {
            companiesMap.putIfAbsent(e.getCompany(), new ArrayList<>());
            companiesMap.get(e.getCompany()).add(e);
        }
        System.out.println(companiesMap);

        // calculate the sum of all salaries for all employees
        int sum = 0;
        for (Employees e : employeesList) {
            sum += e.getSalary();
        }
        System.out.println("Total salaries: " + sum);

        // calculate which company gives the biggest salary
        if (calculateSalary(Companies.APPLE, employeesList) > calculateSalary(Companies.SAMSUNG, employeesList)) {
            System.out.println("The company who gives the biggest salary is Apple");
        } else if (calculateSalary(Companies.APPLE, employeesList) == calculateSalary(Companies.SAMSUNG, employeesList)) {
            System.out.println("The companies gives the same salary");
        } else System.out.println("The company who gives the biggest salary is Samsung");
    }

    public static int calculateSalary(Companies a, List<Employees> employees) {
        int sal = 0;
        for (Employees e : employees) {
            if (e.getCompany().equals(a)) {
                sal += e.getSalary();
            }
        }
        return sal;
    }
}
