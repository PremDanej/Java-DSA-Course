package String;

/*
 * Reverse Vowels from String.
 */
public class ReverseVowels {
    public static void main(String[] args) {
        String str = "welcome to india my friend";
        reverseVowels(str);
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
