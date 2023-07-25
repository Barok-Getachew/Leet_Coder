class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        while (i < nums.length) {
            if (target > nums[i])
                i++;
            else
                break;
        }
        return i; // This will handle the case when the target is greater than all elements
    }
}
