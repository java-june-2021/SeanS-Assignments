public class FizzBuzz {
    
    public String fizzBuzz(int val) {
        if(val % 3 == 0 && val % 5 == 0) {
            return "fizzbuzz";
        }   else if(val % 3 == 0) {
            return "fizz";
        }   else if(val % 5 == 0) {
            return "buzz";
        }   else {
            return Integer.toString(val);
        }
    }

    public void counter() {
        for(int i = 1; i <= 100; i++) {
            String result = fizzBuzz(i);
            System.out.println("Number:" + i + "Result: " + result);
        }
    }
}
