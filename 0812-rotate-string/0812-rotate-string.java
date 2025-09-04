// class Solution {
    
//     public boolean cheaks(String s, String t, int i, int j, int k){
//         if(s.length()-k != (j-i)+1) return false;
//         while(k<s.length() && i<=j){
//             if(s.charAt(k) != t.charAt(i)) return false;
//             k++;
//             i++;
//         }
//         return true;
//     }

//     public boolean cheake(String s, String t, int i, int k){
//         if(t.length()-i != k+1) return false;
//         while(i<t.length() && k>=0){
//             if(s.charAt(k) != t.charAt(i)) return false;
//             k--;
//             i++;
//         }
//         return true;
//     }

//     public boolean rotateString(String s, String goal) {
//         if(s.length() != goal.length()) return false;
//         int n = goal.length();

//         int idx = -1;

//         for(int i=n-1; i>=0; i--){
//             if(goal.charAt(i) == s.charAt(0)){
//                 idx = i;
//                 break;
//             }
//         }

//         if(idx == -1 || idx == 0) return false;

//         int idx2 = goal.length() - idx;
//         if(cheaks(s, goal, 0, idx-1, idx2) && cheake(s, goal, idx, idx2-1)) return true;
//         return false;

//     }
// }  

class Solution {
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}
