class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int tank = 0;
        int index = 0;

        for(int i=0; i<gas.length; i++){
            totalGas += gas[i];
            totalCost += cost[i];

            tank += gas[i] - cost[i];

            if(tank < 0){
                index = i+1;
                tank = 0;
            }
        }
        return (totalGas >= totalCost) ? index : -1;
    }
}