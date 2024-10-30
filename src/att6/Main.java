package att6;

public class Main {
    public static void main(String[] args) {
        String aux = "", name = "Gustavo";
        invertString(name, aux);
    }

    public static void invertString(String word, String aux) {
        if (word.length() == 0) {
            System.out.println(aux);
            return;
        }
        aux += word.charAt(word.length() - 1);
        invertString((word.substring(0, word.length() - 1)), aux);
    }
}
