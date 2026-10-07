public class Hamming {
    
    public static int tavolsag(String s1, String s2) {
        int eltérés = 0;
        
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                eltérés++;
            }
        }
        
        return eltérés;
    }
}