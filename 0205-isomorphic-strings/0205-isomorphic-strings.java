class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] ah = new char[128];

        for(int i=0; i<s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            int idx = (int) a;
            if(ah[idx] == '\0') ah[idx] = b;
            else{
                if(ah[idx] != b) return false;
            } 
        }

        char[] bh = new char[128];
        for(int i=0; i<s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            int idx = (int) b;
            if(bh[idx] == '\0') bh[idx] = a;
            else{
                if(bh[idx] != a) return false;
            } 
        }
        return true;
    }
}