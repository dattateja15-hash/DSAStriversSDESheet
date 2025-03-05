public class BasicMaths {

    public static int countNumbers(int n){
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        return count;
        //Time Complexity is log10(n)
    }

    public static int optimalCountNumbers(int n){
        return (int)(Math.log10(n)+1.0f);
    }

    public static int reverseNumber(int n){
        int sum = 0;
        while(n>0){
            int r = n % 10;
            sum = sum * 10;
            sum = sum + r;
            n = n /10;
        }
        return sum;
    }

    public static boolean checkPalindrome(int n1){
        int n2 = reverseNumber(n1);
        return n1 == n2;
    }
}
