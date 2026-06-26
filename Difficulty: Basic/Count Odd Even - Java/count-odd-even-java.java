/*Class solution with countOddEven() as its member function
* arr : input array
*/
class Solution {
	public static void countOddEven(Integer arr[]) {
		
		// Your code here
		int even = 0 ; int odd = 0 ;
		for (int i = 0 ; i < arr.length  ; i++) {
			if (arr[i]%2 == 0) {
				even++ ;
			}
			else {
				odd++ ;
			}
		}
		System.out.println(odd + " " + even) ;
	}
}
