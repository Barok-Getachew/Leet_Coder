class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int l = 0;
         for(int i  = 0 ; i<= len - 1 ;i++){
             if(nums[i] != val){
                 nums[l] = nums[i];
                 l++; 
             }
         }

        return l;
    }
}