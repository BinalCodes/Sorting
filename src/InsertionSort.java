
public class InsertionSort {
	int[] arr ;
	InsertionSort(int capacity){
		
	}
	public static void main(String[] args) {
		InsertionSort b = new InsertionSort(7);
		b.arr = new int[]{2,12,16,3,4,9,21,1};
		b.insertionSort(b.arr);
		for (int i=0; i< b.arr.length ; i++) {
			System.out.println(b.arr[i]);
		}
	}
	public void insertionSort(int arr[]) {
		int temp, i;
		for (int out = 1; out < arr.length; out++) {
			temp = arr[out];
			i = out;
			while (i> 0 && arr[i-1] > temp) {
				arr[i] = arr[i-1];
				i--;
			}
			arr[i] = temp;
		}
	}

}
