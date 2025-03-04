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

    public static void patternFourteen(){

        for(int i = 1;i<=5;i++){
            char a = 'A';
            for(int j = 1;j<=i;j++){
                System.out.print(a++);
            }
            System.out.println();
        }
    }

    public static void patternFifteen(){

        for(int i = 0;i<=5;i++){
            char a = 'A';
            for(int j = 1;j<=5-i;j++){
                System.out.print(a++);
            }
            System.out.println();
        }
    }

    public static void patternSisxteen(){
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=i;j++){
                char a = (char)('A'+i-1);
                System.out.print(a);
            }
            System.out.println();
        }
    }

    public static void patternSeventeen(){
        for(int i = 0;i<5;i++){



            for(int j = 0;j<5-i-1;j++){
                System.out.print(" ");
            }
            char c = 'A';
            int breakpoint = (2*i+1) / 2;
            for(int j = 1;j<=2*i+1;j++){
                System.out.print(c);
                if(j<=breakpoint){
                    c++;
                }
                else{
                    c--;
                }

            }

            for(int j = 0;j<5-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void patternEighteen(){
        for(int i = 1;i<=5;i++){
            char a = 'E';
            for(int j = 1;j<=i;j++){
                System.out.print((char)(a-i+j));
            }
            System.out.println();
        }
    }

    public static void patternNineteen(){
        for(int i = 0;i<5;i++){
            for(int j = 0;j<5-i;j++){
                System.out.print("*");
            }
            for(int j = 0;j<2*i;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<5-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            for(int j = 0;j<5*2-2*i;j++) {
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternTwenty(){
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            for(int j = 1;j<=5*2-2*i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0;i<5;i++){
            for(int j = 0;j<5-i;j++){
                System.out.print("*");
            }
            for(int j =0;j<2*i;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<5-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternTwentyOne(){
        for(int i = 0;i<4;i++){
            for(int j = 0;j<4;j++){
                if(i==0||j==0||i==4-1||j==4-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }



}
