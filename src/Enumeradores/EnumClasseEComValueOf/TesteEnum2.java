package Enumeradores.EnumClasseEComValueOf;

public class TesteEnum2 {
    public static void main(String[] args) {

        DiaSemana[] dias = DiaSemana.values();

        for(int i = 0; i< dias.length; i++){ //utilizando values
            System.out.println(dias[i]);
        }

        //utilizando values com um for mais eficiente
        for(DiaSemana dia : DiaSemana.values()){
            System.out.println(dia);
        }

        //utilizando valueOf
        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
    }
}
