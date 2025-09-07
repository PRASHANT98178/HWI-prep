public class Solution {
    public void ReverseString(char[] s) {
        int n = s.Length;
        int i=0; 
        int j=n-1;
        while(i<j){
            char temp = s[i];  
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}