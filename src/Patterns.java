public class Patterns {
    public static void patternOne(){
        for(int i = 0;i<4;i++){
            for(int j = 0;j<4;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patternTwo(){
        for(int i = 0;i<5;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternThree(){
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void patternFour(){
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void patternFive(){
        for(int i = 1;i<=5;i++){
            for(int j = 0;j<5-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patternSix(){
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=5-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void patternSeven(){
        for(int i = 0;i<5;i++){

            for(int j = 0;j<5-i-1;j++){
                System.out.print(" ");
            }

            for(int j = 0;j<2*i+1;j++){
                System.out.print("*");
            }

            for(int j = 0;j<5-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();

        }

    }

    public static void patternEight(){
        for(int i = 0;i<5;i++){
            for(int j = 0;j<i;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<(2*5)-(2*i+1);j++){
                System.out.print("*");
            }
            for(int j = 0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();

        }
    }

    public static void patternNine(){
        for(int i = 0;i<5;i++){
            for(int j = 0;j<5-i-1;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j = 0;j<5-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0;i<5;i++){
            for(int j =0;j<i;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<(2*5)-(2*i+1);j++){
                System.out.print("*");
            }
            for(int j = 0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void patternTen(){
        for(int i = 0;i<5;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0;i<4;i++){
            for(int j = 0;j<4-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternEleven(){
        int start;
        for(int i = 0;i<5;i++){
            if(i%2==0){
                start = 1;
            }
            else{
                start = 0;
            }
            for (int j = 0;j<=i;j++){
                System.out.print(start+" ");
                start = 1- start;
            }
            System.out.println();
        }
    }

    public static void patternTwelve(){
        for(int i = 1;i<=4;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }

            for(int j = 0;j<2*(4-i);j++){
                System.out.print(" ");
            }

            for(int j = i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void patternThirteen(){
        int count = 1;
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(count+++" ");
            }
            System.out.println();
        }
    }
}
