class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0,i=0; 
        while(i<t.length() && j<s.length()){
            
            if(t.charAt(i)==s.charAt(j))
             j++;
            i++;
        }
        return (j==s.length());
    }
}