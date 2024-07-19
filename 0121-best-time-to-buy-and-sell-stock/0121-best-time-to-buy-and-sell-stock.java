class Solution {
    public int maxProfit(int[] arr) {
       int profit=0,i=1;;
		int buyPrice=arr[0];
		while(i<arr.length){
//			System.out.println(i);
			if(arr[i]<buyPrice) {
				buyPrice=arr[i];
			}
            else{
			profit=Math.max(profit,arr[i]-buyPrice);
			i++;
            }
		}
		return (profit);
    }
}