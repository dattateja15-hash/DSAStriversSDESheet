import java.util.*;
public class BasicHashing {
    public static void frequency(int[] arr, int n){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        System.out.println(map);
    }

    public static void highestAndLowestFrequencyKeys(int[] arr, int n){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        System.out.println(map);
        int highestKey = 0;
        int lowestKey = 0;
        int maxFrequency = 0;
        int lowestFrequency = n;
        for(var i :map.entrySet()){
            int count = i.getValue();
            int element = i.getKey();
            if(count > maxFrequency){
                highestKey = element;
                maxFrequency = count;
            }
            if(count < lowestFrequency){
                lowestKey = element;
                lowestFrequency = count;
            }
        }
        System.out.println(highestKey);
        System.out.println(lowestKey);
    }

    public static int maxFrequnecy(int[] nums, int k){
        Arrays.sort(nums);
        int left = 0;
        int right = 0;
        int result = 0;
        int total = 0;
        while(right<nums.length){
            total+=nums[right];
            while(nums[right]*(right-left+1)>total+k){
                total-=nums[left];
                left++;
            }
            result = Math.max(result,right-left+1);
            right+=1;
        }
        return result;
    }

}
