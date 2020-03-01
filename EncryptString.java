package hackerEarth;

public class EncryptString {
    public void compressedString(String name) {
        int counter = 1;
        for(int i=0;i<name.length();i++){
            if(i==0)
                System.out.print(name.charAt(0));
            else{
                if((name.charAt(i))==(name.charAt(i-1))){
                    counter++;
                }
                else{
                    if(counter>1) {
                        System.out.print(counter);
                        counter = 1;
                    }
                    System.out.print(name.charAt(i));
                }
            }
        }
        if(counter>1)
            System.out.print(counter);
    }

    public static void main(String[] args) {
        EncryptString e = new EncryptString();
        e.compressedString("aaabbccdss");
        //e.compressedString("aaabbccdsa");
       // e.compressedString("passaasssaaaassst");
    }
}
