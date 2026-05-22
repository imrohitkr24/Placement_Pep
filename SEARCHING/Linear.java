public class Linear {

    // Function for Linear Search
    public static int linear(int[] arr, int target) {

        // Traverse entire array
        for (int i = 0; i < arr.length; i++) {

            // Check if current element is target
            if (arr[i] == target) {
                return i; // target found
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1, 9};
        int target = 1;

        int result = linear(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}