import java.util.*;

public class ArrayLeftRotate {
    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }

    }

    public static void leftrotate(int[] arr,int k){
        int n = arr.length;
        k = k%n;
        if (k==0){
            return;
        }
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);

    }

    

    public static void main(String[] args){

        int[] arr1 = {10,20,30,40,50};
        int k = 2;
        leftrotate(arr1,k);
        System.out.println("Left Rotated array :" + Arrays.toString(arr1));

    }

}