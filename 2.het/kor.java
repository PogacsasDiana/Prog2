import java.util.Scanner;

class Circle {
    private double sugar;

    public Circle(double sugar) {
        this.sugar = sugar;
    }

    public double kerulet() {
        return 2 * sugar * Math.PI;
    }

    public double terulet() {
        return sugar * sugar * Math.PI;
    }
}

public class kor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Add meg a kor sugaranak hosszat (valos szamkent): ");
        double sugar = scanner.nextDouble();

        Circle circle = new Circle(sugar);

        System.out.println("\n--- Eredmenyek ---");
        System.out.println("A kor kerulete: " + circle.kerulet());
        System.out.println("A kor terulete: " + circle.terulet());

        scanner.close();
    }
}