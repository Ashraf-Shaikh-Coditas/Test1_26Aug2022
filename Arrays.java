package Test1_26Aug2022;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements to be entered.");
        int num = scanner.nextInt();

        int arr[] = new int[num];
        System.out.println("Enter the elements for array.");
        for(int i = 0 ; i<num;i++) {
            arr[i] = scanner.nextInt();
        }

//        java.util.Arrays.sort(arr);
//
//        int result = arr[3];
//
//        System.out.println("The 4th maximum value in the array is "+result);

        System.out.print("\nOdd index values are   :: ");
        for(int i = 0 ; i< arr.length;i++) {
            if(i%2 == 1) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
