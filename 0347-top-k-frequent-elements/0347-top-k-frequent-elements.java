class Solution {
    class Pair implements Comparable<Pair>{
        int idx;
        int freq;

        Pair(int idx, int freq){
            this.idx = idx;
            this.freq = freq;
        }

        public int compareTo(Pair t){
            return this.freq - t.freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) +1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int key : map.keySet()){
            pq.add(new Pair(key, map.get(key)));

            if(pq.size() > k){
                pq.remove();
            }
        }
        int[] ans = new int[k];
        for(int i=0; i<k; i++){
            Pair p = pq.remove();
            ans[i] = p.idx;
        }
        return ans;
    }
}