class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        for(int x = 0; x < output.length; x++){
            output[x] = 1;
        }
        for(int i = 0; i < nums.length; i++){
            int j = i;
            while(j > 0){
                output[i] *= nums[j - 1];
                j--;
            }
            int z = i;
            while(z < nums.length  - 1){
                output[i] *= nums[z + 1];
                z++;
            }

        }
        return output;
    }
}  
