package hackerEarth;

import java.util.Scanner;

public class EasyPalindrome {

    public static void calc(String s){
        Boolean check = false;
        int depth = 0;
        String input = s;
        while((input.length() > 1) && (input.length()%2==0)) {
            //System.out.println(input);
            check = ifPalindrome(input);
            if(check == false)
                break;
            input = input.substring(0,input.length()/2);
            depth++;
        }
        System.out.println(depth);
        System.out.println(input);
    }

    public static Boolean ifPalindrome(String s){
        int count = 0;
        int n=s.length();
            for (int i = 0, j = n - 1; i < n / 2; i++, j--) {
                if (s.charAt(i) == s.charAt(j))
                    count++;
            }
            if (count != n / 2) {
                //System.out.println("not palindrome");
                return false;
            }
            //System.out.println("palindrome");
            return true;
    }
    public static void main(String[] args) {
        //int count = 0;
        String name = null;
        //while(count<=1){
            Scanner s = new Scanner(System.in);
            name = s.nextLine();
            System.out.println(name);
            //count++;
        //}
        //calc(name);
    }
}
