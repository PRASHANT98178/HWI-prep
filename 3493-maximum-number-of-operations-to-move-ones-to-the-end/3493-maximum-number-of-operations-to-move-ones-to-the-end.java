class Solution {
    // public static boolean space(StringBuilder sb){
    //     for(int i=0; i<sb.length()-1; i++){
    //         if(sb.charAt(i) == '1' && sb.charAt(i+1) == '0') return true;
    //     }
    //     return false;
    // }
    public int maxOperations(String s) {
        // StringBuilder sb = new StringBuilder(s);
        // int operations = 0;
        int ans = 0;
        int cnt1 = 0;

        // while(space(sb)){
        //     for(int i=0; i<sb.length()-1;){
        //         if(sb.charAt(i) == '1' && sb.charAt(i+1) == '0'){
        //             sb.deleteCharAt(i);
        //         }
        //         else if(sb.charAt(i) == '0' && sb.charAt(i+1) == '1'){
        //             sb.insert(i+1, '1');
        //             operations++;
        //             i += 2;
        //         }
        //         else {
        //             i++;  
        //         }
        //     }
        // }
        // return operations;


        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                cnt1++;
            } else if (i > 0 && s.charAt(i - 1) == '1') {
                ans += cnt1;
            }
        }
        return ans;
    }
}