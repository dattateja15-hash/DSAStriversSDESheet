import java.util.Arrays;

public class Sorting {

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            for(int j = i;j<n;j++){
                if(arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        }

    }


