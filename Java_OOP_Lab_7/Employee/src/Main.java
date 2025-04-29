class Employee {
    public int calculateSalary() {
        return 30000;
    }
}

class Manager extends Employee {
    public int calculateSalary() {
        int baseSalary = 30000;
        int bonus = 20000;
        return baseSalary + bonus;
    }
}

class Worker extends Employee {
    public int calculateSalary() {
        int hoursWorked = 160;
        int hourlyRate = 100;
        return hoursWorked * hourlyRate;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Manager mgr = new Manager();
        Worker wrk = new Worker();

        System.out.println("Employee Salary: " + emp.calculateSalary());
        System.out.println("Manager Salary: " + mgr.calculateSalary());
        System.out.println("Worker Salary: " + wrk.calculateSalary());
    }
}
