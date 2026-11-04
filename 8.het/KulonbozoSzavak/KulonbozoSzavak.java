import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class KulonbozoSzavak {
    public static void main(String[] args) {
        Set<String> kulonbozoSzavak = new HashSet<>();

        try {
            File fajl = new File("input.txt");
            Scanner scanner = new Scanner(fajl);

            while (scanner.hasNext()) {
                String szo = scanner.next();
                kulonbozoSzavak.add(szo);
            }
            scanner.close();

        }
        catch (FileNotFoundException e) {
            System.out.println("A fájl nem található!");
        }

        System.out.println("Különböző szavak száma: " + kulonbozoSzavak.size());
    }
}