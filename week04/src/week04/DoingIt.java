package week04;

/**
 * Created by shuxford on 25/12/2015.
 */
public class DoingIt {
    Window myWindow;

    public void doIt(Window win){
        myWindow = win;

        //ex13();
        //ex14();
        //ex22();
        //ex23();
        //ex24();
        ex25();
        //ex26();
        //ex28();

        //assignmentIsAnOperator();
        //arithmeticOperations();
        //equalityRelationalOperators();
        //equalityRelationalOperators2();
        //logicalOperators();
        //redundantSyntax();
        //blockScopeTest();
    }

    //LAB EXERCISES for you to code
    private void ex13(){

        boolean one = true, two = true, intermed;

        myWindow.clearOut();
        myWindow.writeOutLine("Boolean one is initially " + one + " and boolean two is initially " + two);

        //intermed = two;
        //two = one;
        //one = intermed;

        one = two;
        two = (!one);



        myWindow.writeOutLine("After swapping the variable values, boolean one is now " + one + " \nand two is now " + two);
    }

    private void ex14() {

        double x1 = 0, x2 = 0, a = 1, b = 5, c = 6;

        x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

        x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

        myWindow.clearOut();

        if ((Math.pow(b, 2) - (4 * a * c)) / (2 * a) < 0) { //to prevent a nan error

            myWindow.writeOutLine("The roots are invalid");

        } else {

            myWindow.writeOutLine("The roots of the Quadratic Equation are " + x1 + " and " + x2);
        }
    }
    private void ex22(){

        int a = 10;
        int b = 7;
        boolean even;

        even = a % 2 == 0;

        myWindow.clearOut();
        myWindow.writeOutLine("number a is even? " + even);

        even = b % 2 == 0;

        myWindow.writeOutLine("number b is even? " + even);

    }

    private void ex23(){

        int n = -9;
        int a = -10;
        boolean oddNeg;

        oddNeg = n % 2 != 0;

        myWindow.clearOut();
        myWindow.writeOutLine("Is it true that variable 'n' is a negative odd number?? " + oddNeg);

        oddNeg = a % 2 != 0;

        myWindow.writeOutLine("Is it true that variable 'a' is a negative odd number?? " + oddNeg);
    }

    private void ex24(){

        int n = 52;
        boolean isInRangeButNot;
        boolean isOdd;

        isOdd = !(n % 2 == 0);

        isInRangeButNot = ((n > 1) && (n < 100)) && !(!isOdd && (n > 40) && (n < 50));

        myWindow.clearOut();
        myWindow.writeOutLine(isInRangeButNot);

    }

    private void ex25(){
        String testData1 = "Hello Pauly, You and I Need more sleep";
        String testData2 = "Hello Paul";

        String var1 = "y", var2 = "Y", var3 = "n", var4 = "N";

        boolean exA, exB, exC, exD;


        exA = testData1.contains(var1);
        exB = testData1.contains(var2);
        exC = testData1.contains(var3);
        exD = testData1.contains(var4);


        boolean result = exA || exB || exC || exD;

        myWindow.clearOut();
        myWindow.writeOutLine("Is it true that test data 1 has the values Y,y,N,n? " + result);
    }

    private void ex26(){

    }

    private void ex28(){

    }


    //WORKSHOP CODE for you to play with
    private void assignmentIsAnOperator(){
        int testInt;
        myWindow.clearOut();
        myWindow.writeOutLine(testInt = 123);
    }

    private void arithmeticOperations(){
        //using literals to keep things clear but could have used variables
        int i1, i2, i3; //these are reused multiple times for multiple uses in this method which is poor style in real code

        myWindow.clearOut();

        myWindow.writeOutLine(1.0 / 2.0);
        myWindow.writeOutLine(1 / 2);
        myWindow.writeOutLine((double) 1 / 2);

        myWindow.writeOutLine(7 % 3);
        myWindow.writeOutLine(7 % 8);

//        int counter = 0;
//        counter = counter + 1;
//        ++counter; //pre increment
//        counter++; //post increment
//
//        counter = counter - 1;
//        --counter; //pre decrement
//        counter--; //post decrement

        myWindow.writeOutLine("");
        i1 = 1; i2 = 2;
        myWindow.writeOutLine(i1 + ++i2);
        i1 = 1; i2 = 2;
        myWindow.writeOutLine(i1 + i2++);
        i1 = 1; i2 = 2;
        myWindow.writeOutLine(i1 + --i2);
        i1 = 1; i2 = 2;
        myWindow.writeOutLine(i1 + i2--);

        double totalSales = 0, thisSale;
        thisSale = 5.50;
        totalSales += thisSale;
        myWindow.writeOutLine(totalSales);
        thisSale = 7.50;
        totalSales += thisSale;
        myWindow.writeOutLine(totalSales);

//        totalSales = totalSales + thisSale;
//        totalSales += thisSale;

        myWindow.writeOutLine("");
        double pi = Math.PI;                        //no parenthesis after PI ???
        myWindow.writeOutLine(Math.floor(pi));
        myWindow.writeOutLine(Math.pow(2.0, 20));   //1MByte
        //double calculations are inaccurate
        myWindow.writeOutLine(Math.sin(2.0 * pi));
        myWindow.writeOutLine(Math.abs(-pi));

        myWindow.writeOutLine("");

        i1 = 1; i2 = 2; i3 = 3;

        myWindow.writeOutLine(i1 + i2 * i3);
        myWindow.writeOutLine((i1 + i2) * i3);
    }

    private void equalityRelationalOperators(){
        double d1 = 1.23, d2 = 3.45;
        double delta = 0.00000001;
        String s1 = "dog", s2;

        s2 = myWindow.readIn(); //assume the string dog is input

        myWindow.clearOut();
        //remember floating points are stored inaccurately
        myWindow.writeOutLine("d1 == d2: " + (d1 == d2));   //false, maybe
        myWindow.writeOutLine("d1 != d2: " + (d1 != d2));   //true, maybe
        //inner parentheses essential in the next statement. Why?
        myWindow.writeOutLine("d1 < d2: " + (d1 < d2));     //true, maybe
        myWindow.writeOutLine("d1 <= d1: " + (d1 <= d1));   //true, maybe

        //allowing for floating point inaccuracy
        myWindow.writeOutLine((d2 - d1) < delta);

        myWindow.writeOutLine("s1 == s2: " + (s1 == s2));   //false, huh!!!


    }

    private void equalityRelationalOperators2(){

        String s1 = "dog", s2, s3 = "dOg", s4 = "dogs)";

        s2 = myWindow.readIn(); //the string dog is input

        myWindow.clearOut();
        myWindow.writeOutLine("s1.equals(s2): " + s1.equals(s2));   //hooray!
        myWindow.writeOutLine("!s1.equals(s2): " + !s1.equals(s2)); //
        myWindow.writeOutLine("s1.equals(s3): " + s1.equals(s3));   //case sensitive
        //next statement: true, case insensitive
        myWindow.writeOutLine("s1.equalsIgnoreCase(s3): " + s1.equalsIgnoreCase(s3));

        myWindow.writeOutLine("s1.compareTo(s4): " + s1.compareTo(s4));  // -ve
        myWindow.writeOutLine("s4.compareTo(s1): " + s4.compareTo(s1));  // +ve
        myWindow.writeOutLine("s1.compareTo(s2): " + s1.compareTo(s2));  // 0

        myWindow.writeOutLine("s1.compareTo(s3): " + s1.compareTo(s3));  // +ve
        //next statement: 0 i.e. s1 = s2
        myWindow.writeOutLine("s1.compareToIgnoreCase(s3): " + s1.compareToIgnoreCase(s3));

    }

    private void logicalOperators(){

        int low = 50, high = 100; //inclusive
        int testValue1 = 99, testValue2 = 101;
        boolean firstTest, secondTest;

        myWindow.clearOut();

        firstTest = testValue1 >= low && testValue1 <= high; //in test
        secondTest = testValue1 < low || testValue1 > high; //out test
        myWindow.writeOutLine("testValue1 in range: " + firstTest);
        myWindow.writeOutLine("testValue1 out of range: " + secondTest);

        myWindow.writeOutLine("");
        firstTest = testValue2 >= low && testValue2 <= high; //in test
        secondTest = testValue2 < low || testValue2 > high; //out test
        myWindow.writeOutLine("testValue2 in range: " + firstTest);
        myWindow.writeOutLine("testValue2 out of range: " + secondTest);
    }

    private void redundantSyntax(){
        boolean myBoolean = true;
        boolean result;

        result = myBoolean = true;
        result = myBoolean != true;
    }

    private void blockScopeTest(){
        int outer = 1;

        myWindow.clearOut();

        myWindow.writeOutLine("outer: " + outer);
        //myWindow.writeOutLine("inner1: " + inner1); //inner1 not in scope
        //myWindow.writeOutLine("inner2: " + inner2); //inner2 not in scope
        {
            int inner1 = 2;
            myWindow.writeOutLine("outer: " + outer);
            myWindow.writeOutLine("inner1: " + inner1);
            //myWindow.writeOutLine("inner2: " + inner2); //inner2 not in scope

        }

        {
            int inner2 =3;
            myWindow.writeOutLine("outer: " + outer);
            //myWindow.writeOutLine("inner1: " + inner1); //inner1 not in scope
            myWindow.writeOutLine("inner2: " + inner2);
        }
    }



    // =========================================================================
    // UTILITIES ===============================================================
    // =========================================================================
    private static boolean isNumeric(String str){
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    private static int getRandom(int n1, int n2){
        int retVal = 0;

        retVal = n1 + (int) Math.floor(Math.random() * (n2 - n1 + 1));

        return retVal;
    }

}
