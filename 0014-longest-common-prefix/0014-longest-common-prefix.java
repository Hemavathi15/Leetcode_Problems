class Solution {
    public String longestCommonPrefix(String[] atrs) {
        StringBuilder sb = new StringBuilder();
sb.append(atrs[0]);
for(int s=1;s<atrs.length;s++) {
	int i=0;
	while(i<(Math.min(sb.length(), atrs[s].length()))) {
		if(atrs[s].charAt(i)!=sb.charAt(i))
			break;
		i++;
	}
//	System.out.println(i);
	if(i<sb.length())
		sb.delete(i, sb.length());
}
return(sb.toString());
    }
}