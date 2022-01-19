package Strings;

public class FazendoBuscas {

    public static void main(String[] args) {
        String banana = "banana";
        String ana = "ana";

        //retorna -1 se não encontrar
        System.out.println(banana.indexOf('x'));
        System.out.println(banana.indexOf('b'));
        System.out.println(banana.indexOf('a'));

        System.out.println(banana.indexOf(ana));

        System.out.println(banana.lastIndexOf('a'));
        System.out.println(banana.lastIndexOf(ana));

        //outra forma de fazer busca e retorna true ou false
        System.out.println(banana.contains(ana));
        System.out.println(banana.contains("ceu"));
    }
}
