import java.sql.Time;
import java.time.Year;

public class Person {

    private int age;
    private String name;


    public void setAge(int age) {

        int i = 1;
        double d = 1.1;
        d = i + d;
        System.out.println("d = " + d + " i = " + i);


        if (age > 0 && age <= 1400) {
            this.age = age;
        }
    }
    public int x,y,z = 3;

    public void setName(String name){
        if (name.length() > 0 && name.length() <= 20) {
            this.name = name;
        }
    }

    public int getAge(){

        return age;
    }
    public String getName(){
        return name;

    }



}


