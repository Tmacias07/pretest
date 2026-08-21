package prob1;

public class Prob1 {
	public static int findMaxDifference(int[] nums) {
		if(nums.length < 2) {
			return 0;
		}
		int maxdiff = 0;
		int tempNum1;
		int tempNum2;
		for(int i = 0; i < nums.length & i + 1 != nums.length; i++) {
			tempNum1 = nums[i];
			System.out.print(nums[i] + " ");
			
			tempNum2 = nums[i+1];
			System.out.println(nums[i+1]);
			
			if(Math.abs(tempNum1 - tempNum2) > maxdiff) {
				maxdiff = Math.abs(tempNum1 - tempNum2);
			}
		}
		return maxdiff;

		
	}

	public static void main(String[] args) {
		int[] nums = {4,7,2,9,1};
		System.out.println();
		int maxDiff = findMaxDifference(nums);
		System.out.println("The max differences in the array is " + maxDiff);

	}

}
