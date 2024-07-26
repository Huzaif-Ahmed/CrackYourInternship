import java.util.*;
class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int l=nums.length-1;
        int mid=0;
        while(mid<=l){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[mid];
                nums[mid]=nums[l];
                nums[l]=temp;
                l--;
            }
        }
        
    }
}