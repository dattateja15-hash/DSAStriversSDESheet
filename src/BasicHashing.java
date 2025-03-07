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
}
