package in.rahulojha.oop1234x;

import java.util.List;

public class OOP1234XRunner {
    public OOP1234XRunner() {
        Employee emp = new Employee(1, "Rahul", 10000);
        System.out.println(emp.getDetails());
        System.out.println("Salary: " + emp.calculateSalary());

        System.out.println("-------------------------------------------------------");
        Manager mgr = new Manager(2, "Rahul1", 20000, 5, 5000);
        System.out.println(mgr.getDetails());
        System.out.println("Salary: " + mgr.calculateSalary());

        System.out.println("-------------------------------------------------------");
        Developer dev1 = new Developer(3, "R1", 30000, List.of("Java", "Python"), Developer.Level.JUNIOR);
        System.out.println(dev1.getDetails());
        System.out.println("Salary: " + dev1.calculateSalary());

        System.out.println("-------------------------------------------------------");
        Developer dev2 = new Developer(4, "R2", 30000, List.of("Java", "Python"), Developer.Level.MID);
        System.out.println(dev2.getDetails());
        System.out.println("Salary: " + dev2.calculateSalary());


        System.out.println("-------------------------------------------------------");
        Developer dev3 = new Developer(5, "R3", 30000, List.of("Java", "Python"), Developer.Level.SENIOR);
        System.out.println(dev3.getDetails());
        System.out.println("Salary: " + dev3.calculateSalary());

        System.out.println("-------------------------------------------------------");
    }
}
