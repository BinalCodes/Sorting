
public class BubbleSort {
	int[] arr ;
	BubbleSort(int capacity){
		
	}
	public static void main(String[] args) {
		BubbleSort b = new BubbleSort(7);
		b.arr = new int[]{2,12,16,3,4,9,21,1};
		b.bubbleSort(b.arr);
		for (int i=0; i< b.arr.length ; i++) {
			System.out.println(b.arr[i]);
		}
	}
	public void bubbleSort (int[] arr) {
		for ( int out = arr.length-1 ; out > 0 ; out --) {
			for (int in = 0 ; in < out ; in++) {
				if(arr[in] > arr[in+1]) {
					swap (in,in+1);
				}
			}
		}
	}
	public void swap (int t1 , int t2 ) {
		int temp = arr[t1];
		arr[t1] = arr[t2];
		arr[t2] = temp;
	}

}
