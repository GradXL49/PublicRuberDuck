/*
 * Code auto generated by the Rubber Duck programming tool on 2022/03/19 10:11:30
 * Binary search on a number array.
 */
package output;


public class BinaryNumSearch {
	//variables
	static double[] arr = {1.1,1.2,1.3,1.4,1.5};
	static double target = 1.3;

	//main
	public static void main(String[] args) {
		System.out.println("Searching for: "+target);

		int result = binarySearch(arr, 0, arr.length-1, target);

		if(result > -1) System.out.println(target+" was found at position "+result);
		else System.out.println(target+" was not found in the array");

	}

	//Binary Search modified from https://www.geeksforgeeks.org/binary-search/
	private static int binarySearch(double[] arr, int l, int r, double x) {
		if(r >= l) {
			int mid = l+(r-1)/2;

			if(arr[mid] == x)
				return mid;

			if(arr[mid] > x)
				return binarySearch(arr, l, mid-1, x);

			return binarySearch(arr, mid+1, r, x);
		}

		return -1;
	}

}