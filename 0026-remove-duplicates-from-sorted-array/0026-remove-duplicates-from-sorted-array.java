class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int uniquePosition = 1;
        for(int current = 1; current < nums.length; current++){
            if(nums[current] != nums[uniquePosition -1]){
                nums[uniquePosition] = nums[current];
                uniquePosition++;
            }
        }
        return uniquePosition;
    }
}