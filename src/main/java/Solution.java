public class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] result = new int[nums.length];

        int sum0 = 0;

        for (int i = 1; i < nums.length; i++) {
            sum0 += nums[i] - nums[0];
        }
        result[0] = sum0;

        for (int i = 1; i < result.length; i++) {
            if (nums[i] == nums[i - 1]) {
                result[i] = result[i - 1];
            } else {
                int dif = nums[i] - nums[i - 1];
                result[i] = result[i - 1] + i * dif - (result.length - i) * dif;
            }

        }
        return result;
    }

}
