package ro.beta.curs11.homework.exercise3;

import java.util.*;

public class EmployeeServices {

    private final List<Employee> employeesList;

    public EmployeeServices(List<Employee> employeesList) {
        this.employeesList = employeesList;
    }

    public List<Employee> getHigherSalaries(int salary) {
        List<Employee> list = new ArrayList<>();
        for (Employee e : employeesList) {
            if (e.getSalary() > salary) {
                list.add(e);
            }
        }
        return list;
    }

    public Map<Companies, List<Employee>> getCompanyEmployees() {
        Map<Companies, List<Employee>> companiesMap = new HashMap<>();
        for (Employee e : employeesList) {
            companiesMap.putIfAbsent(e.getCompany(), new ArrayList<>());
            companiesMap.get(e.getCompany()).add(e);
        }
        return companiesMap;
    }

    public int salariesCost() {
        int total = 0;
        for (Employee e : employeesList) {
            total += e.getSalary();
        }
        return total;
    }

    public Companies companiesBiggestSalary() {
        Companies company = null;
        int maxSalary = 0;
        for (Employee e : employeesList) {
            if (e.getSalary() > maxSalary) {
                maxSalary = e.getSalary();
                company = e.getCompany();
            }
        }
        return company;
    }


}
