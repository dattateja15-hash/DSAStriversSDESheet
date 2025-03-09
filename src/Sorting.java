import java.util.Arrays;

public class Sorting {

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0;i<n;i++){
            int minIndex = i;
            for(int j = i;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex!=i){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
        }

        public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = n-1;i>=1;i--){
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

        public static void merge(int[] left, int[] right, int[] result){
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                result[k++] = left[i++];
            }
            else{
                result[k++] = right[j++];
            }
        }
        while(i<left.length){
            result[k++] = left[i++];
        }
        while(j<right.length){
            result[k++] = right[j++];
        }
        }

        public static void mergeSort(int[] arr){
        if(arr.length<2){
            return;
        }
        int middle = arr.length/2;
        int[] left = new int[middle];
        for(int i = 0;i<middle;i++){
            left[i] = arr[i];
        }
        int[] right = new int[arr.length-middle];
        for(int i = middle;i<arr.length;i++){
            right[i-middle] = arr[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left,right,arr);
        }



    }


