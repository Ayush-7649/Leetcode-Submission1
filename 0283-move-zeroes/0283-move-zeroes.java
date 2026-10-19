class Solution {
    public void moveZeroes(int[] nums) {

        int zp = 0; // Stotres zeros position 

        for(int current = 0 ; current < nums.length; current++){
            if(nums[current] != 0){
                int temp = nums[current];
                nums[current] = nums[zp];
                nums[zp] = temp;

                zp++;
            }
        }
        
    }
}