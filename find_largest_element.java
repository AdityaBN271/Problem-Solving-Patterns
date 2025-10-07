import java.util.*;

public class find_largest_element {
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
        
        int largest = arr[0];
        for(int i=1; i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        
        System.out.println("Largest element in array is: " + largest);
    }
}