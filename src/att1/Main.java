package att1;

public class Main {
    public static void main(String[] args) {
        String word = "gustavo";
        isPalindrome(word, 0,word.length()-1);
    }

    public static void isPalindrome(String word, int begin, int end){
        word = word.toLowerCase();
        if (begin>end) {
            System.out.println("Is Palindrome");
            return;
        }if (word.charAt(begin) == word.charAt(end)){
            isPalindrome(word, begin +1, end-1);
            return;
        }
        System.out.println("Not Palindrome");
        return;
    }
}