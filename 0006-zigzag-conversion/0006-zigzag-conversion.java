class Solution {
    public String convert(String s, int n) {
        String[] ans = new String[n];

        for(int i=0; i<n; i++){
            ans[i] = "";
        }

        int i=0;
        while(i<s.length()){

            for(int j=0; j<n && i<s.length(); j++){
                ans[j] += s.charAt(i++);
            }

            for(int idx = n-2; idx>0 && i<s.length(); idx--){
                ans[idx] += s.charAt(i++);
            }
        }

        String res = "";
        for(String str : ans){
            res+=str;
        }
        return res;

    }
}