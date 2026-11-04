import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DuplikatumokTavolitasa {
    public static void main(String[] args) {
        int[] adatok = {5, 2, 3, 5, 1, 4, -200, 5, 1, 3, 2, 2, 5};

        List<Integer> lista = new ArrayList<>();

        for (int szam : adatok) {
            if (!lista.contains(szam)) {
                lista.add(szam);
            }
        }

        Collections.sort(lista);

        System.out.println(lista);
    }
}