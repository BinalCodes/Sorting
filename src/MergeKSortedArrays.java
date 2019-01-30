import java.util.Arrays;
import java.util.PriorityQueue;

public class MergeKSortedArrays {
	static class Node{
		int val;
		int arrayIndex;
		int elementNextIndex; //stores the next index to be pushed from arrayIndex arr[arrayIndex[nextIndex]
		Node(int val,int arrayIndex, int elementIndex){
			this.arrayIndex = arrayIndex;
			this.elementNextIndex = elementIndex;
			this.val = val;
		}
	}
	public static void main(String[] args) {
		int[][] arr =  {{2,4,6,9,12},
					   {3,7,11,21,100},
					   {5,9,10,24,29}};
		int k =3;
		int n = 5;
		int[] result = mergeKSortedArr(arr,k,n);
		System.out.println(Arrays.toString(result));
	}
	public static int[] mergeKSortedArr(int[][] arr, int k, int n ){
		if(k<=1)
			return arr[0];
		
		int[] result = new int[k*n];
		PriorityQueue<Node> minHeap = new PriorityQueue<Node> (k, (n1,n2) -> n1.val -n2.val );
		// inserting the first element from each arr into the minheap
		for(int i = 0; i< k ; i++) {
			minHeap.offer(new Node(arr[i][0], i,1)); // next index = 1, arrIndex = i 
		}
		int m = 0;
		while(!minHeap.isEmpty()) {
			Node minNode = minHeap.poll();
			result[m++] = minNode.val;
			if(minNode.elementNextIndex < n) {
				minHeap.offer(new Node(arr[minNode.arrayIndex][minNode.elementNextIndex], minNode.arrayIndex, minNode.elementNextIndex+1));
			}
		}
		System.out.println("length of final result array is "+m);
		return result;
	}

}
