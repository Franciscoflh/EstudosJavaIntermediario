package ElementosBasicos.Formatacao;

public class Formatacao {

    private static void formataNumeros(){
        double[] precos = {10000, 123.54, 7843.567, 1, 4.5678};

        for (int i = 0; i< precos.length; i++){
            System.out.printf("%s %02d: Total de R$%,10.2f%n","Item", i+1, precos[i]);
        }
    }

    public static void main(String[] args) {
        formataNumeros();
    }
}
