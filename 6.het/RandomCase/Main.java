import java.util.Scanner;

class PyUtils {
    public static String input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Text: ");
        return scanner.nextLine();
    }
}

class StringUtils {
    public static String randomCase(String text) {
        String result = "";
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            if (Math.random() < 0.5) {
                result += Character.toLowerCase(c);
            } else {
                result += Character.toUpperCase(c);
            }
        }
        
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        String szoveg = PyUtils.input();
        
        String randomSzoveg = StringUtils.randomCase(szoveg);
        
        System.out.println(randomSzoveg);
    }
}