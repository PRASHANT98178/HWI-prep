class Solution {
    public String largestOddNumber(String num) {
        // int n = num.length();
        // int idx = -1;
        // String t = "";
        // int val = 0;

        // for(int i=n-1; i>=0; i--){
        //    String s = num.substring(0, i+1);
        //    int nums = Integer.parseInt(s); 
        //    if(nums % 2 != 0 && nums > val){
        //         idx = i;
        //         val = nums;
        //     }  

        // }
        // if(idx == -1) return t;
        // t += num.substring(0, idx);
        
        // return t;


        int n = num.length();
        
        String t = "";

        for(int i=n-1; i>=0; i--){
            char ch = num.charAt(i);
            int digit = ch - '0';
            if(num.charAt(i) % 2 == 1) return num.substring(0, i+1);
        }
        return "";


    }
}