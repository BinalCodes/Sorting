/*
 * 
 * Complexity is still O(N2) but the swaps are O(N) and comparisons are still like bubble sort which 
 * is O(N2). Also element on the left is sorted everytime
 */
public class SelectionSort {

	int[] arr ;
	SelectionSort(int capacity){
		
	}
	public static void main(String[] args) {
		SelectionSort b = new SelectionSort(7);
		b.arr = new int[]{2,12,16,3,4,9,21,1};
		b.selectionSort(b.arr);
		for (int i=0; i< b.arr.length ; i++) {
			System.out.println(b.arr[i]);
		}
	}
	public void selectionSort(int[] arr) {
		int min;
		for (int out = 0 ; out< arr.length-1 ; out++) {
			min = out;
			for (int in = out+1; in <arr.length ; in++) {
				if(arr[in] < arr[min]) {
					min = in;
				}
			}
			swap(out,min);
		}
	}
	public void swap (int t1 , int t2 ) {
		int temp = arr[t1];
		arr[t1] = arr[t2];
		arr[t2] = temp;
	}

}
