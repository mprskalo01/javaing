public class Main {
    /*
        simple value stored in stack                values stored in heap
        PRIMITIVE TYPES                             REFERENCE TYPES
        int - 7                                     string - 'Hello'
        double - 7.8                                array - [1, 2, 3, 4]
        char - 'a'                                  object - {value: 5, name: "objectValue"}
        boolean - true
     */

    public static void main(String[] args) {

        int age = 23;
        int year = 2025;
//        System.out.println(age +"\n" + "The current year is: " + year);

        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.4;
//        System.out.println("$" + price);

        char grade = 'A';
        char symbol = '!';
        char currency = '$';
//        System.out.println(currency);


        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println(isStudent);
        if (isStudent) {
            System.out.println("You're a student");
        }

        String name = "Mario Prskalo";
        System.out.println("Hello " + name);
        System.out.println("You are a " + age + " year old");
    }
}
