package lesson1;

public class Challenge {

    private String name;
    private int difficulty;

    public Challenge(String name, int difficulty) {
        this.name = name;
        this.difficulty = difficulty;
        System.out.println(this + " создано");
    }

    @Override
    public String toString() {
        return "Испытание " + name + " со сложностью " + difficulty;
    }

    public String getName() {
        return name;
    }

    public int getDifficulty() {
        return difficulty;
    }
}
