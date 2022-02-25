package ClassesUtilitarias;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClasseGregorianCalendar {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();

        GregorianCalendar today_ = new GregorianCalendar();

        imprimeData(today_);
        System.out.println(today_.isLeapYear(2017));

        GregorianCalendar today1 = new GregorianCalendar(2017, 0, 1);
        imprimeData(today1);
    }

    private static void imprimeData(Calendar hoje){
        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int hora = hoje.get(Calendar.HOUR);
        int minutosHora = hoje.get(Calendar.MINUTE);
        int segundosHora = hoje.get(Calendar.SECOND);

        System.out.printf("Hoje é dia %d do mês %d do ano %d\n",dia, (mes+1), ano);
        System.out.printf("A hora é %d:%d:%d\n", hora,minutosHora,segundosHora);
    }
}
