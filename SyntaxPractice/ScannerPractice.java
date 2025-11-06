class ScannerPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner<>(System.in);

        int length = scanner.nextInt();
        int[] nums = new int[length];

        for(int i = 0; i < length; i++){
            nums[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();

        int count = 0;
        
        for(int el : nums){
            if(el == target){
                count++;
            }
        }
        System.out.println(count);
    }
}
