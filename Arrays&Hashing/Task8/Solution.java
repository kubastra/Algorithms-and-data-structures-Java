class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        int max = 1;
        int curr = 1;

        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i + 1] == nums[i]){
                continue;
            }else if(Math.abs(nums[i+1] - nums[i]) == 1){
                curr += 1;
            }else{
                curr = 1;
            }

            if(max < curr){
                max = curr;
            }
        }
        return max;
    }
}
