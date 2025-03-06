import java.util.Arrays;

public class BasicRecursion {

    //Recursion: When a function calls
    // itself until a specific condition is met.
    static int count = 0;
    public static void count(int n){
        if(count==n){
            return;
        }
        System.out.println(count++);
        count(n);
    }

    public static void printNameNtimes(int n,int i){
        if(i==n){
            return;
        }
        System.out.println("Datta Teja Nalluri");
        printNameNtimes(n,i+1);
    }

    public static void printNumbers(int i,int n){
        if(i > n){
            return;
        }
        System.out.println(i);
        printNumbers(i+1,n);
    }

    public static void printReverseNumber(int n){
        if(n < 0){
            return;
        }
        System.out.println(n);
        printReverseNumber(n-1);
    }

    public static void sumOfFirstNNaturalNumbers(int n,int sum){
        if(n<1){
            System.out.println(sum);
            return;
        }
        sumOfFirstNNaturalNumbers(n-1,sum+n);
    }

    public static int sumOfFirstNNaturalNumbers(int n){
        if(n==0){
            return 0;
        }
        return n + sumOfFirstNNaturalNumbers(n-1);
    }

    public static void factorialParametrized(int n,int product){
        if(n==1){
            System.out.println(product);
            return;
        }
        factorialParametrized(n-1,product*n);
    }

    public static int factorialFunctional(int n){
        if(n<=1){
            return 1;
        }
        return n * factorialFunctional(n-1);
    }

    public static void reverseArray(int[] arr){
        reverseArray(arr, 0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr, int start,int end){
        if(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray(arr,start+1,end-1);
        }
    }

    public static boolean checkIfPalindrome(String str){
        return checkPalindrome(str,0,str.length()-1);
    }

    public static boolean checkPalindrome(String str, int start, int end){
        if(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            checkPalindrome(str,start+1,end-1);
        }
        return true;
    }

    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        int last = fibonacci(n-1);
        int slast = fibonacci(n-2);
        return last+slast;
    }

    public static void printFibonacci(int n){
        int last = 1;
        int slast = 0;
        System.out.print(slast+" ");
        System.out.print(last+" ");
        for(int i = 2;i<=n;i++){
            int current = slast + last;
            slast = last;
            last = current;
            System.out.print(current+" ");
        }
    }
}
