package Enumeradores.CalculadoraComEnum;

public class OperacaoTeste {
    public static void main(String[] args) {
        double x = 2.0;
        double y = 3.0;

        for(Operacao op : Operacao.values()){
            System.out.println(x + " " + op.toString()+ " " + y + " " + "= " + op.executaOperacao(x,y));
        }
    }
}
