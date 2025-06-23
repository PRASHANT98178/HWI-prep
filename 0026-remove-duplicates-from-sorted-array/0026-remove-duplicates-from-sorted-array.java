class Solution {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        int i=0;
        int j=1;
        int k=1;
        while(j<n){
            if(arr[i] == arr[j]) j++;
            else{
                int temp = arr[j];
                arr[k] = temp;
                i++;
                j++;
                k++;
            }
        }
        return i+1;
    }
}