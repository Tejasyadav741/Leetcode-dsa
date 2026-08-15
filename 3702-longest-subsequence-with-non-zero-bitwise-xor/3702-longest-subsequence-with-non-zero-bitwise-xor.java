class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
       int countzero = 0;
        for(int num : nums)
        {
            xor = xor ^ num;
            if(num == 0){
                countzero++;
            }
        } 
        if(xor != 0){
            return nums.length;
        }
        else if(countzero == nums.length){
            return 0;
        }

        return nums.length - 1;
    }
}