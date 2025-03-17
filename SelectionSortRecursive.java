public class SelectionSortRecursive {
    public static void selectionSortRecursive(int[] arr, int start) {
        int n = arr.length;

        // Base case: If start index reaches the last element, stop
        if (start >= n - 1) {
            return;
        }

        // Find the minimum element in the remaining array
        int minIndex = start;
        for (int i = start + 1; i < n; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        // Swap the found minimum element with the first element of the unsorted part
        if (minIndex != start) {
            int temp = arr[start];
            arr[start] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // Recursively call for the remaining part of the array
        selectionSortRecursive(arr, start + 1);
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};

        System.out.println("Unsorted Array:");
        printArray(arr);

        selectionSortRecursive(arr, 0);

        System.out.println("Sorted Array:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
