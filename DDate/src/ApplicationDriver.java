/**
 * Created by Yann Toole on 31/07/2016.
 */

import java.util.Scanner;
import java.util.Random;
public class ApplicationDriver {

    public static void main(String[] args){

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your name..");

        String name = myScanner.nextLine();

        System.out.println ("Hello "+name+", you are a DOUCHE :)");
        System.out.println ();
        System.out.println ("I can tell you when you will die if you provide your DOB below.");

        System.out.println ("Enter the Day (number)..");
        int day = myScanner.nextInt();

        System.out.println ("Enter the Month (number)..");
        int month = myScanner.nextInt();

        System.out.println ("Enter the Year (in 4 digits)..");
        int year = myScanner.nextInt();

        int[] deathAge = {25, 36, 47, 52, 58, 64, 69, 76, 85, 88, 94, 100};

        double costOfPizza = 7.99;
        int costInteger = (int) costOfPizza;

        Random rand = new Random();
        int x = rand.nextInt(12);

        int age = 2016-year;

        int ddays=0,death=0;

        while (age>deathAge[x]){
            x = rand.nextInt(12);
        }
        ddays = (deathAge[x]-age)*365;
        death = ddays-(day/month);
        System.out.println (123 + "" + "+Congratulations "+name+"!! You will die in approximately "+death+" days :)");
        System.out.println ("Why don't you start a countdown now!!");
    }
}


