class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder("");
        for(String s : strs){
            encoded.append(s.length()).append('#').append(s);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while(i < strs.length()){
            # ...
        }
    }
}
