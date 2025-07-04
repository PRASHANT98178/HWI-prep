class Solution {
    public char kthCharacter(long k, int[] operations) {
        if(k==1){
            return 'a';
        }

        int n = operations.length;
        long len = 1;
        long newK = -1;
        int operationtype = -1;

        for(int i=0; i<n; i++){
            len *= 2;
            if(len >= k){
                operationtype = operations[i];
                newK = k-len/2;
                break;
            } 
        }
        char ch = kthCharacter(newK, operations);
        if(operationtype == 0) return ch;

            
        return ch == 'z' ? 'a' : ++ch;
    }
}