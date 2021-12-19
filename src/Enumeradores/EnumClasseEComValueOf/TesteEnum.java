package Enumeradores.EnumClasseEComValueOf;

public class TesteEnum {
    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.DOMINGO;
        System.out.println(dia.toString()+ " - "+ dia.getValor());

        Data data = new Data(2, 6, 2019, DiaSemana.QUARTA);
    }
}
