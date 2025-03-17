class ArraySubsetNestedLoop {
    static boolean isSubset(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        // Iterate through all elements of arr2
        for (int i = 0; i < m; i++) {
            boolean found = false;

            // Check if arr2[i] exists in arr1
            for (int j = 0; j < n; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }

            // If an element in arr2 is not found in arr1, return false
            if (!found) {
                return false;
            }
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
time complexity: O(N^2): O(m*n)

 */