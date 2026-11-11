import java.util.Scanner;

public class DrawDiamondAssert {
    public static void drawDiamond(int h) {
        assert h > 0 && h % 2 != 0 : "A magasságnak (" + h + ") pozitív páratlan számnak kell lennie!";
        
        int mid = h / 2;
        for (int i = 0; i < h; i++) {
            int dist = Math.abs(mid - i);
            int nStars = h - 2 * dist;
            
            int spaces = (h - nStars) / 2;
            for (int s = 0; s < spaces; s++) System.out.print(" ");
            for (int st = 0; st < nStars; st++) System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Add meg a gyémánt magasságát (páratlan szám): ");
        int height = scanner.nextInt();
        
        System.out.println("\n--- Eredmény ---");
        drawDiamond(height);
        
        scanner.close();
    }
}