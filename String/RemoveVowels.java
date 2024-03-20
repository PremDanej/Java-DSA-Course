package String;

/*
 * Remove Vowels character from String.
 */
public class RemoveVowels {
    public static void main(String[] args) {
        String str = "welcome to india my friend";
        removeVowel(str);
    }

    private static void removeVowel(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
                continue;
            }
            System.out.print(ch);
        }
    }
}
