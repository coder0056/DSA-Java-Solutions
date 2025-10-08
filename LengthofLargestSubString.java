class LengthofLargestSubString {
    public static void main(String[] args) {
        String str = "ababc";
        System.out.println(FindTheLargestSubString(str));
    }
    static int FindTheLargestSubString(String str) { 
        int start = 0;
        int maxLength = 0;
        int[] LastSeen = new int[256];
        for(int i=0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(LastSeen[ch] > start) {
                start = LastSeen[ch];
            }
            maxLength = Math.max(maxLength, i+1-start);
            LastSeen[ch] = i + 1;
        }
        
        return maxLength;
    } 
}
