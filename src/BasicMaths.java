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

    public static int calculateGCD(int a,int b){
        int n = Math.min(a,b);
        int ans = 1;
        for(int i = 2;i<n;i++){
            if(a%i==0 && b%i==0){
                ans = Math.max(ans,i);
            }
        }
        return ans;
    }

    public static int claculateGCDBetter(int a,int b){
        for(int i = Math.min(a,b);i>0;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }

    public static int calculateGCDOptimal(int a,int b){
        while(a > 0 && b > 0){
            if(a > b){
                a = a%b;
            }
            else{
                b = b%a;
            }
        }
        if(a>0)
            return a;
        return b;
    }

    public static boolean checkArmstrong(int n){
        int count = String.valueOf(n).length();
        int store = n;
        System.out.println(count);
        int sum = 0;
        while(n>0){
            int r = n%10;
            sum = (int) (sum+Math.pow(r,count));
            n = n/10;
        }
        return sum == store;
    }
}
