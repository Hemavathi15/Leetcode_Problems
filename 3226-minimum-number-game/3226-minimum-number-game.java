class Solution {
    public int[] numberGame(int[] nums) {
       int[] num=new int[nums.length];
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(); 
        for(int i:nums){
            queue.add(i);
        }
        int j=0;
        while(j<nums.length-1) {
        	
        	num[j+1]=queue.poll();
        	num[j]=queue.poll();
        	j+=2;
        }
        return num;
    }
}