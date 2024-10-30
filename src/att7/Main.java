package att7;
public class Main {
    public static void main(String[] args) throws Exception {
        int[][] array = { {5, 4, 9}, {3, 2, 7}, {8, 1, 6}};
        for(int i = 0; i < array.length; i++) {
            int[] aux = new int[array[i].length];
            mergeSort(array[i], aux, 0, array.length - 1);
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        
    }

    public static void mergeSort(int[] array, int[] aux, int begin, int end) {
        if (begin < end){
            int middle = (begin + end) / 2;
            mergeSort(array, aux, begin, middle);
            mergeSort(array, aux, middle + 1, end);
            intercalation(array, aux, begin, middle, end);
        }
    }

    private static void intercalation(int[] array, int[] aux, int begin, int middle, int end) {
        for (int i = begin; i <= end; i++) {
            aux[i] = array[i];
        }
        int left = begin;
        int right = middle + 1;
        for (int i = begin; i <= end; i++) {
            if (left > middle) {
                array[i] = aux[right++];
            } else if (right > end) {
                array[i] = aux[left++];
            } else if (aux[left] < aux[right]) {
                array[i] = aux[left++];
            } else {
                array[i] = aux[right++];
            }
        }
    }
}
