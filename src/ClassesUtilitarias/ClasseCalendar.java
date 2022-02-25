package ClassesUtilitarias;

import java.util.Calendar;

public class ClasseCalendar {
    public static void main(String[] args) {

        Calendar today = Calendar.getInstance();

        int ano = today.get(Calendar.YEAR);
        int mes = today.get(Calendar.MONTH);
        int dia = today.get(Calendar.DAY_OF_MONTH);
        int hora = today.get(Calendar.HOUR);
        int minutosHora = today.get(Calendar.MINUTE);
        int segundosHora = today.get(Calendar.SECOND);

        System.out.println(today);
        System.out.println(ano);
        System.out.println(mes);
        System.out.println(dia);
        System.out.println(dia+" "+mes+" "+ano);
        System.out.println(hora);
        System.out.printf("Hoje é dia %d do mês %d do ano %d\n",dia, (mes+1), ano);
        System.out.printf("A hora é %d:%d:%d\n", hora,minutosHora,segundosHora);

        today.add(Calendar.DAY_OF_MONTH,1);
        System.out.println(today.get(Calendar.DAY_OF_MONTH));
    }
}
