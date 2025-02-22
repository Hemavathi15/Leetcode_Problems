class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap1 = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hmap1.putIfAbsent(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (hmap1.containsKey(complement) && hmap1.get(complement) != i) {
                return new int[] { i, hmap1.get(complement) };
            }
        }
        return new int[0]; 
    }
}