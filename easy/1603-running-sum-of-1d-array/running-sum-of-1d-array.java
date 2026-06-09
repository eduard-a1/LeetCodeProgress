class Solution {
    public int[] runningSum(int[] nums) {

        int[] sums = new int[nums.length];

        for(int i = 0; i < nums.length; i++){

            if(i == 0){
                sums[i] = nums[i];
            }
            else{

                for(int j = i; j >= 0; j--){

                    sums[i] += nums[j];

                }
            }
    
        }
        
        return sums;
    }
}