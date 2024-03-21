package String;

/*
 * Convert Uppercase character to Lowercase.
 */
public class ConvertLower {
    public static void main(String[] args) {
        String str = "wElcoMEtoIndiA";
        char[] s = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (s[i] >= 'A' && s[i] <= 'Z') {
                s[i] = (char) (s[i] - 'A' + 'a');
            }
        }
        System.out.println(s);
    }
}
