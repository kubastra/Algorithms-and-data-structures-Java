import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        StringBuilder sb = new StringBuilder();
        input = input.toLowerCase();
        for(char c : input.toCharArray()) {
        	if(c != ' ') {
        		sb.append(c);
        	}
        }
        
        StringBuilder sb2 = new StringBuilder(sb);
        
        sb2.reverse();
        
        
        // Print result
        System.out.println(sb.toString().equals(sb2.toString()) ? "Yes" : "No");
    }
}
