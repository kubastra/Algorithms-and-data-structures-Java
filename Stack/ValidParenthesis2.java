class ValidParenthesis2 {
    public boolean isValid(String s) {
		Deque<Character> stos = new ArrayDeque<>();
		HashMap<Character, Character> mapka = new HashMap<>();
		mapka.put('{', '}');
		mapka.put('[', ']');
		mapka.put('(', ')');
	
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(mapka.containsKey(c)) {
				stos.push(c);
			}else {
				if(stos.isEmpty()) {
					return false;
				}
				char peeekowanie = stos.pop();
				if(c != mapka.get(peeekowanie)){
					return false;
				}
				
			}
		}
		return stos.isEmpty();
    }
    
}
