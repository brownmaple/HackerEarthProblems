package hackerEarth;

/*Improved by referring https://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other/
no character array is required as we can get the character directly from the string using charAt() func
And only one variable is enough because instead of calculating XOR for both strings separately and comparing their values
we can add the XOR results into only one variable and then check if it is equal to 0

BUT THE MAIN ISSUE IS THAT BITWISE XOR WILL NOT WORK FOR CHECKING ANAGRAMS!!!*/
public class AnagramCheckerUsingXOR {

    public static void main(String[] args) {
        AnagramCheckerUsingXOR acur = new AnagramCheckerUsingXOR();
        String inp1 = "abba";
        //char[] ca1 = inp1.toCharArray();
        String inp2 = "heeh";
        //char[] ca2 = inp2.toCharArray();
        int temp1 = 0;
        int temp2 = 0;
        if(inp1.length()!= inp2.length())
            System.out.println("not anagram");
        else {
            for(int i=0;i<inp1.length();i++){
                System.out.println(inp1.charAt(i));
                temp1 ^= inp1.charAt(i);

                System.out.println(inp2.charAt(i));
                temp2 ^= inp2.charAt(i);

            }
            System.out.println("temp1 is:"+temp1);
            System.out.println("temp2 is:"+temp2);
            if(temp1 == temp2)
                System.out.println("anagram");
            else
                System.out.println("not anagram");
        }
    }
}
