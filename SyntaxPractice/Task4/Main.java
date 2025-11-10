import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int sum = 0;

        for(int i = 0; i < length; i++){
            if(arr[i] > target){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
