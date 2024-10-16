package att8;

public class Main {
    public static void main(String[] args) {
        int result = sum(145);
        System.out.println(result);
    }

    public static int sum(int num){
        if (num < 10) {
            return num;
        } else {
            return (num % 10) + sum(num / 10);
        }
    }
}
