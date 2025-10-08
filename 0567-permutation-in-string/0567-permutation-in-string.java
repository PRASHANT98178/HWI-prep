class Solution {
    public boolean isFreqSame(int[] arr, int[] brr){
        for(int i=0; i<arr.length; i++){
            if(arr[i] != brr[i]) return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        for(int i=0; i<s1.length(); i++){
            freq[s1.charAt(i) - 'a']++;
        }

        int windowSize = s1.length();

        for(int i=0; i<s2.length(); i++){
            int windowidx = 0;
            int idx = i;
            int[] windowFreq = new int[26];

            while(windowidx < windowSize && idx < s2.length()){
                windowFreq[s2.charAt(idx)-'a']++;
                windowidx++;
                idx++;
            }

            if(isFreqSame(freq, windowFreq)){
                return true;
            }
        }
        return false;
    }
}