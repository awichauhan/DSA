// linear search in ordered array

import java.util.Scanner;

public class LinearSearch{
    public static void main(String a[]){
        int arr[] = {2,4,6,8,10};
        int size = arr.length;
        Scanner scanner = new Scanner(System.in);

        // Taking integer input
        System.out.print("Enter an integer: ");
        int find = scanner.nextInt();

        for (int i = 0; i <= size;  i++ )
        {
            System.out.println("one loop");
            if(arr[i] == find) {
                System.out.print("Found element " + i + " ");
                return;
            } else if(arr[i] >= find){
                break; }
        }
        System.out.println("element not found");
    }
}