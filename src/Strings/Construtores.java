package Strings;

public class Construtores {

    public static void main(String[] args) {
        String vazia = new String();
        System.out.println(vazia);

        String java = new String("Java");
        System.out.println(java);

        String java1 = new String(java);
        System.out.println(java1);

        char[] charsJava = {'j','a','v','a'};
        String java2 = new String(charsJava);
        System.out.println(java2);

        char[] abcdef = {'a','b','c','d','e','f'};
        String abc = new String(abcdef, 1,3);
        System.out.println(abc);

        byte[] ascii = {65,66,67,68,69};
        String abcde = new String(ascii);
        System.out.println(abcde);

    }
}
