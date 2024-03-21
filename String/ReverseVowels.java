package String;

/*
 * Reverse Vowels from String.
 */
public class ReverseVowels {
    public static void main(String[] args) {
        String str = "welcome to india my friend";
        // reverseVowels(str); // old method
        reverseVowel(str); // new method
    }

    private static void reverseVowel(String str) {
        char[] s = str.toCharArray();
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            while (!isVowel(s[i])) i++;
            while (!isVowel(s[j])) j--;
            if (i >= j) break;

            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
        System.out.println(s);
    }

    private static void reverseVowels(String str) {
        int startIndex = 0;
        int endIndex = str.length() - 1;
        boolean flag;
        char[] characters = str.toCharArray();
        System.out.println(characters);

        while (startIndex < endIndex) {
            char sc = characters[startIndex];
            if (isVowel(sc)) {
                flag = true;
                while (flag) {
                    char ec = characters[endIndex];
                    if (isVowel(ec)) {
                        char temp = characters[startIndex];
                        characters[startIndex] = characters[endIndex];
                        characters[endIndex] = temp;
                        flag = false;
                    }
                    endIndex--;
                }
            }
            startIndex++;
        }
        System.out.println(characters);
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
