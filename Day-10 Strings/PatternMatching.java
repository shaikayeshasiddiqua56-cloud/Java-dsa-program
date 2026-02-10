public class PatternMatching {
    public static boolean patternMatch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j))
                    break;
            }
            if (j == m)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String text = "hello world";
        String pattern = "world";
        System.out.println("Pattern Found: " + patternMatch(text, pattern));
    }
}
