/*
	归并排序
*/
public class MergeSort{

	//主方法
	public static void mergeSort(int[] arrs){

		//调用方法
		mergeSort(arrs,0,arrs.length - 1);
	}

	public static void mergeSort(int[] arrs,int left,int right){
		if (left < right) {
			int center = (left + right) / 2; //取得中间值
			mergeSort(arrs, left, center);
			mergeSort(arrs, center + 1, right);
			mergeSort(arrs, left, center, right);
		}
	}

	public static void mergeSort(int[] arrs,int left,int center,int right){
		int[] tempArr = new int[arrs.length]; //存放分组排序后的数组
		int mid = center + 1;
		int temp = left;
		int third = left;
		while (left <= center && mid <= right) {
			if (arrs[left] <= arrs[mid]) {
				tempArr[third++] = arrs[left++];
			} else {
				tempArr[third++] = arrs[mid++];
			}
		}
		while (left <= center) {
			tempArr[third++] = arrs[left++];
		}
		while(mid <= right){
			tempArr[third++] = arrs[mid++];
		}
		while (temp <= right) {
			arrs[temp] = tempArr[temp++];
		}
	}
	
	// test
	public static void main(String[] args) {
		int[] nums = {1,6,3,12,18,13,19,21,14};
		mergeSort(nums);
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}
}