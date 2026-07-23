class Solution {
    public int countZeros(int[][] mat) {
        // code here
        int count =0 ; 
        int n = mat.length ;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
              if (mat[i][j]==0) count++ ;
            }
            
        }
        return count ;
    }
};