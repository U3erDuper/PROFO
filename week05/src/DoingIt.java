import java.util.ArrayList;

/**
 * Created by shuxford on 25/12/2015.
 */
public class DoingIt {
    Window myWindow;

    int[] myIntegerArray = {4, 3, 2, 1, 7};

    public void doIt(Window win){
        myWindow = win;


        //ex21();
        //ex22();
        //ex23();
        //ex31();
        //ex41();
        //ex42();
        //ex51();
        ex52();

        //valueAndReference();
        //simpleArrays();
        //declaringArraysAndUsingArrayElements();
        //whenArraysContainReferenceTypes();
        //arrayListExample();
        //strings();
        //stringClassExample();

    }

    //LAB EXERCISES for you to code
    private void ex21()
    {

        int numberOfElems = myIntegerArray.length;
        myWindow.clearOut();
        myWindow.writeOutLine(numberOfElems);
        myWindow.writeOutLine("The value at the last index is: " + myIntegerArray[numberOfElems -1]);
    }

    private void ex22()
    {
        int[] a = myIntegerArray;
        int product = 1;
        for(int i = 0; i < a.length; i++)
        {
            product *= a[i];
        }
        myWindow.clearOut();
        myWindow.writeOutLine("The product of the 'a' array is: " + product);
    }

    private void ex23()
    {
        boolean square;

        myWindow.clearOut();

        square = (Math.sqrt(myIntegerArray[0]) == myIntegerArray[2]);

        myWindow.writeOutLine("Is element [2] the square root of element [0]? " + square);
    }

    private void ex31()
    {
        String[] myStringArray;

        //myWindow.writeOutLine(myStringArray[0]);                //Compile Error

        myStringArray = new String[3];
        myStringArray[0] = "green";

        //myStringArray[2] = myStringArray[2].toLowerCase();      //NullPointerException

        myWindow.clearOut();
        //myWindow.writeOutLine(myStringArray[3]);                //ArrayIndexOutOfBoundsException
        myWindow.writeOutLine(myStringArray[0].length());
    }

    private void ex41()
    {
        ArrayList<String> myList = new ArrayList<>(100);
        myWindow.clearOut();

        myList.add("three");
        myList.add("one");
        myList.add(0, "four");
        myList.add(2, "two");

        myWindow.writeOutLine(myList);

        myList.set(2, "seven");

        myWindow.writeOutLine(myList);

        myList.remove(0);

        myWindow.writeOutLine(myList);

        myList.add(myList.size() -1, "five");
        myList.add(myList.size() -1, "five");
        myList.add(myList.size() -1, "five");

        myWindow.writeOutLine(myList);

        myWindow.writeOutLine(myList.indexOf("seven"));

    }

    private void ex42()
    {
        ArrayList<String> myList = new ArrayList<>(100);
        myWindow.clearOut();

        myList.add("three");
        myList.add("one");
        myList.add(0, "four");
        myList.add(2, "two");

        myWindow.writeOutLine(myList);

        myList.set(2, "seven");

        myWindow.writeOutLine(myList);

        myList.remove(0);

        myWindow.writeOutLine(myList);

        myList.add(myList.size() -1, "five");
        myList.add(myList.size() -1, "five");
        myList.add(myList.size() -1, "five");

        myWindow.writeOutLine(myList);

        myWindow.writeOutLine(myList.indexOf("seven"));

        boolean hasString = myList.contains("seven");       //.contains - Returns true if this list contains the specified element.

        myWindow.writeOutLine(hasString);
    }

    private void ex51()
    {

        String camelCase = myWindow.readIn();

        camelCase = camelCase.toLowerCase();

        camelCase = camelCase.substring(0,1).toUpperCase() + camelCase.substring(1);

        myWindow.clearOut();

        myWindow.writeOutLine(camelCase);

    }

    private void ex52()
    {
        myWindow.clearOut();
        myWindow.writeOutLine(String.format("%4d\n%4d\n%4d\n%4d", 1, 10, 100, 1000));  //% is placeholder, d - passing decimal base integer, 4 - pad by 4 places
    }

    //WORKSHOP CODE for you to play with
    private void valueAndReference(){
        int int1, int2;

        myWindow.clearOut();

        //VALUE TYPES
        myWindow.writeOutLine(">>>Value Types");
        int1 = 1;
        int2 = 2;
        myWindow.writeOutLine("int1 = " + int1 + " " + ", int2 = " + int2);

        int2 = int1;    //int2 is set with a copy of the value of int1
                        //int1 and int are 2 independent variables that have the same value
        myWindow.writeOutLine("int1 = " + int1 + " " + ", int2 = " + int2);

        int1 = 7; //changing int1 has no effect on int2
        myWindow.writeOutLine("int1 = " + int1 + " " + ", int2 = " + int2);





        //REFERENCE TYPES
        Person p1, p2;

        myWindow.writeOutLine("\n>>>Reference Types");
        p1 = new Person(); //instantiate a person object
        p2 = new Person(); //instantiate another person object
        myWindow.writeOut("p1 name/age = " + p1.getName() + "/" + p1.getAge());
        myWindow.writeOutLine(", p2 name/age = " + p2.getName() + "/" + p2.getAge());

        p1.setName("Alana"); p1.setAge(1);
        p2.setName("Jake"); p2.setAge(2);
        myWindow.writeOut("p1 name/age = " + p1.getName() + "/" + p1.getAge());
        myWindow.writeOutLine(", p2 name/age = " + p2.getName() + "/" + p2.getAge());

        p2 = p1;    //p2 is set with a copy of the value of p1
                    //BUT p1 and p2 are interpreted as memory addresses
        myWindow.writeOut("p1 name/age = " + p1.getName() + "/" + p1.getAge());
        myWindow.writeOutLine(", p2 name/age = " + p2.getName() + "/" + p2.getAge());

        p1.setAge(7); //changing p1 is now the same as changing p2
        myWindow.writeOut("p1 name/age = " + p1.getName() + "/" + p1.getAge());
        myWindow.writeOutLine(", p2 name/age = " + p2.getName() + "/" + p2.getAge());
    }

    private void simpleArrays(){
        int[] myIntArray = {11, 22, 33};

        String[] myStringArray = {"clubs", "diamonds", "hearts", "spades" };

    }

    private void declaringArraysAndUsingArrayElements(){
        //local array declarations
        int[] myIntArray;
        String[] myStringArray = new String[5];
        Person[] myPersonArray = new Person[100];

        int numberOfElements;

        myWindow.clearOut();

        //next statement causes a compile error: myIntArray undefined
        //myWindow.writeOutLine(myIntArray.length);

        myIntArray = new int[10];
        numberOfElements = myIntArray.length; //arrays know their length
        myWindow.writeOutLine("myIntArray.length: " + numberOfElements);

        myIntArray[5] = 21; //set an element value
        myWindow.writeOutLine("myIntArray[5]: " + myIntArray[5]); //get an element value

        //myPersonArray[77].setAge(19); //NullPointerException
        Person me = new Person();
        myPersonArray[77] = me; //2 references to the same place in memory
        me.setName("Jillian");
        myPersonArray[77].setAge(31);
        myWindow.writeOutLine("me.getAge(): " + me.getAge());
        myWindow.writeOutLine("myPersonArray[77].getName(): " + myPersonArray[77].getName());
        myWindow.writeOutLine("myIntArray[9]: " + myIntArray[9]); //auto-initialisation of a local
        //myWindow.writeOutLine(myIntArray[10]); //ArrayIndexOutOfBoundsException
    }

    private void whenArraysContainReferenceTypes(){
        String[] myStringArray2;
        myStringArray2 = new String[4];
        myStringArray2[1] = "test";
    }

    private void arrayListExample(){
        ArrayList<Integer> myList = new ArrayList<Integer>(100);

        myWindow.clearOut();
        myList.add(3); //set can only replace existing not add new
        myList.add(1); //this type of add (1 paraneter) appends to the end of the array

        myList.add(0, 4);//this type of add (2 parameters) inserts value 4 at index 2
        myList.add(2, 2);//which pushes all the following elements up one index

        myWindow.writeOutLine(myList);  //wow! ArrayLists know how to display themselves
                                        //this does not work for Java arrays
        myList.set(2, 7); //set can only be used to
        myWindow.writeOutLine(myList);

        myList.remove(0);
        myWindow.writeOutLine(myList);

        myList.add(myList.size() -1, 5);
        myList.add(myList.size() -1, 5);
        myList.add(myList.size() -1, 5);
        myWindow.writeOutLine(myList);

        myWindow.writeOutLine(myList.indexOf(7));
    }

    private void strings(){
        String myString = "";
        String myString2 = new String("");

        myString = "one";
        myString = "two";
    }

    private void stringClassExample(){
        String testString = "abcdefghijklmnopqrtsuvwxyz";
        String formatString, insertString;
        myWindow.clearOut();

        myWindow.writeOutLine("Length: " + testString.length());
        myWindow.writeOutLine("starts with abc?: " + testString.startsWith("abc"));
        myWindow.writeOutLine("10th character is j?: " + testString.substring(9, 10).equals("j"));
        myWindow.writeOutLine("4 characters starting at the 5th character are: " +
                testString.substring(3, 7));
        myWindow.writeOutLine("all the character after this are: " + testString.substring(7));

        formatString = "A double truncated to 3 places: %.3f.";
        myWindow.writeOutLine(String.format(formatString, 1.2745));

        formatString = "An int left justified in 10 spaces: %-10d. A double truncated to 1 place: %.1f.";
        myWindow.writeOutLine(String.format(formatString, 77, 1.2345));

        insertString ="***";
        formatString = "Insert a string %s. Escape the placeholder sentinel %%";
        myWindow.writeOutLine(String.format(formatString, insertString, 1.2345));

    }

}
