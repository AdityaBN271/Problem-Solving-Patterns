import java.util.*;

public class find_second_smallest_element {
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
        
        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length;i++){
            if(arr[i]<smallest){
                second_smallest = smallest;
                smallest = arr[i];
            } else if(arr[i]<second_smallest && arr[i]!=smallest){
                second_smallest = arr[i];
            }
        }
        
        if(second_smallest == Integer.MAX_VALUE){
            System.out.println("There is no second smallest element.");
        } else {
            System.out.println("Second smallest element in array is: " + second_smallest);
        }
    }
}