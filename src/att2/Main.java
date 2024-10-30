package att2;

public class Main {
    public static void main(String[] args) {
        int[] array = { 1, 4, 5};
        System.err.println(sumArray(array));
    }

    public static int sumArray(int[] array) {
        int size = array.length-1;
        int[] aux = new int[size];
        for (int i = 0; i < aux.length; i++) {
            aux[i] = array[i];
        }
        if(aux.length==1){
            return aux[0]+array[size];
        }
        return array[size] + sumArray(aux);
    }
}
