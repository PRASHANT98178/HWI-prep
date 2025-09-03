class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        String t = "";
        Stack<String> st = new Stack<>();

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(t.length() == 0 && ch == ' '){
                continue;
            }
            else if(ch != ' '){
                t += ch;
            }
            else if(ch == ' ' && t.length() > 0){
                st.push(t);
                t = "";
            }
        }
        if(t.length() > 0) st.push(t);
        t = "";

        while(st.size() > 1){
            t += st.pop();
            t += " ";
        }
        t += st.pop();
        return t;
    }
}