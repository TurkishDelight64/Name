import java.util.Scanner;

public class Main {

// lmao kjfdgengw
    public static void main(String[] args) {
        System.out.println("Hello, please select an option!\n");
        System.out.println("1 - Make a character\n");
        System.out.println("2 - Start game\n");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();



        while(option != -1) {
            // make a character
            switch(option) {
                // Chose a name
                case 1:
                    System.out.println("Choose a name for your character");
                    String characterName = scanner.next();
                    Player p = new Player(characterName);
                    System.out.println(p.getName());
                    playGame();
                    break;
            }
        }

    }

    private static void playGame() {
    }
}