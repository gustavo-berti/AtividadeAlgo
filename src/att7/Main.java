package att7;

public class Main {
    public static void main(String[] args) {
        int a = fibbonaci(10);
        System.err.println(a);
    }

    public static int fibbonaci(int num){
        if(num==1){
            return num;
        }
        return (fibbonaci(num-1))+num;
    }
}
