class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = -1;
        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
        }
        for(int key : map.keySet()){
            if(map.get(key) == key){
                res = Math.max(res, key);
            }
        }
        return res;
    }
}