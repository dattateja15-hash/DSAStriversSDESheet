public class Timepass {

    public static int maxPrice(int[] prices){
        int right = 1;
        int left = 0;
        int max = 0;
        while(right<prices.length){
            if(prices[left]<prices[right]){
                max = Math.max(max,prices[right]-prices[left]);
            }
            else
                left = right;
            right++;
        }
        return max;
    }

}
