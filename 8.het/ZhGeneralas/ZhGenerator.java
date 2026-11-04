import java.util.Random;

public class ZhGenerator {
    public static void main(String[] args) {
        final int SOROK = 10;
        final int OSZLOPOK = 20;

        Random random = new Random();
        char[] lehetségesElsők = {'a', 'b', 'c'};

        for (int i = 0; i < SOROK; i++) {
            for (int j = 0; j < OSZLOPOK; j++) {
                char elso = lehetségesElsők[random.nextInt(lehetségesElsők.length)];
                
                int masodik = random.nextInt(10);

                System.out.print("" + elso + masodik + " ");
            }
            System.out.println();
        }
    }
}