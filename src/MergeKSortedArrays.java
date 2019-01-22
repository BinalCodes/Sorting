import java.util.PriorityQueue;

public class MergeKSortedArrays {

	public static void main(String[] args) {
		int[] arr1 = {2,4,6,9,12};
		int[] arr2 = {3,7,11};
		int[] arr3 = {5,9,10,24};
		int k =3;
		mergeKSortedArr(arr1,arr2,arr3,k);
	}
	public static void mergeKSortedArr(int[] arr1,int[] arr2, int[] arr3,int k) {
		if(arr1.length == 0 && arr2.length ==0 && arr3.length == 0)
			return ;
		PriorityQueue<int[]> queue = new PriorityQueue<int[]> (k, (i1,i2)-> i1[0]-i2[0]);
		//for()
	}

}
