import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.List;

public class PuzzleJava {
    
    public static void main(String[] args) {
        int[] puzzleArr = {3,5,1,2,7,9,8,13,25,32};
        int[] arr1 = {2,2,2}; //6
        // Object[] retVal = printSumBig(puzzleArr);
        // System.out.println(Arrays.toString(retVal));
        // String[] names = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        // System.out.println(Arrays.toString(shuffleAndShow(names)));
        // alphaScramble();
        // Random r = new Random();
        // System.out.println(r.nextInt(45) + 55);
        // System.out.println(Arrays.toString(random10()));
        // sortAndDisplay();
        // System.out.println(randomStr());
        System.out.println(Arrays.toString(moreRandom10()));
    }

    // Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. 
    // Print the sum of all numbers in the array. 
    // Also have the function return an array that only includes numbers that are greater than 10 
    // (e.g. when you pass the array above, it should return an array with the values of 13,25,32)

    public static Object[] printSumBig(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > 10) {
                newArr.add(arr[i]);
            }
        }
        System.out.println(sum);
        return newArr.toArray();
    }
    

    // Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. 
    // Shuffle the array and print the name of each person. 
    // Have the method also return an array with names that are longer than 5 characters.
    
    public static Object[] shuffleAndShow(String[] arr) {
        ArrayList<String> newArr = new ArrayList<String>();
        List<String> nameList = new ArrayList<String>();
        for (int i = 0; i < arr.length; i++) {
            nameList.add(arr[i]);
        }

        Collections.shuffle(nameList);
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(nameList.get(i));
            if (nameList.get(i).length() > 5) {
                newArr.add(nameList.get(i));
            }
        }
        return newArr.toArray();
    }

    // Create an array that contains all 26 letters of the alphabet (this array must have 26 values). 
    // Shuffle the array and, after shuffling, display the last letter from the array. 
    // Have it also display the first letter of the array. 
    // If the first letter in the array is a vowel, have it display a message.
        // To shuffle a collection, you can use the shuffle method of the Collections class.
    
    public static void alphaScramble() {
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (char i = 'a'; i <= 'z'; i++) {
            alphabet.add(i);
        }
        Collections.shuffle(alphabet);
        System.out.println(alphabet);
        System.out.println(alphabet.get(alphabet.size()-1));
        System.out.println(alphabet.get(0));
        if (alphabet.get(0) == 'a' || alphabet.get(0) == 'e' || alphabet.get(0) == 'i' || alphabet.get(0) == 'o' || alphabet.get(0) == 'u') {
            System.out.println("Vowel!");
        }
    }


    
    // Generate and return an array with 10 random numbers between 55-100.
        // To get a random integer, you can use the nextInt method of the Random class.
    public static int[] random10() {
        int[] randomArr = new int[10];
        Random r = new Random();
        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = r.nextInt(45) + 55;

        }
        return randomArr;
    }


    // Generate and return an array with 10 random numbers between 55-100 
    // and have it be sorted (showing the smallest number in the beginning). 
    // Display all the numbers in the array. 
    // Next, display the minimum value in the array as well as the maximum value.
        // To sort a collection, you can use the sort method of the Collections class.
    
    public static Object[] sortAndDisplay() {
        int[] randomArr = random10();
        List<Integer> sortedList = new ArrayList<Integer>();
        for (int i = 0; i < randomArr.length; i++) {
            sortedList.add(randomArr[i]);
        }
        Collections.sort(sortedList);
        System.out.println(sortedList);
        // MAX
        int max = sortedList.get(0);
        for (int i = 0; i < sortedList.size(); i++) {
            if (sortedList.get(i) > max) {
                max = sortedList.get(i);
            }
        }
        System.out.println("Max value is: " + max);
        // find min == add to new array
        int min = sortedList.get(0);
        for (int i = 0; i < sortedList.size(); i++) {
            if (sortedList.get(i) < min) {
                min = sortedList.get(i);
            }
        }
        System.out.println("Min value is: " + min);
        return sortedList.toArray();
    }

    // Create a random string that is 5 characters long.
    public static String randomStr() {
        Random r = new Random();
        ArrayList<Character> randomCharArr = new ArrayList<Character>();
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (char i = 'a'; i <= 'z'; i++) {
            alphabet.add(i);
        }
        Collections.shuffle(alphabet);
        for (int i = 0; i < 5; i++) {
            randomCharArr.add(alphabet.get(i));
        }
        // System.out.println(randomCharArr);
        StringBuilder randomStr = new StringBuilder();
        for (char randomChar : randomCharArr) {
            randomStr.append(randomChar);
        }
        return randomStr.toString();
    }

    
    // Generate an array with 10 random strings that are each 5 characters long
    
    public static String[] moreRandom10() {
        String[] moreRandom10 = new String[10];
        for (int i = 0; i < 10; i++) {
            moreRandom10[i] = randomStr();
        }
        return moreRandom10;
    }
}
