package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
        // Start at the beginning of a sentence. Scan the sentence and return 1 if Y is present or Z is present.
        //Then add the 1's for however many times they appear in a sentence.
        //Only makes variables you know you need at first.
        //The computer finds what I am looking for
        int count = 0;
        int length = input.length();
        for (int i = 0; i < length; i++) {
            //charAt is a method that takes a parameter index so it needs something within the parentheses.
            if ((input.charAt(i) == 'y' || input.charAt(i) == 'z') &&
                    (i == input.length() - 1) || !(Character.isLetter(input.charAt(i + 1))))
            {
                count = count + 1;

            }


        }
        return count;

    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){
        return base.replace(remove, "");
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
       // Scan the sentence to see how many "is" and "not" appear.
        // Return true if the counts are equal in number.
        int countIs = 0;
        int countNot = 0;
        for  (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == 'i' && (input.charAt(i+1)=='s')) {
                countIs++;
            }
            if (input.charAt(i) == 'n' && input.charAt(i+1) == 'o' && input.charAt(i+2) == 't') {
                countNot++;
            }
        }
        return countIs == countNot;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        // if there are two g's next to each other it should return true
        // if there is any single g in the phrase, it should return false
        for (int i = 1; i < input.length() ; i++) {
            if (input.charAt(i) == 'g') {
               if (input.charAt(i+1) != 'g' && input.charAt(i-1) != 'g') {
                return false;
               }
            }

        }
        //return input.contains("gg");
        // return input.indexOf("gg") != - 1;
        return true;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        int count = 0;
        // -3 so it doesn't throw an error at the end of the string.
        for (int i = 0 ; i<input.length()-3 ; i++){
            if (input.charAt(i) == input.charAt(i+1) && input.charAt(i) == input.charAt(i+2)) {
                count = count + 1;
            }
        }

        return count;
    }
}
