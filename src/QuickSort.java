import java.util.Arrays;

/*
 * 
 * Pivot element in this function is the rightmost element. Quick sort complexity goes to O(n2) if the array is in descending order
 * and element picked is the rightmost
 */
public class QuickSort {
	int[] arr = {38,21,42,4,76,8,12,21,36};
	public static void main(String[] args) {
		QuickSort q = new QuickSort();
		q.quickSort();
		System.out.println(Arrays.toString(q.arr));
		System.out.println("sorted array is ");
	}
	public void quickSort() {
		recQuicksort(0, arr.length-1);
	}
	// this method calls partitionIt recursively based on the pivot value
	public void recQuicksort (int left, int right) {
		if(right -left <=0) {
			return;
		}
		
		int partition = partitionIt(left, right);
		recQuicksort(left,partition-1 );
		recQuicksort(partition+1, right);
		
	}
	public int partitionIt( int left, int right) {
		long pivot = arr[right];
		int pivotIndex = right;
		right = right -1;
		while(true) {
			while(left <= right && arr[left] <=pivot) {
				left++;
			}
			while(left<=right && arr[right]>=pivot) {
				right --;
			}
			if(left>= right)
				break;
			else {
				swap(left,right);
			}
		}
		//swap pivot with left pointer so to put it at its proper place
		// since in our case pivot is always right element
		swap(left,pivotIndex);
		return left;
	}

	public void swap (int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
}
