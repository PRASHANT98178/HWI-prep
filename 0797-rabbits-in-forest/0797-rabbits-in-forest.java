class Solution {
    public int numRabbits(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            int key = arr[i]+1;
            map.put(key, map.getOrDefault(key, 0) +1);
        }
        int count = 0;

        for(int key : map.keySet()){
            int val = map.get(key);
            int q = val / key;
            int rem = val % key;
            count += q * key;
            if(rem > 0){
                count += key;
            }
        }
        return count;

    }
}