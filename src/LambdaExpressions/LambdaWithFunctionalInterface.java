
package LambdaExpressions;

interface MyNumber{
    double getValue();
}

interface NumericTest{
    boolean test(int n);
}

interface FactorTest{
    boolean test(int n, int d);
}


public class LambdaWithFunctionalInterface {
    public static void main(String[] args) {
        MyNumber myNum;
        
        myNum = () ->145.23;
        System.out.println(myNum.getValue());
        
        myNum = () -> Math.random() * 100;
        
        System.out.println(myNum.getValue());
        
        
        //Ii will generate the error
        //myNum = () -> "a"; 
        
        
        //Lambda expression to check number is even or not
        NumericTest isEven;
        
        isEven = (n) -> n%2 == 0;
        
        if(isEven.test(10)) System.out.println("10 is even");
        if(!isEven.test(9)) System.out.println("9 is not even");
        
        
        // check the number is non negative
        
        NumericTest isNonNeg;
        
        isNonNeg = (int n) -> n>=0;
        //this both are also valid
        //isNonNeg = (n) -> n>=0; //without specifying the datatype
        //isNonNeg = n -> n>=0; // if only one parameter than () also not  needed.
        
        if(isNonNeg.test(1)) System.out.println("1 is non-negative");
        if(!isNonNeg.test(-1)) System.out.println("-1 is negative");
        
        
        //Lambda expression with 2 args
        FactorTest ft;
        
        ft = (n,d) -> n% d == 0;
        
        if(ft.test(10, 2))
            System.out.println("2 is a factor of 10");
        if(!ft.test(10, 3))
        System.out.println("3 is not a factor of 10");
    }
}