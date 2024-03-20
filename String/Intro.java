package String;

public class Intro {
    public static void main(String[] args) {

        // Literal declaration
        String str = "Prem Danej";
        System.out.println(str);

        // Using new Keyword
        str = new String("Laxmi Chit Fund");
        System.out.println(str);

        // Using StringBuilder
        StringBuilder name = new StringBuilder();
        name.append("My Name Is ");
        name.append("Prem.");
        System.out.println(name);
    }
}
