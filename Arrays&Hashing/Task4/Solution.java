class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for(int i = 0; i < nums.length; i ++){
            if(numsMap.containsKey(nums[i])){
                numsMap.put(nums[i], numsMap.get(nums[i]) + 1);
            }else{
                numsMap.put(nums[i], 1);
            }
        }
        
        List<Map.Entry<Integer, Integer>> sorted = new ArrayList<>(numsMap.entrySet());
        sorted.sort((a, b) -> b.getValue() - a.getValue());

        int[] result = new int[k];

        for(int i = 0; i < k; i++){
            result[i] = sorted.get(i).getKey();
        }
        return result;
    }
}
