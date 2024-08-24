class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> r = new ArrayList<>();
        int i = 1;
        int rangeStart = 0;
        for (int j=0; j<nums.length; j++) {
            while (i < nums.length && nums[i] - nums[j] == 1) {
                i++;
                j++;
            } 
            StringBuilder interval = new StringBuilder(Integer.toString(nums[rangeStart]));
            if (rangeStart != j) {
                interval = interval.append("->"+Integer.toString(nums[j]));
            } 
            r.add(interval.toString());
            i++;
            rangeStart = j+1;
        }
        return r; 
    }
}