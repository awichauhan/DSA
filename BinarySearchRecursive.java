public class BinarySearchRecursive {
    public static int binarySearchRecursive(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1; // Base case: element not found
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid; // Target found
        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, mid + 1, right, target); // Search right half
        } else {
            return binarySearchRecursive(arr, left, mid - 1, target); // Search left half
        }
    }

    public static void main(String[] args) {
        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14, 16}; // Sorted array
        int target = 10;

        int result = binarySearchRecursive(sortedArray, 0, sortedArray.length - 1, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
