/*
	简单选择排序
*/

public class SelectionSort{

	//主方法
	public static void selectionSort(int[] arrs){
		int temp = 0;
		int position = 0;
		for (int i = 0; i < arrs.length; i++ ) {
			position = i;
			temp = arrs[i];
			for (int j = i + 1;j < arrs.length;j++) {
				if (temp > arrs[j]) {
					temp = arrs[j];
					position = j;
				}
			}
			arrs[position] = arrs[i];
			arrs[i] = temp;
		}
	}

	// test
	public static void main(String[] args) {
		int[] nums = {0,23,43,12,16,21,33};
		selectionSort(nums);
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}
}