class Solution {
    public int findClosestNumber(int[] nums) {
        int min=nums[0];
        for(int i : nums){
            if(Math.abs(i)<Math.abs(min))
             min=i;
             else if(Math.abs(i)==Math.abs(min))
             min=i<min? min : i;
        }
        return min;
    }
}