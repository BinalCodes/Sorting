import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] a = {33,12,43,1,6,4};
		mergesort(a, a.length);

	}

	public static void mergesort(int[] a, int n) {
		if(n<2)
			return;
		int mid = n/2;
		int l[] = new int[mid];
		int r[] = new int[n-mid];
		for(int i =0;i< mid; i++) {
			l[i] = a[i];
		}
		for(int i =mid ; i< n ; i++) {
			r[i -mid] = a[i];
		}
		mergesort(l,mid);
		mergesort(r,n-mid);
		merge(a,l,r,mid,n-mid);
	}
	public static void merge (int[]a , int[] l, int[] r, int low,int high) {
		int i =0, j= 0, k =0;
		while(i <low && j<high) {
			if(l[i] <= r[j]) {
				a[k++] = l[i];
				i++;
			}
			else {
				a[k++] = r[j];
				j++;
			}
		}
		while(i<low) {
			a[k++] = l[i++];
		}
		while(j<high) {
			a[k++] = r[j++];
		}
		//print array
		System.out.println(Arrays.toString(a));
	}
}
