package hackerEarth;
/* MeetUp Day2 Problem 1 given by PRAKHAR AGRAWAL GOOGLE
my original code used an if loop to check all chars and then increment or decrement array position accordingly. like 0 for a, 1 for b etc,
But automatically array[character] converts the character to ASCII number and the incrementation happens in proper cell
enhanced by reference from https://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other/
TC O(n) SC O(n)*/

import java.util.Arrays;

public class AnagramChecker {

    public void arrayCounter(String istr, int[] arr) {
        for (char ch : istr.toCharArray()) {
            arr[ch]++;
        }
    }

    private boolean compareArrays(int[] arr1, int[] arr2) {
        for (int i=0;i<256;i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "bombay";
        String s2 = "baybom";
        int[] sarray = new int[256];
        Arrays.fill(sarray,0);
        int[] darray = new int[256];
        Arrays.fill(darray,0);
        if (s1.length() == s2.length()) {
            AnagramChecker ac = new AnagramChecker();
            ac.arrayCounter(s1, sarray);
            ac.arrayCounter(s2, darray);
            if(ac.compareArrays(sarray, darray))
                System.out.println("anagrams");
            else
                System.out.println("not anagrams");
        }
        else
            System.out.println("not anagrams");
    }
}