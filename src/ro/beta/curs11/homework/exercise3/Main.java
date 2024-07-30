package ro.beta.curs11.homework.exercise3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeesList = new ArrayList<>();
        EmployeeServices newService = new EmployeeServices(employeesList);

        employeesList.add(new Employee("Viorel", 19, HairColour.BLACK, Companies.APPLE, 3000));
        employeesList.add(new Employee("Marcel", 32, HairColour.BLONDE, Companies.SAMSUNG, 4500));
        employeesList.add(new Employee("Sergiu", 23, HairColour.BROWN, Companies.SAMSUNG, 2500));
        employeesList.add(new Employee("Andrei", 34, HairColour.BLACK, Companies.APPLE, 10000));

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter salary: ");
        int salary = scan.nextInt();
        System.out.println("Higher salaries: " + newService.getHigherSalaries(salary));
        System.out.println("Company Map " + newService.getCompanyEmployees());
        System.out.println("Total salaries " + newService.salariesCost());
        System.out.println("The biggest salary is from " + newService.companiesBiggestSalary());
    }
}
