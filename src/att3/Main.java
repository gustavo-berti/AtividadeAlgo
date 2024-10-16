package att3;

public class Main {
    public static void main(String[] args) {
        String[] words = {"João", "Maria", "José", "Ana", "Carlos", "Mariana"};
        String[] aux = new String[words.length];
        mergeSort(words, aux, 0, words.length - 1);
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void mergeSort(String[] array, String[] aux, int begin, int end) {
        if (begin < end){
            int middle = (begin + end) / 2;
            mergeSort(array, aux, begin, middle);
            mergeSort(array, aux, middle + 1, end);
            intercalation(array, aux, begin, middle, end);
        }
    }

    private static void intercalation(String[] array, String[] aux, int begin, int middle, int end) {
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
            } else if (aux[left].charAt(0) < aux[right].charAt(0)) {
                array[i] = aux[left++];
            } else {
                array[i] = aux[right++];
            }
        }
    }   
}
