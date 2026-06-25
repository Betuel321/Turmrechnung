import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String antwort;

        // Fußgesteuerte Schleife für die Wiederholung des gesamten Programms
        do {
            System.out.print("Bitte geben Sie die Startzahl ein: ");
            long zahl = scanner.nextLong();
            long ergebnis = zahl;

            System.out.println("\n--- Turmrechnung ---");
            
            // 1. Zählschleife: Multiplikation von 2 bis 9
            for (int i = 2; i <= 9; i++) {
                long neu = ergebnis * i;
                // printf sorgt für eine saubere, rechtsbündige Formatierung der Zahlen
                System.out.printf("%8d * %d = %8d%n", ergebnis, i, neu);
                ergebnis = neu;
            }

            // 2. Zählschleife: Division von 2 bis 9
            for (int i = 2; i <= 9; i++) {
                long neu = ergebnis / i;
                System.out.printf("%8d / %d = %8d%n", ergebnis, i, neu);
                ergebnis = neu;
            }
            
            System.out.println("--------------------\n");

            // Abfrage zur Wiederholung des Programms
            System.out.print("Möchten Sie eine weitere Rechnung durchführen? (j/n): ");
            antwort = scanner.next();

        } while (antwort.equalsIgnoreCase("j")); // Läuft weiter, solange die Eingabe "j" oder "J" ist

        System.out.println("Programm beendet.");
        scanner.close();
    }
}
