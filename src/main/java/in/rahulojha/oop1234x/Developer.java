package in.rahulojha.oop1234x;

import java.util.ArrayList;
import java.util.List;

public class Developer extends Employee{
    private List<String> programmingLanguages;
    private Level level;

    public Developer(long id, String name, double salary, List<String> programmingLanguages, Level level) {
        super(id, name, salary);
        this.programmingLanguages = programmingLanguages;
        this.level = level;
    }

    public Developer(List<String> programmingLanguages, Level level) {
        this.programmingLanguages = programmingLanguages;
        this.level = level;
    }

    public Developer() {
        super();
        this.level = Level.JUNIOR;
        this.programmingLanguages = new ArrayList<>();
    }

    public List<String> getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(List<String> programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Programming Languages: " + this.programmingLanguages + ", Level: " + level;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() * level.getMultiplier();
    }

    public enum Level{
        JUNIOR(1),
        MID(1.5),
        SENIOR(2);

        private double multiplier;
        Level(double multiplier) {
            this.multiplier = multiplier;
        }

        public double getMultiplier() {
            return this.multiplier;
        }
    }
}
