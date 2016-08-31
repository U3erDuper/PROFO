package week06;

/**
 * Created by shuxford on 25/12/2015.
 */
public class DoingIt {
    Window myWindow;

    //class level variables here

    public void doIt(Window win){
        myWindow = win;

        //ifTrapForPaste1();
        //ifElseIfElseForPaste1();
        //ifElseIfElseForPaste2();
        //ternaryOperator();
        //codeForVideos1();
        //codeForVideos2();

        //ifTrapEx11();
        //I'm leaving you to code and organise your Lab Exercise methods from now on

    }

    //LAB EXERCISES for you to code ===========================================

    private void ifTrapEx11(){

    }

    //I'm leaving you to code and organise your Lab Exercise methods from now on



    //WORKSHOP CODE for you to play with ======================================
    private void ifTrapForPaste1(){
        int temperature = (int) Math.random() * 100;
        String clothesList = "";

        if (temperature < 18){
            clothesList = clothesList + " " + "coat";
        }

        // or since the statement block contains one and only one statement
        // we may dispense with the braces.

        if (temperature < 18)
            clothesList = clothesList + " " + "coat";

    }

    private void ifElseForPaste(){
        String coin = myWindow.readIn();
        boolean youWin;

        myWindow.clearOut();
        if (coin.equals("heads")) {
            youWin = true;
        }
        else {
            youWin = false;
        }

        myWindow.writeOutLine(youWin + ""); //quick and dirty cast
        myWindow.writeOutLine("M".toLowerCase());

    }

    private void ifElseIfElseForPaste1(){
        String openHours, closeHours;
        String day = "Saturday";

        myWindow.clearOut();

        if (day.equals("Monday") || day.equals("Tuesday") ||
                day.equals("Wednesday") || day.equals("Thursday") ||
                day.equals("Friday")) {
            openHours = "9:00am";
            closeHours = "5:00pm";
        }
        else
            if (day.equals("Saturday")) {
                openHours = "9:00am";
                closeHours = "6:00pm";
            }

            else
                if (day.equals("Sunday")) {
                    openHours = "10:00am";
                    closeHours = "3:00pm";
                }
                else {
                    openHours = "E R R O R";
                    closeHours = "E R R O R";
                }

        myWindow.writeOutLine(openHours + " " + closeHours);
    }

    private void ifElseIfElseForPaste2(){
        String openHours, closeHours;
        String day = "Saturday";

        myWindow.clearOut();

        if (day.equals("Monday") || day.equals("Tuesday") ||
                day.equals("Wednesday") || day.equals("Thursday") ||
                day.equals("Friday")) {
            openHours = "9:00am";
            closeHours = "5:00pm";
        }
        else
        if (day.equals("Saturday")) {
            openHours = "9:00am";
            closeHours = "6:00pm";
        }

        else
        if (day.equals("Sunday")) {
            openHours = "10:00am";
            closeHours = "3:00pm";
        }
        else {
            openHours = "E R R O R";
            closeHours = "E R R O R";
        }

        myWindow.writeOutLine(openHours + " " + closeHours);
    }

    private void ternaryOperator(){
        String displayHours;

        myWindow.clearOut();

        int clockHours24 = 1 + (int) (Math.random() * 24);
        int clockHours12 = clockHours24 % 12;

        System.out.println(clockHours24);

        displayHours = clockHours12 + (clockHours24 < 12 ? " am" : " pm");

        myWindow.writeOutLine(displayHours);
    }

    private void codeForVideos1(){
        int i;
        String outString = "";

        myWindow.clearOut();

        i = 1 + (int) (Math.random() * 20);
        if (i < 10){
            outString += "In the if statment block so ";
            outString += i + " is less than 10";
        }
        else{
            outString += "In the else statment block so ";
            outString += i + " is greater than or equal to 10";
        }

        myWindow.writeOutLine(outString);

        outString ="";
        i = 0;
        while (i < 10){
            outString += i + " ";
            i++;
        }

        myWindow.writeOutLine(outString);
    }

    private void codeForVideos2(){
        int i, numInRow;
        String outString = "";

        myWindow.clearOut();

        i = 1; numInRow = 0;
        while (i <= 100){
            outString += i + " ";

            numInRow++;
            if (numInRow == 10){
                outString += "\n";
                numInRow = 0;
            }

            i++;
        }

        myWindow.writeOutLine(outString);
    }


    //==========================================================================
    // UTILITIES ===============================================================
    //==========================================================================
    private static boolean isNumeric(String str){
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    private static int getRandom(int n1, int n2){
        int retVal = 0;

        retVal = n1 + (int) Math.floor(Math.random() * (n2 - n1 + 1));

        return retVal;
    }

}
