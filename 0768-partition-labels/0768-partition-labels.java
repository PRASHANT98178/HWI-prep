class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(s.charAt(i), i);
        }
        int prev = -1;
        int maxi = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<n; i++){
            maxi = Math.max(maxi, map.get(s.charAt(i)));
            if(i == maxi){
                ans.add(maxi - prev);
                prev = maxi;
            }
        }
        return ans;
    }
}