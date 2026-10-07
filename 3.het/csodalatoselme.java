public class csodalatoselme {
    
    public static String dekodol(String szoveg) {
        return szoveg
            .replace('3', 'E')
            .replace('4', 'A')
            .replace('0', 'O')
            .replace('1', 'I')
            .replace('7', 'T')
            .replace('5', 'S')
            .replace('2', 'Z')
            .replace('8', 'B');
    }
}
