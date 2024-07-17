class Solution {
    public int[] numberGame(int[] nums) {
       int[] num=new int[nums.length];
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(); 
        for(int i:nums){
            queue.add(i);
        }
        int j=0,t;
        while(j<nums.length-1) {
        	t=queue.poll();
        	num[j]=queue.poll();
        	num[j+1]=t;
        	j+=2;
        }
        return num;
    }
}