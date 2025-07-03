class Solution {
    public String helper(int k, String ans){
        if(ans.length() >= k) return ans;
        String t = "";
        for(int j=0; j<ans.length(); j++){
            char ch = ans.charAt(j);
            ch++;
            t += ch;
        }
        ans += t;
        return helper(k, ans);
    }
    public char kthCharacter(int k) {
        String res = helper(k, "a");
        return res.charAt(k-1);
    }
}