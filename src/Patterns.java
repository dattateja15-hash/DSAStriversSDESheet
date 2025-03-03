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
}
