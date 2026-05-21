public class SelectionSort{
    public static void main(String[]args){
        int []arr={13,46,24,52,20,9};
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int MinIndex=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[MinIndex]){
                    MinIndex=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[MinIndex];
            arr[MinIndex]=temp;
        }
          for (int num : arr) {
            System.out.print(num + " ");
    }
}
}