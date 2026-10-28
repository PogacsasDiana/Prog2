import java.util.Scanner;

public class PyUtils {
    public static String input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Text: ");
        return scanner.nextLine();
    }
}