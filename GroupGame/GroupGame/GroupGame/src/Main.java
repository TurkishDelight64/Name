import java.io.File;
import java.util.Scanner;
import java.io.*;

public class Main {

// lmao kjfdgengw
    public static void main(String[] args) {
        System.out.println("Hello, please select an option!\n");
        System.out.println("1 - Make a character\n");
        System.out.println("2 - Start game\n");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();



        while(option != -1) {

            System.out.println("1 - Make a character\n");
            System.out.println("2 - Start game\n");

            // make a character
            switch(option) {
                // Chose a name
                case 1:
                    System.out.println("Choose a name for your character");
                    String characterName = scanner.next();
                    Player p = new Player(characterName);
                    System.out.println(p.getName());
                    break;
                case 2:
                    int choice;
                    /*
                        print text
                        give choice
                        do something based on the given choice
                     */

                    System.out.println("Start game");
                    System.out.println("You are ejected, you crew mates mistook you for the imposter. " +
                            "You and the ship crash land on mysterious planet. You need to make your back to the ship" +
                            "and save your crew mates from the real imposter.");
                    System.out.println("What do you do?");
                    System.out.println("1 - Go into a a cave");
                    System.out.println("2 - Go further into the forest");
                    System.out.println("3 - Commit Seppuku");

                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:

                            break;
                        case 2:
                            break;
                        case 3:
                            System.out.println("");
                            break;
                    }
                    break;
            }
        }

    }
    public class terminateApp {
        public static void main (String[] args){
            File file = new File("Name");
            if (file.exists()){
                file.delete();
            }
            else{
                System.out.println("You are one of the lucky ones");
            }
        }
    }

}