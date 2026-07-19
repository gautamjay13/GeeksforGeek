class Solution {
	public static int findEquilibrium(int arr[]) {
		// code here
		int leftsum = 0 ;
		int rightsum = 0 ;
		int totalsum = 0;
		for (int i = 0 ; i<arr.length ; i++) {
			totalsum = totalsum + arr[i];
		}
		for (int i = 0 ; i<arr.length ; i++) {
			rightsum = totalsum - leftsum - arr[i] ;
			if (leftsum == rightsum) {
				return i ;
			}
			else {
				leftsum += arr[i] ;
			}
			
		}
		return - 1;
	}
}
