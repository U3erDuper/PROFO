public class ApplicationDriver {
    public static void main(String args[]) {
        Person tania = new Person();

        tania.setAge(12);
        tania.setName("Paul");

        System.out.println("Hello " + tania.getName());
        System.out.println("Tania is " + tania.getAge() + " years old.");
        //System.out.println("Tania's DOB is  ");

    }
}

