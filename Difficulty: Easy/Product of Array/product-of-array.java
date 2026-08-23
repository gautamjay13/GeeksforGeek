class Solution {
    public long product(long arr[]) {
        int n = arr.length;
        long product = 1;
        long mod = 1000000007;

        for (int i = 0; i < n; i++) {
            product = (product * arr[i]) % mod;
        }

        return product;
    }
}