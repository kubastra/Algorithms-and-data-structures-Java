import java.util.Scanner;

class ConcatenateStringsProblem {

    public static String ConcateStringWithoutDigits(String[] strings) {
		
    	StringBuilder result = new StringBuilder();
    	
    	for(String str: strings) {
    		for(int j = 0; j < str.length(); j++){
    			char c = str.charAt(j);
    			if(c < '0' || c > '9') {
    				result.append(c);
    			}
    		}
    	}
    	return result.toString();
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}
