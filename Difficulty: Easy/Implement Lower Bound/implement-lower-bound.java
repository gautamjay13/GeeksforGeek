class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int n = arr.length;
        int lowerbound = n ;
        int lo = 0 , hi=n-1 ;
        while (lo<=hi){
            int mid =lo+(hi-lo)/2 ;
            if(arr[mid]>=target){
                lowerbound = Math.min(lowerbound,mid);
                hi = mid -1 ;
            }
            else lo=mid+1;
        }
        return lowerbound ;
    }
}
