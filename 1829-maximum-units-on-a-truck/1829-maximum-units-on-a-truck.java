class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        int n = boxTypes.length;
        int ans = 0;
        for(int i=0; i<n && truckSize>0; i++){
            if(truckSize - boxTypes[i][0] >= 0){
                ans += boxTypes[i][0] * boxTypes[i][1];
                truckSize -= boxTypes[i][0];
            }
            else{
                // int rem = boxTypes[i][0] - truckSize;
                // int exceed =  boxTypes[i][0] - rem;

                ans += truckSize * boxTypes[i][1];
                truckSize = 0;
            }
        }
        return ans;
    }
}