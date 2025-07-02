class Solution {
    public String reverseWords(String s) {
        // String s = r.trim().replaceAll("\\s+", " ");
        int n = s.length();
        String t = "";
        Stack<String> st = new Stack<>();
        for(int i=0; i<n; i++){
            if(s.charAt(i) == ' ' && t.length()>0){
                st.push(t);
                t = "";
            }
            else if(s.charAt(i) == ' ' && t.length() == 0) continue;
            else {
                t += s.charAt(i);
            }
        }
        if (t.length() > 0) {
            st.push(t);
        }
        String ans = "";
        while(!st.isEmpty()){
            ans += st.pop();
             if (!st.isEmpty()) {
                ans += ' ';
            }
        }

        return ans;
    }
}