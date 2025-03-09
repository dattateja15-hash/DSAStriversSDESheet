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

        public static void bubbleSort(int[] arr){
        for(int i = arr.length-1;i>=1;i--){
            for(int j = 0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
            System.out.println(Arrays.toString(arr));
        }

        public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 0;i<=n-1;i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
            System.out.println(Arrays.toString(arr));
        }

    }


