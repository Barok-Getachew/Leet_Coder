class Solution {
  List<int> twoSum(List<int> nums, int target) {
        for( int i =0  ; i <= nums.length - 1;i++){
            for(int j = i+1; j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    return[i,j];
                }
               
            }
        }
    return [];       
  }
}