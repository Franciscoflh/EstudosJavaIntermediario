package ClassesUtilitarias;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ClasseSimpleDateFormat {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z Z");
        SimpleDateFormat data_ = new SimpleDateFormat("dd/MMM/yyyy");

        Calendar data1 = new GregorianCalendar(2010, 2, 20 , 14, 32, 25);
        System.out.println(data.format(data1.getTime()));
        System.out.println(data_.format(data1.getTime()));

        Date hoje = new Date();
        System.out.println(data.format(hoje));

        SimpleDateFormat data2 = new SimpleDateFormat("dd/MM/yyyy");
        String minhaData = "20/02/2000";



    }
}
