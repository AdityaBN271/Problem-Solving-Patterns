import java.util.*;

public class find_smallest_element {
    public static void main(String[] args){
        // int[] arr ={10,20,30,40,50};
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n;i++){
            System.out.println("Enter "+(i+1)+" Element: ");
            arr[i]=sc.nextInt();
        }
        
        int smallest = arr[0];
        for(int i=1; i<arr.length;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        
        System.out.println("Smallest element in array is: " + smallest);
    }
}