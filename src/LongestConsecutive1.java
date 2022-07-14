public class LongestConsecutive1 {
    public static int longestConsecutive1(int n){
        int count = 0;
        int max = Integer.MIN_VALUE;

        while(n>0){
            if((n&1) == 1){
                count ++;
            }
            else{
                count =0;

            }
            n >>=1;
            max = Math.max(max, count);
        }return max;

    }


    public static void main(String[] args) {

    }
}
