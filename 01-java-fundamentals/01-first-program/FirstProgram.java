public class FirstProgram{

    // Entry Point Method (This Main Method is where JDK looks to run code)
    public static void main(String[] args) {
        System.out.println("Hello,Java 2021");
        
        byte myByte = 100; // Stores whole numbers from -128 to 127
        short myShort =1000; // Stores whole numbers from -32,768 to 32,767
        int myInt = 10000; // Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long myLong = 1000000000L; // Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float myFloat = 3.14f; // Stores fractional numbers. 6 to 7 decimal places.
        double myDouble = 3.1415926535; // Stores fractional numbers up to 15 decimal places.
        boolean myBoolean = true; // Stores true or false.
        char myChar = 'r'; // Stores single character, letter or ascii value.
        
        Character myChar2 = 'r';
        System.out.println(Character.toUpperCase(myChar2));
        Integer myInteger = 44;
        
        // Strings
        String myString = "Java June 2021";
        System.out.println(myString.length());
        
        String bootcamp = "Java ";
        String bootCamp = "June ";
        String bootCAMP = "2021";
        
        System.out.println(bootcamp + bootCamp + bootCAMP);
        
        // Operators and Conditionals
        int isOdd = 5;
        if (isOdd % 2 != 0) {
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is not odd");
        }
        
        // Loops
        int i = 0;
        while (i <= 4) {
            System.out.println("We're Counting");
            i++;
        }

        for (int j = 0; j <= 4; j++) {
            System.out.println("We Be Counting");
        }

        System.out.println(sayHello("Sean"));
        sayHello();
    }

    // New Method outside of Main Method above
    public static String sayHello(String name) {
        return "Hello " + name;
    }

    public static void sayHello() {
        System.out.println("Hello!");
    }
}