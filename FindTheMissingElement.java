class FindTheMissingElement {
    public static void main(String[] args) {
        int[] arr = {2,1,3};
        System.out.println(FindTheMissingElement(arr));
    }
    static int FindTheMissingElement(int[] arr) {
        int n = arr.length;
        int len = (n*(n+1))/2;
        for(int val : arr) {
            len -= val;
        }
        return len;
    } 
}
