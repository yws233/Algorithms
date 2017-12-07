/*
	基数排序
*/
public class RadixSort{

	//主方法
	public static void radixSort(int[] arrs){

		//求数组中的最大元素
		int max = arrs[0];
		for (int i = 0; i < arrs.length; i++ ) {
			if (arrs[i] > max) {
				max = arrs[i];
			}
		}
		//判断最大的元素有几位，确定要循环多少次
		int time = 0;
		while (max > 0) {
			max /= 10;
			time++;
		}

		int k = 0;
		int m = 0;
		int n = 1;
		int[][] tempArr = new int[10][arrs.length];  //存放每次排序的元素
		int[] order = new int[10]; //记录每个位置上的元素个数
		while (m < time) {
			for (int i = 0; i < arrs.length;i++) {
				int sd = (arrs[i] / n) % 10;
				tempArr[sd][order[sd]] = arrs[i];
				order[sd]++;
			}
			for (int i = 0; i < 10; i++ ) {
				for (int j = 0; order[i] != 0 && j < order[i]; j++) {
					arrs[k++] = tempArr[i][j];
				}
				order[i] = 0;
			}
			n += 10;
			k = 0;
			m++;
		}
	}

	public static void main(String[] args) {
		int[] nums = {1,3,23,23,68,9,4,8};
		radixSort(nums);
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}
}