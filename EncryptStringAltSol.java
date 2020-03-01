package hackerEarth;

import java.util.Scanner;

//written by https://www.hackerearth.com/@Entranco

public class EncryptStringAltSol {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        char currChar = ' ';
        int counter = 0;
        String value = input.nextLine();
        StringBuilder output = new StringBuilder();
        for(char el : value.toCharArray()) {
            if(currChar != el) {
                if(counter > 1) {
                    output.append("" + currChar + counter);
                }
                else {
                    output.append("" + currChar);
                }
                currChar = el;
                counter = 0;
            }
            counter++;
        }

        if(counter > 1) {
            output.append("" + currChar + counter);
        }
        else {
            output.append("" + currChar);
        }
        System.out.print(output.toString().substring(1));
    }
}
