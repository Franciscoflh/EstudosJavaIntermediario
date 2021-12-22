package ElementosBasicos.EscopoDeVariaveis;

public class Teste {
    public static void main(String[] args) {
        EscopoVariaveis ev = new EscopoVariaveis();
        ev.setValor(10);

        System.out.println(ev.getValor());
        System.out.println(ev.calculaValor(20));
        System.out.println(ev.getValor());
        System.out.println(ev.Teste());
        System.out.println(ev.getValor());
    }
}
