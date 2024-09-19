package in.rahulojha.oop1234x;

public class Employee {
    private long id;
    private String name;
    private double salary;

    public Employee(long id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getDetails() {
        return "ID: " + id
                + ", Name: " + name;
    }
    public double calculateSalary() {
        return salary;
    }

    public Employee() {
        this.id = 0;
        this.salary = 0;
        this.name = null;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
