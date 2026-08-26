import java.util.Arrays;

class Solution {
    public double findMedian(int[] arr) {
        int n = arr.length;

        Arrays.sort(arr);

        if (n % 2 != 0) {
            return arr[n / 2];
        } else {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }
    }
}