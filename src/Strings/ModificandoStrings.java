package Strings;

public class ModificandoStrings {
    public static void main(String[] args) {

        String teste = "Isso é um teste";
        System.out.println(teste);

        System.out.println(teste.substring(10));
        System.out.println(teste.substring(7,12));

        String ola = "olá";
        String mundo = "mundo";
        String olaMundo = ola.concat(mundo);
        System.out.println(olaMundo);

        //substitui um char por outro
        String espacos = "i s p a ç o";
        String semEspacos = espacos.replace('i','e');
        System.out.println(semEspacos);

        semEspacos = semEspacos.replaceAll(" ", "");
        System.out.println(semEspacos);

        String nome = " meu nome é: ";
        //remove os espaços antes e depois
        System.out.println(nome.trim());

    }
}
