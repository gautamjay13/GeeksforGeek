class Solution {
    int missingNum(int arr[]) {
        // code here
        int size = arr.length;
int N = size + 1;

        
        long sum = 0 ;
       long actual = (long) N * (N + 1) / 2;
        
        for ( int i = 0 ; i < size ; i++){
            sum = sum + arr[i] ;
        }
        
        return (int)(actual-sum) ;
    }
}