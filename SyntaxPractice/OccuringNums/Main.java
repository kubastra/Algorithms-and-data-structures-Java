import java.util.Scanner;

class Main {

    static boolean check(int n, int m, int[] tab, int length){
        for(int i = 0; i < length - 1; i++){
            if(tab[i] == n && tab[i + 1] == m || (tab[i] == m && tab[i + 1] == n)){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input the size of an array
        int length = sc.nextInt();

        //create tab for numbers
        int[] tab = new int[length];

        //assign numbers to tab
        for(int i = 0; i < length; i++){
            tab[i] = sc.nextInt();
        }

        //assign the n and m
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(check(n, m, tab, length));
    }
}
