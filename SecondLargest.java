class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5};
        System.out.println(FindTheSecondLargest(arr));
    }
    static int FindTheSecondLargest(int[] arr) { 
        int max = Integer.MIN_VALUE;
        int SecondLarge = Integer.MIN_VALUE;
        for(int num : arr) {
        if(max < num) {
            SecondLarge = max;
            max = num;
            } else if(SecondLarge > num && max != num) {
                SecondLarge = num;
                }
        }
        return SecondLarge;
    } 
}
