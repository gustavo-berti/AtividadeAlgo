package att6;

public class Main {
    public static void main(String[] args) {
        int a = maxCharInString("Arara", 'a');
        System.err.println(a);
    }

    public static int maxCharInString(String word, char c){
        word = word.toLowerCase();
        c = Character.toLowerCase(c);
        if(word.length()==1){
            if(word.charAt(0)==c){
                return 1;
            }else{
                return 0;
            }
        }
        if(word.charAt(word.length()-1)==c){
            return 1+maxCharInString(word.substring(0, word.length()-1), c);
        }else{
            return 0+maxCharInString(word.substring(0, word.length()-1), c);
        }
    }
}
