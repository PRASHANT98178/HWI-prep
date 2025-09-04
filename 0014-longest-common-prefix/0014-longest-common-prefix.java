class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String s = strs[0];
        String t = strs[strs.length-1]; 

        int i = 0;
        int count = 0;

        while(i < s.length() && s.charAt(i) == t.charAt(i)){
            i++;
            count++;
        }
        if(count==0) return "";

        return s.substring(0, i);
    }
}