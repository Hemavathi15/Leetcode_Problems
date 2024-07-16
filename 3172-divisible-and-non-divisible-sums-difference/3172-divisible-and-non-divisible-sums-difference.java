class Solution {
    public int differenceOfSums(int n, int m) {
        int res = 0;
        for(int i = 1; i <= n; i++){
            res += (i % m == 0 ? -i:i);
        }
        return res;
    }
    
}