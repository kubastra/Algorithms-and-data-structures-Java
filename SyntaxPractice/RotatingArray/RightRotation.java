import java.util.Scanner;
import java.util.Arrays;

class RightRotation {

    private static void rotate(int[] arr, int steps) {
        steps = steps % arr.length;
        int end = 0;
        for(int i = 0; i < steps; i++){
            end = arr[arr.length - 1];
            for(int j = arr.length - 1; j > 0; j--){
                arr[j] = arr[j - 1];
            }
            arr[0] = end;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
