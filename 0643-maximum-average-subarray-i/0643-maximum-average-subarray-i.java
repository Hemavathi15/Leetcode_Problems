class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0,right=k-1;
        double sum=0,maxAvg=Integer.MIN_VALUE;
        for ( int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxAvg=sum;
        while(right<nums.length-1){
            right++;
            sum = sum - nums[left] + nums[right];
            maxAvg = maxAvg > (sum) ? maxAvg  : (sum);
            left++;
        }
        return maxAvg/k;
    }
}