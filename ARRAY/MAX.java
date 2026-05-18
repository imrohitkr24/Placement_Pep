public class MAX{
    public static void main(String[]args){
        int [] arr = {5,7,13,15,19,23,1000};
        int Max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>Max){
                Max=arr[i];
            }
        }
        System.out.println(Max);
    }
}


  

