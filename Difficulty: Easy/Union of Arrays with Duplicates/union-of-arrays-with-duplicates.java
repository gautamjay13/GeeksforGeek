class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for ( int ele : a){
            set.add(ele);
        }
        for ( int ele : b){
            set.add(ele);
        }
         ArrayList<Integer> ans = new ArrayList<>(set);
         return ans ;
    }
}