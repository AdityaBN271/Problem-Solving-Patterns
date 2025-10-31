import java.util.Scanner;

public class finding_the_first_occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");

        int n = sc.nextInt();
        int arr [] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + " Element: ");
            arr[i] = sc.nextInt();
        }   
        System.out.println("Enter the element to find first occurrence: ");
        int target = sc.nextInt();

        int first_occurrence = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                first_occurrence = i;
                break;
            }
        }
        if (first_occurrence != -1) {
            System.out.println("First occurrence of " + target + " is at index: " + first_occurrence);
        } else {
            System.out.println(target + " is not present in the array.");
        }


    }
}