package Assignment4;

public class Max_consecutive_ones {
    class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int count = 0;
        int maxcount = 0;
        for(int i=0; i<arr.length; i++){

            if(arr[i]==1){
                count++;
                maxcount = Math.max(maxcount, count);
            }else{
                count=0;
            }
        }
        return maxcount;
    }
}
}