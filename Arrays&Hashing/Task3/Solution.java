class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> tab = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    tab.add(i);
                    tab.add(j);
                    break;
                }
            }
        }
        int[] tab1 = new int[tab.size()];
        for(int i = 0; i < tab.size(); i++){
            tab1[i] = tab.get(i);
        }

        return tab1;
    }
}
