class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            char[] str = strs[i].toCharArray();
            Arrays.sort(str);
            String sortedS = new String(str);
            map.putIfAbsent(sortedS, new ArrayList<>());
            map.get(sortedS).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
