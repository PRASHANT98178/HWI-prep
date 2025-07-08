class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = people.length-1;
        int boat = 0;
        while(i>=0){
            if(people[i] < limit) break;
            boat++;
            i--;
        }

        int j = 0;
        while(j<=i){
            if(people[i] + people[j] <= limit) {
                boat++;
                i--;
                j++;
            }
            else {
                boat++;
                i--;
            }

        }
        return boat;
    }
}