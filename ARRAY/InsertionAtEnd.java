public class InsertionAtEnd {

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;

        int size = 4;

        int value = 5;

        arr[size] = value;

        size++;

        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}