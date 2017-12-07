/*
	冒泡排序
*/

public class BubbleSort{

	// 主方法 
	public static void bubbleSort(int[] arrs){
		int temp = 0;
		for (int i = 0; i < arrs.length - 1; i++) {
			for (int j = 0; j < arrs.length - 1 - i; j++) {
				if (arrs[j] > arrs[j + 1]) {
					temp = arrs[j];
					arrs[j] = arrs[j + 1];
					arrs[j + 1] = temp;
				}
			}
		}
	} 

	// test
	public static void main(String[] args) {
		int[] nums = {0,9,6,3,4,2,7,8,8,10};
		bubbleSort(nums);
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}
}