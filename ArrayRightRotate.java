import java.util.*;

public class ArrayReightRotate {
    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }

    }

    public static void rightrotate(int[] arr,int k){
        int n = arr.length;
        k = k%n;
        if (k==0){
            return;
        }
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-k-1);
        reverse(arr,0,n-1);

    }

    

    public static void main(String[] args){

        int[] arr2 = {10,20,30,40,50};
        int k = 2;
        rightrotate(arr2,k);
        System.out.println("Right Rotated array :" + Arrays.toString(arr2));



       
    }
}