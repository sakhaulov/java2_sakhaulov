package lesson1;

public class Participant {

    private String name;
    private int ability;
    private boolean passedCourse;

    public Participant(String name, int ability) {
        this.name = name;
        this.ability = ability;
        this.passedCourse = false;
        System.out.println(this + " создан");
    }

    @Override
    public String toString() {
        return "Участник " + this.name + " с уровнем способностей " + this.ability;
    }

    public String getName() {
        return name;
    }

    public int getAbility() { return ability; }

    public boolean getPassedCourse() {
        return passedCourse;
    }

    public void setPassedCourse() {
        this.passedCourse = true;
    }
}
