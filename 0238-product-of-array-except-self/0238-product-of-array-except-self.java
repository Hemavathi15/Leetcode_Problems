class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res= new int[nums.length];
        res[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            res[i]=nums[i]*res[i-1];
        }
        res[nums.length-1]=res[nums.length-2];
        int p=1;
        p*=nums[nums.length-1];
        for(int i=nums.length-2;i>=1;i--){
            res[i]=res[i-1]*p;
            p*=nums[i];

        }
        res[0]=p;
        return res;
    }
}