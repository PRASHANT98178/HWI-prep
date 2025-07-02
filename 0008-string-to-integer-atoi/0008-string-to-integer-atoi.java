class Solution {
    public int myAtoi(String s) {
        if(s.length() == 0) return 0;
        String t = s.replaceFirst("^\\s+", "");
        if(t.length() == 0) return 0;
        int n = t.length();
        int sign = 1;
        if(t.charAt(0) == '-') sign = -1;
        long ans = 0;

        int i=0;
        i = (t.charAt(i) == '+' || t.charAt(i) == '-') ? 1 : 0;

        while(i<t.length()){
            if(!(t.charAt(i) >= '0' && t.charAt(i) <= '9')) break;

            ans = ans * 10 +(t.charAt(i) - '0');
            if(sign == -1 && -1 * ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if(sign == 1 && ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            i++;
        }

        return  sign *(int) ans;
        
    }
}