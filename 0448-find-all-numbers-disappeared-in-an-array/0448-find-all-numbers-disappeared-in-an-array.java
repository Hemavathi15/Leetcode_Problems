class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
            List<Integer> value = new ArrayList<>();
        Set<Integer> sets = new HashSet<>();
        
        // Add all elements of nums to the set
        for (int num : nums) {
            sets.add(num);
        }

        // Find the missing numbers
        for (int i = 1; i <= nums.length; i++) {
            if (!sets.contains(i)) {
                value.add(i);
            }
        }
        
        return value; 
    }
}

