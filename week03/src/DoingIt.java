/**
 * Created by shuxford on 25/12/2015.
 */
public class DoingIt {
    Window myWindow;

    public void doIt(Window win){
        myWindow = win;

        //ex01();
        //ex02();
        //ex03();
        ex04();

        //firstExample();
        //secondExample();
        //constants();
        //dataTypesExamples();
        //dataTypesConversions();
    }

    private void ex01(){
        //<<<Documentation for methods of the Window class>>>
        //that can be applied to the instance of Window referenced by the variable myWindow
        //myWindow.clearOut()               clears all text from the output text area
        //myWindow.readIn()                 returns as a String whatever text is in the input text area
        //myWindow.writeOut(someExp)        displays its expression parameter but does NOT throw a line
        //myWindow.writeOutLine(someExp)    displays its expression parameter but does throw a line

        //the two write methods will except any value of a primitive type and display the String version of the value
        //how this kind of flexibility is implemented and what is the String version of a non-String value
        //are topics for much later
        //<<<end>>>

        //YOUR CODE BELOW HERE

        final String olympicCity = "Rio";
        //firstName = myWindow.readIn();


        myWindow.readIn();
        myWindow.clearOut();
        myWindow.writeOutLine("Howdy " + myWindow.readIn());
        myWindow.writeOut("The Olympic games is currently being hosted in " + olympicCity);
        //YOUR CODE ABOVE HERE
    }

    private void ex02(){
        //YOUR CODE BELOW HERE
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int sum1;
        int num;
        int sum;

        sum1 = num1 + num2 + num3;

        myWindow.clearOut();
        myWindow.writeOutLine(1);
        myWindow.writeOutLine(2);
        myWindow.writeOutLine(3);
        myWindow.writeOutLine(" ");
        myWindow.writeOutLine(1+2+3);
        myWindow.writeOutLine(" ");
        myWindow.writeOutLine(sum1);

        num = 1;
        sum = num;
        num = 2;
        sum+=num;
        num=sum;
        sum+=num;

        myWindow.writeOutLine(" ");
        myWindow.writeOutLine(sum);
        //YOUR CODE ABOVE HERE
    }

    private void ex03(){
        //YOUR CODE BELOW HERE

        final short BUILDING_FLOORS = 12;
        float buildFloorsUnderConst = 2.5f;
        int userInputNum;
        boolean doorLock = false;
        String userName;
        int studentsEnrolled = 157;
        float myWeight = 74f;
        final int ONE_LITRE_WEIGHT = 1;
        final String E_HILLS_POSTCODE = "3802";
        String stockMarketStatus = "flat";

        myWindow.clearOut();
        myWindow.writeOutLine("The number of floors in building A is " + BUILDING_FLOORS);
        myWindow.writeOutLine("Building B is still under construction and currently has " + buildFloorsUnderConst + 2);
        myWindow.writeOut("If you've entered");
        //YOUR CODE ABOVE HERE
    }

    private void ex04(){
        //YOUR CODE BELOW HERE
        int var1 = 3;
        String H = "hello";
        double D = 2.3;
        boolean tF = false;

        int var2 = (int) D;
        //var1 = H;
        D = var1;

int x = 10;

        //(1 <= x <= 10);

       int yann = "abcd".compareTo("abCd");

        //myWindow.clearOut();
        myWindow.writeOutLine(yann);

        int i1 = 1, i2 = 99;
        boolean b = i1 < i2 || ++i1 < i2++;

        myWindow.writeOutLine(i1);
        double d1 = 3.0, d2 = 4.0;

        "answer = " + d1 < d2;

        //myWindow.writeOutLine((int)var1 = D);
        //YOUR CODE ABOVE HERE
    }


    //WORKSHOP CODE
    private void firstExample(){
        String firstName = "Stephen";   //declaration and initial assignment
        String lastName, fullName;      //declaration only

        myWindow.clearOut();            //clear display

        lastName = "Huxford";           //assignment of String literal

        fullName = firstName + " " + lastName;  //assignment of String expression

        myWindow.writeOutLine(fullName); //write to display
    }

    private void secondExample(){
        int number1; //declarations first in a method
        int sum;

        myWindow.clearOut();

        //myWindow.writeOutLine(number); //error
        //myWindow.writeOutLine(number1); //error

        number1 = 7;
        myWindow.writeOutLine(number1);

        number1 = number1 + 1; //mathematical impossibility
        myWindow.writeOutLine(number1);

        myWindow.writeOutLine(number1 + 11); //bad style, calculate then display
        sum = number1 + 11;
        myWindow.writeOutLine(number1 + 11);

        myWindow.writeOutLine(number1); //variable value unchanged
    }

    private void constants(){
        final int NUMBER_OF_DEPARTMENTS = 39;

        //NUMBER_OF_DEPARTMENTS = 40; error
    }

    private void dataTypesExamples(){
        char myChar, firstInitial = 'S', fullStop = '.';
        int enrolledStudents = 100, total = 0;
        double weightInKilos, totalWeightInKilos = 0.0;
        boolean testResult = false;

        myWindow.clearOut();
        myWindow.writeOutLine("First initial is " + firstInitial + fullStop);
        myWindow.writeOutLine("Number of enrolled students: " + enrolledStudents + fullStop);
        myWindow.writeOutLine("Test result was " + testResult + fullStop);
    }

    private void dataTypesConversions(){
        float money;
        int dollars = 3; //IDE tells me this var is redundant

        money = dollars; //widening conversion OK, loss of accuracy

        double sum = 17.0, result;
        int count = 10;

        result = sum / count; //copy of count promoted to double

        double moreMoney = 5.67;
        int moreDollars = 3;

        //moreDollars = moreMoney; //type mismatch compiler error reported
        moreDollars = (int) moreMoney; //cast forces conversion with truncation

        String digitString = "123";
        int intTarget;

        //target = (int) "123"; // error inconvertible types

        boolean found = true;
        float floatTarget;

        //floatTarget = (float) found;

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
