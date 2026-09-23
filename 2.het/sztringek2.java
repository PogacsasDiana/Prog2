public class sztringek2
{
    // E. verbing
    // Ha az adott sztring hossza legalább 3, akkor
    // a végéhez adjuk hozzá az 'ing' ragot.
    // Ha 'ing'-re végződik, akkor ehelyett az 'ly'
    // ragot tegyük hozzá.
    // Ha a sztring hossza rövidebb 3 karakternél, akkor
    // hagyjuk változatlanul.
    // Adjuk vissza az eredménysztringet.
    private static String verbing(String s)
    {
        if (s.length() >= 3 && s.endsWith("ing")){
            return s + "ly";
        }
        if (s.length() >= 3){
            return s + "ing";
        }
        return s;
    }

    // F. not_bad
    // Egy adott sztringben keressük meg a 'not' és
    // 'bad' szavak előfordulási helyét. Ha a 'bad'
    // a 'not' szót követi, akkor cseréljük ki az
    // egész 'not'...'bad' részsztringet a 'good' szóra.
    // Adjuk vissza az eredmény sztringet.
    // Példa: 'This dinner is not that bad!' ->
    //        This dinner is good!
    private static String not_bad(String s)
    {
        int notIndex = s.indexOf("not");
        int badIndex = s.indexOf("bad");

        if (notIndex != -1 && badIndex != -1 && badIndex > notIndex){
            return s.substring(0, notIndex) + "good" + s.substring(badIndex + 3);
        }
        return s;
    }

    // G. front_back
    // Egy sztringet osszunk két részre, s a két részt nevezzük
    // a sztring elejének és végének. Ha a sztring hossza páros, akkor
    // a két rész hossza azonos. Ha a hossz páratlan, akkor az eleje
    // legyen egy karakterrel hosszabb mint a vége. !!!!
    // Például 'abcde' esetén a két rész: 'abc' és 'de'.
    // Két adott sztring (a és b) esetén adjunk vissza egy sztringet, mely
    // a következőképpen épül fel:
    // a-eleje + b-eleje + a-vége + b-vége
    // Például ha a = 'abcd' és b = 'xy', akkor az eredmény 'abxcdy' legyen.
    private static String front_back(String a, String b)
    {
        int midA = (a.length() + 1) / 2;
        String startA = a.substring(0, midA);
        String endA = a.substring(midA);


        int midB = (b.length() + 1) / 2;
        String startB = b.substring(0, midB);
        String endB = b.substring(midB);

        return startA + startB + endA + endB;
    }

    static void test(String got, String expected)
    {
        String prefix = (got.equals(expected) ? " OK " : "  X ");
        System.out.printf("%s got: %s; expected: %s\n", prefix, got, expected);
    }

    public static void main(String[] args)
    {
        System.out.println("verbing");
        test(verbing("hail"), "hailing");
        test(verbing("swiming"), "swimingly");
        test(verbing("do"), "do");

        System.out.println();
        System.out.println("not_bad");
        test(not_bad("This movie is not so bad"), "This movie is good");
        test(not_bad("This dinner is not that bad!"), "This dinner is good!");
        test(not_bad("This tea is not hot"), "This tea is not hot");
        test(not_bad("It's bad yet not"), "It's bad yet not");

        System.out.println();
        System.out.println("front_back");
        test(front_back("abcd", "xy"), "abxcdy");
        test(front_back("abcde", "xyz"), "abcxydez");
        test(front_back("Kitten", "Donut"), "KitDontenut");
    }
}