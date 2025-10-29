import java.util.*;

public class find_second_largest_element{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n;i++){
            System.out.println("Enter "+(i+1)+" Element: ");
            arr[i]=sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for (int i=0; i<arr.length ; i++){
            if (arr[i]>largest){
                second_largest = largest;
                largest = arr[i];
            }
            else if (arr[i]>second_largest && arr[i]!=largest){
                second_largest = arr[i];
            }

        }

        if (second_largest == Integer.MIN_VALUE){
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("Second largest element in array is: " + second_largest);
        }

    }

}