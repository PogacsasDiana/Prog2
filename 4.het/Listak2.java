import java.util.ArrayList;
import java.util.List;

class Listak2
{
    // D.
    private static List<Integer> removeAdjacent(List<Integer> nums)
    {
        List<Integer> eredmeny = new ArrayList<>();
        for (Integer num : nums) {
            if (eredmeny.isEmpty() || !eredmeny.get(eredmeny.size() - 1).equals(num)) {
                eredmeny.add(num);
            }
        }
        return eredmeny;
    }

    // E.
    private static List<String> listMerge(List<String> li1, List<String> li2)
    {
        List<String> eredmeny = new ArrayList<>();
        int i = 0, j = 0;
        
        while (i < li1.size() && j < li2.size()) {
            if (li1.get(i).compareTo(li2.get(j)) < 0) {
                eredmeny.add(li1.get(i));
                i++;
            } else {
                eredmeny.add(li2.get(j));
                j++;
            }
        }
        
        while (i < li1.size()) {
            eredmeny.add(li1.get(i));
            i++;
        }
        
        while (j < li2.size()) {
            eredmeny.add(li2.get(j));
            j++;
        }
        
        return eredmeny;
    }

    private static <T> void test(List<T> got, List<T> expected)
    {
        String prefix = (got.equals(expected)) ? " OK " : " X ";
        System.out.printf("%s got: %s; expected: %s\n", prefix, got, expected);
    }

    public static void main(String[] args)
    {
        System.out.println("remove_adjacent");
        test(removeAdjacent(List.of(1, 2, 2, 3)), List.of(1, 2, 3));
        test(removeAdjacent(List.of(2, 2, 3, 3, 3)), List.of(2, 3));
        test(removeAdjacent(List.of()), List.of());

        System.out.println();
        System.out.println("list_merge");
        test(listMerge(List.of("aa", "xx", "zz"), List.of("bb", "cc")),
             List.of("aa", "bb", "cc", "xx", "zz"));
        test(listMerge(List.of("aa", "xx"), List.of("bb", "cc", "zz")),
             List.of("aa", "bb", "cc", "xx", "zz"));
        test(listMerge(List.of("aa", "aa"), List.of("aa", "bb", "bb")),
             List.of("aa", "aa", "aa", "bb", "bb"));
    }
}