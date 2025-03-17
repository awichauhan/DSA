public class SelectionSortBasic {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Outer loop to move the boundary of the sorted subarray
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the first element is the minimum
            // Find the index of the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update minIndex if a smaller element is found
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};

        System.out.println("Unsorted Array:");
        printArray(arr);

        selectionSort(arr);

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
