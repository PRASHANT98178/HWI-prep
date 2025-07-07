class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0, day = 1, n = events.length, count = 0;

        while (i < n || !pq.isEmpty()) {
            
            while (i < n && events[i][0] == day) {
                pq.offer(events[i][1]);
                i++;
            }

            
            while (!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }

           
            if (!pq.isEmpty()) {
                pq.poll();
                count++;
            }

            day++;
        }

        return count;
    }
}
