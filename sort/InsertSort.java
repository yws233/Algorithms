	/*
	简单插入排序算法
*/
public class InsertSort{
	
	//主方法
	public static void insertSort(int[] arrs){
		int temp = 0;
		for (int i = 1; i < arrs.length; i++ ) {
			int j = i - 1;
			temp = arrs[i];
			while(j >= 0 && temp < arrs[j]){
				arrs[j + 1] = arrs[j];
				j--;
			}
			arrs[j + 1] = temp;
		}
	}
	//test
	public static void main(String[] args) {
		int[] nums = {1,3,6,8,2,4,7,9,0};
		insertSort(nums);
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}
}