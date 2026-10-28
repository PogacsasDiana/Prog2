public class Main {
    public static void main(String[] args) {
        String szoveg = PyUtils.input();
        String randomSzoveg = StringUtils.randomCase(szoveg);
        System.out.println(randomSzoveg);
    }
}