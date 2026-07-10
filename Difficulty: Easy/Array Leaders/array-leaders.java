import java.util.Collections;
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE ;
        int n = arr.length ;
        for( int i = n-1 ; i>=0 ; i--) {
            if (arr[i]>= max){
                max = arr[i] ;
                ans.add(max);
            }
        }
        Collections.reverse(ans);
        return ans ;
    }
}
