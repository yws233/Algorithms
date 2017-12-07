/*
	堆排序
*/

public class HeapSort{

	public static void heapSort(int[] arrs){
		for (int i = arrs.length - 1; i >0; i--) {
			buildMaxHeap(arrs, i);
			swap(arrs, 0, i);
		}
	}

	private static void swap(int[] arrs,int i, int j){
		int temp = arrs[i];
		arrs[i] = arrs[j];
		arrs[j] = temp;
	}

	private static void buildMaxHeap(int[] arrs,int end){
		for (int i = (end - 1) / 2; i >= 0; i-- ) {
			int k = i;
			while (2 * k + 1 <= end) {
				int child = 2 * k + 1;
				if (child + 1 <= end && arrs[child] < arrs[child + 1]) {
					child++;
				}
				if (arrs[child] > arrs[k]) {
					swap(arrs, k, child);
					k = child;
				} else {
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] nums = {0,9,6,3,4,2,7,8,8,10};
		heapSort(nums);
		for (int num : nums) {
			System.out.print(num + " ");
		}

	}
}