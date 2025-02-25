class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0,right=k-1;
        double sum=0,maxAvg=0;
        for ( int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxAvg=sum/k;
        while(right<nums.length-1){
            right++;
            sum = sum - nums[left] + nums[right];
            maxAvg = maxAvg > (sum/k) ? maxAvg  : (sum/k);
            left++;
        }
        return maxAvg;
    }
}