import java.util.HashMap;

class ArraySubsetHashTables {
    static boolean isSubset(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Store all elements of arr1 in a hashmap with their frequencies
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check if all elements of arr2 exist in arr1
        for (int num : arr2) {
            if (!map.containsKey(num) || map.get(num) == 0) {
                return false; // Element not found in arr1
            }
            // Reduce the frequency since we used it once
            map.put(num, map.get(num) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11, 3, 7, 1};

        System.out.println(isSubset(arr1, arr2) ? "arr2 is a subset of arr1" : "arr2 is NOT a subset of arr1");
    }
}

/*
time complexity: O(N): O(n + m)
 */