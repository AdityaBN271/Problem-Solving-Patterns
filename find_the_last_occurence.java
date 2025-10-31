import java.util.*;

public class find_the_last_occurence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("Enter "+(i+1)+" Element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to find last occurrence: ");
        int target = sc.nextInt();
        int last_occurrence = -1;
        for (int i = arr.length - 1; i>=0; i--){
            if (arr[i] == target){
                last_occurrence = i;
                break;
            }


        }
        if (last_occurrence != -1){
            System.out.println("Last occurrence of " + target + " is at index: " + last_occurrence);
        } else {
            System.out.println(target + " is not present in the array.");
        }
    }
}