//Count the occurrence of target;
import java.util.*;
public class Count{
    public static void main(String[]args){
        int []arr={1,2,3,3,3,4,5,6,3};
        int target=3;
        int count =0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
            count++;
        }
        }
        System.out.println("count=" + count);
    }
}