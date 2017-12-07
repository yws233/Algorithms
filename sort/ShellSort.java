/*
	希尔排序
*/
public class ShellSort{

	//主方法
	public static void shellSort(int[] arrs){
		int len = arrs.length; //增量
		int temp = 0;
		for (int skip = len / 2; skip > 0; skip /= 2 ) { //取中间值分组
			for (int i = skip; i < arrs.length; i++ ) { //从中间值开始
				temp = arrs[i]; //将中间值赋予
				int j = i - skip; // 从0开始
				while (j >= 0 && temp < arrs[j]) { 
					arrs[j + skip] = arrs[j]; // 如果大于中间值，则放在中间值的后边
					j = j - skip; //比中间值小则退出循环
				}
				arrs[j + skip] = temp; //如果小于中间值，则放在中间值的前边
			}

		}
	}

	//test
	public static void main(String[] args) {
		int[] nums = {1,3,6,9,2,4,8};
		shellSort(nums);
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}
}