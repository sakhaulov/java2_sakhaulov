package lesson1;

public class Course {

    private String name;
    private Challenge[] course;

    public Course(String name, Challenge[] course) {
        this.name = name;
        this.course = course;
    }

    public void doIt(Team team) {
        Participant[] team_on_course = team.getTeam();
        System.out.println("\nНачалось прохождение полосы препятствий!\n");
        for (Participant participant : team_on_course) {
            int result = 0;
            System.out.println(participant + " - результаты:");
            for (Challenge challenge : this.course) {
                if (participant.getAbility() >= challenge.getDifficulty()) {
                    result++;
                    System.out.println(challenge + " пройдено!");
                } else {
                    System.out.println(challenge + " не пройдено");
                }
            }
            if (result == course.length) {
                participant.setPassedCourse();
            }
        }
    }

}
