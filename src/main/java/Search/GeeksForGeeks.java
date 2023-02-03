package Search;




public class GeeksForGeeks {
    private static int length;

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 2};
        int n = arr.length;
        int K = 5;

        System.out.println(binarysearch(arr, n, K));
    }

    public static int binarysearch(int arr[], int n, int k) {
        int low = 0;
        int high =length - 1;

        while (low <= high) {

            // Finding the mid using floor division
            int mid = low + ((high - low) / 2);

            // Target value is present at the middle of the array
            if (arr[mid] == k) {
                return mid;
            }

            // Target value is present in the low subarray
            else if (k < arr[mid]) {
                high = mid - 1;
            }

            // Target value is present in the high subarray
            else if (k > arr[mid]) {
                low = mid + 1;
            }
        }

        // Target value is not present in the array
        return -1;
    }
}