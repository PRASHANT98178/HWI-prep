class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        String t = "";
        // Stack<Character> st = new Stack<>();

        // for(int i=0; i<n; i++){
        //     char ch = s.charAt(i);
        //     if(ch == '('){
        //         st.push(ch);
        //     }
        //     else if(st.size() > 1){
        //         t += st.pop();
        //         t += ch;
        //     }
        //     else st.pop();
        // }
        // return t;

        int open = 0;

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(open == 0 && ch == '('){
                open++;
            }
            else if(open > 0 && ch == '('){
                t += ch;
                open++;
            }
            else if(open > 1 && ch == ')'){
                t += ch;
                open--;
            }
            else open--;
        }
        return t;
    }
}