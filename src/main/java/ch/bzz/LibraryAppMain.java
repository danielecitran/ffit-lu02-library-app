package ch.bzz;

import java.util.Scanner;

public class LibraryAppMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        System.out.println("Library");
        System.out.println("help eingeben für alle Befehle.");
        
        while (running) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();
            
            switch (input.toLowerCase()) {
                case "quit":
                    running = false;
                    System.out.println("Beendet.");
                    break;
                case "help":
                    showHelp();
                    break;
                default:
                    System.out.println("Befehl '" + input + "'existiert nicht. Geben Sie 'help' ein, um alle verfügbaren Befehle zu sehen.");
                    break;
            }
        }
        
        scanner.close();
    }
    
    private static void showHelp() {
        System.out.println("\nVerfügbare Befehle:");
        System.out.println("  help  - Zeigt diese Hilfe an");
        System.out.println("  quit  - Beendet das Programm");
        System.out.println();
    }
}
