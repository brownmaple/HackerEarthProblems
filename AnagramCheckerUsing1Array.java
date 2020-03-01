package hackerEarth;

/* MeetUp Day2 Problem 1 given by PRAKHAR AGRAWAL GOOGLE
enhanced by reference from https://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other/
TC O(n) SC O(n)*/

import java.util.Arrays;

public class AnagramCheckerUsing1Array {

//    public void arrayIncrementer(String istr, int[] arr) { notoptimized solution
//        for (char ch : istr.toCharArray()) {
//            arr[ch]++;
//        }
//    }
//
//    public void arrayDecrementer(String istr, int[] arr) { notoptimized solution
//        for (char ch : istr.toCharArray()) {
//            arr[ch]--;
//        }
//    }

    //optimization using a single for loop in a single method

    public void arrayIncDec(String i1str, String i2str, int[] arr1){
        char[] s1chars = i1str.toCharArray();
        char[] s2chars = i2str.toCharArray();
        for(int i=0;i<i1str.length();i++){
            arr1[s1chars[i]]++;
            arr1[s2chars[i]]--;
        }
    }

    private boolean compareArrays(int[] arr) {
        for (int i = 0; i < 256; i++) {
            if (arr[i] != 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "bombay";
        String s2 = "mumbai";
        int[] oarray = new int[256];
        Arrays.fill(oarray,0);

        if (s1.length() == s2.length()) {
            AnagramCheckerUsing1Array acua = new AnagramCheckerUsing1Array();
            //acua.arrayIncrementer(s1, oarray); notoptimized solution
            //acua.arrayDecrementer(s2, oarray); notoptimized solution

            acua.arrayIncDec(s1,s2,oarray);

            if(acua.compareArrays(oarray))
                System.out.println("anagrams");
            else
                System.out.println("not anagrams");
        }
        else
            System.out.println("not anagrams");
    }
}
