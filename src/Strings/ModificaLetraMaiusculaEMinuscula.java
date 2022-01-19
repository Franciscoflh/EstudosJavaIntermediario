package Strings;

import java.util.Locale;

public class ModificaLetraMaiusculaEMinuscula {
    public static void main(String[] args) {
        String teste  = "Teste";

        //imprime em caixa baixa
        System.out.println(teste.toLowerCase(Locale.ROOT));
        //imprime em caixa alta
        System.out.println(teste.toUpperCase(Locale.ROOT));

    }
}
