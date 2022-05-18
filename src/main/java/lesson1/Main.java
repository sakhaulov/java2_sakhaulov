package lesson1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();

        Participant anton_participant = new Participant("Антон", rand.nextInt(10));
        Participant boris_participant = new Participant("Борис", rand.nextInt(10));
        Participant vasiliy_participant = new Participant("Василий", rand.nextInt(10));
        Participant gleb_participant = new Participant("Глеб", rand.nextInt(10));

        Team team = new Team("Красные", new Participant[]{anton_participant, boris_participant, vasiliy_participant, gleb_participant});

        Challenge swimming = new Challenge("Плавание", rand.nextInt(10));
        Challenge running = new Challenge("Бег", rand.nextInt(10));
        Challenge riding = new Challenge("Езда на велосипеде", rand.nextInt(10));

        Course course = new Course("Полоса препятствий", new Challenge[]{swimming, running, riding});

        team.showInfo();
        course.doIt(team);
        team.showResults();
    }

}
