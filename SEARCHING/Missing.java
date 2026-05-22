public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6};

        int n = 6; // total numbers should be 1 to 6

        for(int i = 1; i <= n; i++) {

            boolean found = false;

            for(int j = 0; j < arr.length; j++) {

                if(arr[j] == i) {
                    found = true;
                    break;
                }
            }

            if(found == false) {
                System.out.println("Missing number is: " + i);
            }
        }
    }
}