class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int value = IntStream.rangeClosed(0, len).sum() - Arrays.stream(nums).sum();;

        return value;
    }
}