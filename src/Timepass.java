import java.util.Arrays;

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

    public static int maxFrequency(int[] nums, int k){
        Arrays.sort(nums);
        int left = 0;
        int right = 0;
        int max = 0;
        long total = 0;
        while(right<nums.length){
            total+=nums[right];
            long current = nums[right];
            if(current*(right-left+1) > k+total){
                total-=nums[left];
                left++;
            }
            max = Math.max(max,(right-left+1));
            right+=1;
        }
        return max;
    }

}
