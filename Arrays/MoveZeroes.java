class Solution {
    public void moveZeroes(int[] nums) {
        
        int i = 0;
        int j = 0;
        
        while (i < nums.length && j < nums.length) {
            if (i > j) {
                j++;
                continue;
            }
            
            if (nums[i] == 0 && nums[j] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
            
            if (nums[i] != 0) {
                i++;
            }
            
            j++;
        }
    }
}