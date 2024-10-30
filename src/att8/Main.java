package att8;

public class Main {

    public static void main(String[] args) {
        People[] people = new People[6];
        people[0] = new People("João", 20, "São Paulo");
        people[1] = new People("Maria", 25, "Rio de Janeiro");
        people[2] = new People("José", 30, "Curitiba");
        people[3] = new People("Ana", 35, "Salvador");
        people[4] = new People("Carlos", 40, "Belo Horizonte");
        people[5] = new People("Mariana", 45, "Brasília");
        People[] aux = new People[people.length];
        mergeSort(people, aux, 0, people.length - 1);
        for (People person : people) {
            System.out.println(person.getName() + " " + person.getAge() + " " + person.getCity());
        }
    }

    public static void mergeSort(People[] array, People[] aux, int begin, int end) {
        if (begin < end){
            int middle = (begin + end) / 2;
            mergeSort(array, aux, begin, middle);
            mergeSort(array, aux, middle + 1, end);
            intercalation(array, aux, begin, middle, end);
        }
    }

    private static void intercalation(People[] array, People[] aux, int begin, int middle, int end) {
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
            } else if (aux[left].getAge() < aux[right].getAge()) {
                array[i] = aux[left++];
            } else {
                array[i] = aux[right++];
            }
        }
    }   
}
