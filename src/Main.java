

public class Main {
    public static void main(String[] args) {
        BasicRecursion.count(10);
        BasicRecursion.printNameNtimes(10,1);
        BasicRecursion.printNumbers(1,10);
        BasicRecursion.printReverseNumber(10);
        BasicRecursion.sumOfFirstNNaturalNumbers(5,0);
        System.out.println(BasicRecursion.sumOfFirstNNaturalNumbers(5));
        BasicRecursion.factorialParametrized(5,1);
        System.out.println(BasicRecursion.factorialFunctional(5));
        BasicRecursion.reverseArray(new int[]{1,2,3,4,5,6,7,8,9});
        System.out.println(BasicRecursion.checkIfPalindrome("madam"));
        System.out.println(BasicRecursion.fibonacci(6));
        BasicRecursion.printFibonacci(5);
        }
}