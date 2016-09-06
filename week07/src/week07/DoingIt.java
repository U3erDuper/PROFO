package week07;

/**
 * Created by shuxford on 25/12/2015.
 */
public class DoingIt {
    Window myWindow;

    int randRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    //class level variables here

    public void doIt(Window win){
        myWindow = win;

        //whileForPaste01();
        //whileForPaste02();
        //whileForPaste03();
        //whileForPaste04();

        //forForPaste01();
        //enhancedForForPaste01();
        //videoWhileLoopInfiniteLoop01();

        //dicRolls();
        //sumElems();
        //avgElems();
        //sentinelLoop();
        //dikeRolls();
        //leapYears();
        //minMax();
        //doubleNum();
        linearSearch();

        //I'm leaving you to code and organise your Lab Exercise methods from now on
        //labExn();
    }

    //LAB EXERCISES for you to code ===========================================

    private void labExn(){

    }


    private void dicRolls(){

        myWindow.clearOut();

        int die1 = 0, die2 = 1, count = 0;

        while(die1 != die2){
            die1 = randRange(1, 6);
            die2 = randRange(1, 6);
            myWindow.writeOutLine(die1 + ", " + die2);
            count++;
        }

        myWindow.writeOutLine("It took " + count + " tries to roll a double.");

    }

    private void sumElems(){

        int[] myArray = {1,2,4,67,4,3,6};

        int i = 0, sum = 0;

        while (i < myArray.length){
            sum += myArray[i];
            i++;
        }

        myWindow.clearOut();
        myWindow.writeOutLine("The total of myArray is " + sum);

    }

    private void avgElems(){

        //int[] myArray = {};
        int[] myArray = {1,2,4,67,4,3,6};
        int i = 0, avg = 0;
        myWindow.clearOut();

        if (myArray.length > 0) {
            while (i < myArray.length) {
                avg += myArray[i];
                i++;
            }
            myWindow.writeOutLine("The average of myArray is " + (avg / myArray.length));
        }
        else {
            myWindow.writeOutLine("There are no values in the array, mate...");
        }
    }

    private void sentinelLoop(){

        int total = 0;
        int count = 0;
        //String[] input = {};
        String[] input = {"1","2","4","67","four","three","done","seven","6"};
        myWindow.clearOut();

        if (input.length > 0) {
            while (!input[count].equals("done")) {
                if (isNumeric(input[count])) {
                    total += Integer.parseInt(input[count]);
                }
                count++;
            }
            myWindow.writeOutLine("The total when done is " + total);
        }
        else {
            myWindow.writeOutLine("No values in array, BIATCH!!");
        }
    }

    private void dikeRolls() {

        myWindow.clearOut();

        int die1 = 0, die2 = 1, die3 = 2;
        double rolls = 1, match = 0, percentage = 0;

        while (rolls < 1000000) {
            while (die1 != die2 || die1 != die3 || die2 != die3) {
                die1 = randRange(1, 6);
                die2 = randRange(1, 6);
                die3 = randRange(1, 6);
                myWindow.writeOutLine(die1 + ", " + die2 + ", " + die3);

                rolls++;
            }
            match++;
            die1 = 0;
            die2 = 1;
            die3 = 2;
        }
        percentage = (match/rolls)*100;
        myWindow.writeOutLine("After 1000000 rolls, there's a " + String.format("%.2f", percentage)  + "% probability of getting a match.");


    }
        /*myWindow.clearOut();
        int[] matched = new int[1000000000];
        int die1 = 0, die2 = 1, count = 0;
        double avg = 0;

        for(int i = 0; i < 1000000000; i++) {
            while (die1 != die2) {
                die1 = randRange(1, 6);
                die2 = randRange(1, 6);
                //myWindow.writeOutLine(die1 + ", " + die2);
                count++;
            }
            matched[i] = count;
            die1 = 0;
            die2 = 1;
            count = 0;
        }
        for(int abracadabra : matched) {
            avg += abracadabra;
        }
            myWindow.writeOutLine("The average number of rolls to find a match in a billion tries is " + avg);
*/

    private void leapYears() {

        int year = 1752, counter = 1, totalYears = 0;

        myWindow.clearOut();
        //for (int year = 1752; year <= 3000; year ++)
        while (year <= 3000) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                if (counter == 10) {
                    myWindow.writeOutLine(year);
                    counter = 1;
                }
                else {
                    myWindow.writeOut(year + ", ");
                    counter++;
                }
                totalYears++;
            }
            year++;
        }
        myWindow.writeOutLine("\nThere are " + totalYears + " leap years between 1752 and 3000");
    }

    private void minMax(){

        myWindow.clearOut();

        int myArray[] = new int[100];
        int max = -1, min = 101;

        for (int i = 0; i < 100; i ++) {
            myArray[i] = (int)(Math.random() * 100);
        }
        for (int number : myArray) {
            if (number < min){
                min = number;
            }
            if (number > max){
                max = number;
            }
        }
        //myWindow.writeOutLine("first index is " + myArray[0] + ", last index is " + myArray[99]);
        myWindow.writeOutLine("The lowest number of the array is " + min + ", \nThe highest number is " + max);
    }

        private void doubleNum(){

            double number = 1;
            double ofNum = 0;

            myWindow.clearOut();

            while (number <= 100){
                ofNum = Math.sqrt(number);

                if (ofNum == Math.round(ofNum)){
                    myWindow.writeOutLine(Math.round(ofNum));
                }
                number++;
            }
        }

private void linearSearch(){

    myWindow.clearOut();

    String input = myWindow.readIn();
    int occurrence = 0, index = 0;
    String myArray[] = new String[432];

    //if(myArray.length > 0) {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = Integer.toString((int) (Math.random() * 100));
        }

        for (String elem : myArray) {
            if (elem.equals(input)) {
                if (occurrence == 0) {
                    index++;
                    myWindow.writeOutLine("The first occurrence of " + input + " is at index " + index);
                }


            /*for(int i = 0; i < myArray.length; i++){
                if (myArray[i].equals(input)){
                    if(occurrence == 0){
                        index = i;
                        myWindow.writeOutLine("The first occurrence of " + input + " is at index " + index);
                    }*/
                    occurrence++;
                }
            index++;
            }
            myWindow.writeOutLine(input + " appears " + occurrence + " times in the array.");
        }

    //I'm leaving you to code and organise your Lab Exercise methods from now on



    //WORKSHOP CODE for you to play with ======================================
    private void whileForPaste01(){
        int count = 0, total = 0;

        while (total < 1000){
            total += getRandom(1, 6); //see utility methods below
            count++;
        }

        myWindow.clearOut();
        myWindow.writeOutLine("Count: " + count);
    }

    private void whileForPaste02(){
        int counter;
        int limit = 100;
        final int SENTINEL = -1 + (int) (Math.random() * 12); //[-1 .. 10]
        int  value = 0;
        boolean condition = false;

        //use a for loop for best style
        counter = 0; // or 1 depending on statements in loop block
        while (counter <= limit){ //or < or >= or > (== and != are risky, they could be skipped over)

            //process

            counter++; //or some other incrementing/decrementing
        }

        //get initial value from source
        while(value != SENTINEL){ //!value.equals(SENTINEL) for Strings

            //process input

            //get next value from source
        }

        //perform potential condition changing calculations with initial values
        while (condition){

            //process

            //perform potential condition changing calculations with updated values
        }
    }

    private void whileForPaste03(){
        final int SENTINEL = -1;
        int input = -1 + (int) (Math.random() * 12);
        myWindow.clearOut();

        while (input != SENTINEL)
            myWindow.writeOutLine(input);
            input = -1 + (int) (Math.random() * 12);

        while (input != SENTINEL)
            myWindow.writeOutLine(input);
        input = -1 + (int) (Math.random() * 12);

        while (input != SENTINEL) {
            myWindow.writeOutLine(input);
            input = -1 + (int) (Math.random() * 12);
        };

        while (input != SENTINEL); {
            myWindow.writeOutLine(input);
            input = -1 + (int) (Math.random() * 12);
        }
    }

    private void whileForPaste04(){
        int[] someArray = {1, 2, 3, 4, 5};
        int i;

        i = 0;
        while (i < someArray.length){   // takes care of an empty array
                                        //but not a null array
            // process the ith element using someArray[i] to access its value

            i++;
        }
    }


    private void forForPaste01(){
        final int MULTIPLIER = 7;
        int result;

        myWindow.clearOut();
        for (int i = 10; i >= 1; i--){
            result = i * MULTIPLIER;
            myWindow.writeOutLine("7 X " + i + " = " + result);
        }
    }

    private void enhancedForForPaste01(){
        int [] bigScreenTVMonthlyUnitsSold = {435, 151, 120, 134, 199, 201, 312, 147, 107, 127, 115, 258};
        int monthCount = 0;

        for (int elem : bigScreenTVMonthlyUnitsSold){
            if (elem >= 200)
                monthCount++;

        }

        myWindow.clearOut();
        myWindow.writeOutLine("Number of months: " + monthCount);
    }

    private void videoWhileLoopInfiniteLoop01(){

        int i = 1;

        while (i != 10){
            //process

            i = i + 2;
        }

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
