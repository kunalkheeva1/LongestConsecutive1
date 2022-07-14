public class LongestConsecutive1 {


    public static int longestConsecutive1(int n){

        // initialy count is 0, also get a max number to store the max count
        int count = 0;
        int max = Integer.MIN_VALUE;

        while(n>0){
            if((n&1) == 1){
                count ++;
            }
            //else set the count to 0 and start again
            else{
                count =0;
            }
            // by moving the n by one movement
            n >>=1;
            // check the stored value and new count, return the max answer
            max = Math.max(max, count);
        }return max;

    }


    public static void main(String[] args) {

    }
}
