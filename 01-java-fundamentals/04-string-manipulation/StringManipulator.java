public class StringManipulator {

    // Trim both input strings and then concatenate them. 
    // Return the new string. 
    // Feel free to use the trim method of the String class.

    public String trimAndConcat(String str1, String str2) {
        String str3 = str1.trim() + str2.trim();
        return str3;
    }

    // Get the index of the character and return either the index or null. 
    // If the character appears multiple times, return the first index. 
    // Feel free to use the indexOf method of the String class.

    public Integer getIndexOrNull(String str, char cha) {
        Integer result = str.indexOf(cha);
        if(result < 0) {
            return null;
        }
        return result;
    }

    // Get the index of the start of the substring and return either the 
    // index or null. Feel free to use the indexOf method of the String class.

    public Integer getIndexOrNull(String str, String str2) {
        Integer result = str.indexOf(str2);
        if(result < 0) {
            return null;
        }
        return result;
    }

    // Get a substring using a starting and ending index, 
    // and concatenate that with the second string input to our method. 
    // Feel free to use the substring method of the String class.
    
    public String concatSubstring(String substring, int startIndex, int endIndex, String concatme) {
        substring = substring.substring(startIndex, endIndex);
        String concatString = substring + concatme;
        return concatString;
    }

}
