package Strings;



public class JoinESplit {
    public static void main(String[] args) {
        //junta as strings através de um delimitador
        String alfabeto = String.join(", ", "A", "B", "C");

        System.out.println(alfabeto);

        //separa as strings
        String[] letras = alfabeto.split(",");
        for (String letra:letras) {
            System.out.println(letra);
        }

        String arquivo = "1;Antônio;30;";
        String[] infos = arquivo.split(";");
        Pessoa pessoa = new Pessoa(Integer.parseInt(infos[0]),infos[1],Integer.parseInt(infos[2]));

        System.out.println(pessoa);
    }
}
