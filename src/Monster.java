// Monster.java
public class Monster {
    private String name;

    public Monster(String name) {
        this.name = name;
    }

    // Method to be overridden in subclasses
    public String attack() {
        return "!^_&^$@+%$* I don't know how to attack!";
    }

    public String getName() {
        return name;
    }
}
