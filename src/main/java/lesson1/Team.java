package lesson1;

public class Team {

    private String name;
    private Participant[] team;

    public Team(String name, Participant[] team) {
        this.name = name;
        this.team = team;
    }

    public void showInfo() {
        StringBuilder info = new StringBuilder("Участники команды " + name + ":");
        for (Participant participant : team) {
            info.append("\n").append(participant);
        }
        System.out.println(info);
    }

    public void showResults() {
        System.out.println("\nРезультаты прохождения полосы препятствий:\n");
        int numberPassed = 0;
        for (Participant participant : team) {
            if (participant.getPassedCourse()) {
                numberPassed++;
                System.out.println(participant + " полностью прошёл полосу препятствий");
            }
        }
        if (numberPassed == 0) {
            System.out.println("Никто из участников команды " + this + " не прошёл полосу препятствий");
        }
    }

    public String getName() {
        return name;
    }

    public Participant[] getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return "Команда " + name;
    }
}
