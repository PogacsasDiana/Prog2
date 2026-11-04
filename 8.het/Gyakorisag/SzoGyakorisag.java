import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SzoGyakorisag {
    public static void main(String[] args) {
        Map<String, Integer> gyakorisag = new HashMap<>();

        try {
            File fajl = new File("input.txt");
            Scanner scanner = new Scanner(fajl);

            while (scanner.hasNext()) {
                String szo = scanner.next();
                
                gyakorisag.put(szo, gyakorisag.getOrDefault(szo, 0) + 1);
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("A fájl nem található!");
        }

        System.out.println("--- Szavak gyakorisága ---");
        String leggyakoribbSzo = "";
        int maxElofordulas = -1;

        for (Map.Entry<String, Integer> bejegyzes : gyakorisag.entrySet()) {
            String szo = bejegyzes.getKey();
            int darab = bejegyzes.getValue();

            System.out.println(szo + ": " + darab);

            if (darab > maxElofordulas) {
                maxElofordulas = darab;
                leggyakoribbSzo = szo;
            }
        }

        System.out.println("\n--- Leggyakoribb szó ---");
        System.out.println("A leggyakoribb szó a(z) \"" + leggyakoribbSzo + "\", ami " + maxElofordulas + " alkalommal fordul elő.");
    }
}