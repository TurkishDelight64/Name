public class Player {
    private String name;
    private int inventorySize = 5;
    private int[] items = new int[inventorySize];
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
