/*
 * Arrays are of size N and 2N where you have to merge the sorted array in place onto the 2N array
 * 
 */
public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int[] arr1 = {2,4,6,9,12,0,0,0};
		int[] arr2 = {3,7,11};
		int[] arr3 = mergeTwoSortedArrays(arr1,8,arr2,3);
		System.out.println("Sorted Array is ");
		for(int i : arr3) {
			System.out.print(" "+i);
		}

	}
	public static int[] mergeTwoSortedArrays(int[] arr1, int m, int[] arr2, int n) {
		if(m == 0) return arr2;
		if(n == 0) return arr1;
		int l1 = m-n-1;
		int l2 = n-1;
		int k = m -1;
		while(l1 >=0 && l2>=0) {
			if(arr1[l1] >= arr2[l2]) {
				arr1[k--] = arr1[l1];
				l1--;
			}
			else {
				arr1[k--] = arr2[l2];
				l2 --;
			}
		}
		while(l2>=0) {
			arr1[k--] = arr2[l2];
			l2--;
		}
		return arr1;
	}

}
