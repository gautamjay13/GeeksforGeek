class Solution {
	static int findFloor(int[] arr, int x) {
		// code here
		int n = arr.length ;
		int left = 0, right = n - 1;
		int idx = -1 ;
		while (left <= right) {
			int mid = (left + right) /2 ;
			if (arr[mid]>x) {
				right = mid - 1 ;
			}
			else
				{ idx = mid ;
			left = mid + 1 ;
		}
	}
	return idx ;
}
}
