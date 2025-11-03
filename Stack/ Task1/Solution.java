class Solution {
    public boolean isValid(String s) {
        Stack<Character> stos = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char nawias = s.charAt(i);
            
            if(nawias == '{' || nawias == '(' || nawias == '['){
                stos.push(nawias);
            }else{
                if(stos.empty()) return false;

                char otwarty = stos.pop();

                if((nawias == ')' && otwarty != '(') ||
                   (nawias == '}' && otwarty != '{') ||
                   (nawias == ']' && otwarty != '[')) {
                    return false;
                }
            }
        }

        return stos.empty() ? true : false;
    }
    
}
