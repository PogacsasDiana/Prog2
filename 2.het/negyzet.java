import java.util.Scanner;

class Negyzet {
    private int oldal;

    public Negyzet(int oldal) {
        this.oldal = oldal;
    }

    public int kerulet() {
        return 4 * oldal;
    }

    public int terulet() {
        return oldal * oldal;
    }
}

public class negyzet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Add meg a negyzet oldalanak hosszat (egesz szamkent): ");
        int oldal = scanner.nextInt();

        Negyzet negyzet = new Negyzet(oldal);

        System.out.println("A negyzet kerulete: " + negyzet.kerulet());
        System.out.println("A negyzet terulete: " + negyzet.terulet());

        scanner.close();
    }
}