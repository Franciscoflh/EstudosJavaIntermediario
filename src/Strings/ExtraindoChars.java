package Strings;

import java.util.Arrays;

public class ExtraindoChars {
    public static void main(String[] args) {
        String java = "Java";

        for (int i = 0; i < java.length(); i++) {
            System.out.println(java.charAt(i));
        }

        char[] jav = new char[3];
        java.getChars(0,3,jav,0);
        System.err.println(jav);

        byte[] javBytes = new byte[3];
        java.getBytes(0,3, javBytes, 0);
        //imprime formato ascii
        System.out.println(Arrays.toString(javBytes));


        char[] javaChars = java.toCharArray();
        System.out.println(javaChars);
    }
}
