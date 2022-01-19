package Strings;

public class Concatenacao {
    public static void main(String[] args) {
        String curso = "Curso ";
        String java = "Java";

        String cursoJava = curso + java;
        System.out.println(cursoJava);

        String resultado2mais2 = "Resultado 2+2 = " + (2+2);
        String _resultado2mais2 = "Resultado 2+2 = " + 2+2;

        String um = String.valueOf(1);
        System.out.println(um);

        String concatenacao = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Curabitur elementum, justo ut interdum bibendum, nisl nisl varius odio, " +
                "sit amet consectetur metus nibh at ex. Nam elementum lorem at consectetur porta. " +
                "Etiam consequat neque at accumsan vehicula. Suspendisse eros eros, elementum non congue dictum," +
                " fringilla sit amet quam. Morbi imperdiet sagittis orci sit amet rhoncus.";

        System.out.println(concatenacao);
    }
}
