package in.rahulojha.oop1234x;

public class Manager extends Employee{
    private int teamSize;
    private double bonus;

    public Manager(long id, String name, double salary, int teamSize, double bonus) {
        super(id, name, salary);
        this.teamSize = teamSize;
        this.bonus = bonus;
    }

    public Manager(int teamSize, double bonus) {
        this.teamSize = teamSize;
        this.bonus = bonus;
    }

    public Manager() {
        super();
        this.teamSize = 0;
        this.bonus = 0;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Team Size: " + teamSize;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}
