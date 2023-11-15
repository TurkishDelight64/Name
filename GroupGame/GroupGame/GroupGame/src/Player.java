public class Player {
    private int HP;
    private String name;
    private int inventorySize = 5;
    private int[] items = new int[inventorySize];
    private int strength;
    private int intelligence;
    private int dexterity;
    private  int endurance;
    private int agility;
    private int luck;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
