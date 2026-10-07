import java.util.ArrayList;
import java.util.List;

public class PyUtils {

    public static List<Integer> range(int stop) {
        return range(0, stop, 1);
    }

    public static List<Integer> range(int start, int stop) {
        return range(start, stop, 1);
    }

    public static List<Integer> range(int start, int stop, int step) {
        List<Integer> eredmeny = new ArrayList<>();
        
        if (step <= 0) {
            return eredmeny;
        }

        for (int i = start; i < stop; i += step) {
            eredmeny.add(i);
        }
        return eredmeny;
    }

    // Tesztelés
    public static void main(String[] args) {
        System.out.println("range(0, 5) -> " + range(0, 5));         // [0, 1, 2, 3, 4]
        System.out.println("range(3, 7) -> " + range(3, 7));         // [3, 4, 5, 6]
        System.out.println("range(10) -> " + range(10));             // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println("range(4, 20, 2) -> " + range(4, 20, 2)); // [4, 6, 8, 10, 12, 14, 16, 18]
    }
}