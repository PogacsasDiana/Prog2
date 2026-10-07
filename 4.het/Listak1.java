import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Listak1
{
    // A. match_ends
    
    private static int matchEnds(List<String> words)
    {
        int db = 0;
        for (String s : words) {
            if (s.length() >= 2 && s.charAt(0) == s.charAt(s.length() - 1)) {
                db++;
            }
        }
        return db;
    }

    // B. front_x
    
    private static List<String> frontX(List<String> words)
    {
        List<String> xLista = new ArrayList<>();
        List<String> egyebLista = new ArrayList<>();

        for (String s : words) {
            if (s.startsWith("x")) {
                xLista.add(s);
            } else {
                egyebLista.add(s);
            }
        }

        Collections.sort(xLista);
        Collections.sort(egyebLista);

        xLista.addAll(egyebLista);
        return xLista;
    }

    private static void test(int got, int expected)
    {
        String prefix = (got == expected) ? " OK " : " X ";
        System.out.printf("%s got: %s; expected: %s\n", prefix, got, expected);
    }

    private static void test(List<String> got, List<String> expected)
    {
        var prefix = (got.equals(expected)) ? " OK " : " X ";
        System.out.printf("%s got: %s; expected: %s\n", prefix, got, expected);
    }

    
    public static void main(String[] args)
    {
        System.out.println("match_ends");
        test(matchEnds(List.of("aba", "xyz", "aa", "x", "bbb")), 3);
        test(matchEnds(List.of("", "x", "xy", "xyx", "xx")), 2);
        test(matchEnds(List.of("aaa", "be", "abc", "hello")), 1);

        System.out.println();
        System.out.println("front_x");
        test(frontX(List.of("bbb", "ccc", "axx", "xzz", "xaa")),
             List.of("xaa", "xzz", "axx", "bbb", "ccc"));
        test(frontX(List.of("ccc", "bbb", "aaa", "xcc", "xaa")),
             List.of("xaa", "xcc", "aaa", "bbb", "ccc"));
        test(frontX(List.of("mix", "xyz", "apple", "xanadu", "aardvark")),
             List.of("xanadu", "xyz", "aardvark", "apple", "mix"));
    }
}
