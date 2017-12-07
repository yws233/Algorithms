	/*
	快速排序
*/

public class QuickSort{

	//主方法
	public static void quickSort(int[] arrs){

		//调用方法
		quickSort(arrs,0,arrs.length - 1);

	}

	public static void quickSort(int[] arrs,int left,int right){
		int middle = 0;
		if (left < right) {
			middle = partition(arrs,left,right);
			quickSort(arrs, left, middle - 1);
			quickSort(arrs, middle + 1,right);
		}
	}

	//分区
	public static int partition(int[] arrs,int left,int right){
		int pivot = arrs[left]; //选取左边元素为基准
		while(left < right){
			while(left < right && arrs[right] >= pivot){
				right--;
			}
			if (left < right) {
				arrs[left++] = arrs[right];
			}
			while(left < right && arrs[left] <= pivot){
				left++;
			}
			if (left < right) {
				arrs[right--] = arrs[left];
			}
		}
		arrs[left] = pivot;
		return left;
	}

	// test
	public static void main(String[] args) {
		int[] nums = {1,45,32,18,32,12,10,21,15,10};
		quickSort(nums);
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}
}