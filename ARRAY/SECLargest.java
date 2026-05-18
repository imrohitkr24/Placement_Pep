public class SECLargest{
    public static void main(String []args){
        int [] arr = {2,4,5,7,9};
        int Max = Integer.MIN_VALUE;
        int SecMax = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            if(arr[i]>SecMax){
                SecMax=Max;
                Max=arr[i];
                }else if ( arr[i]>SecMax&&arr[i]!=Max){
                    SecMax =arr[i];
                }
            
            }
            System.out.println(SecMax);
        }
        
    }
