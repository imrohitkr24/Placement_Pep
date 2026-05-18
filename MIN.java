public class MIN {
    public static void main(String []args){
        int[] arr = {34,35,22,8,9298,7493,7392,73,28,937,63,64,2};
        int Min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<Min){
                Min = arr[i];
            }
        }
        System.out.println(Min);
    }
}
