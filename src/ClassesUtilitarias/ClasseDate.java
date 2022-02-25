package ClassesUtilitarias;

import java.util.Date;

public class ClasseDate {
    public static void main(String[] args) {
        Date today = new Date();

        System.out.println(today);
        //retorna a quantidade de milissegundos desde 1970
        System.out.println(today.getTime());
        System.out.println(today.getDate());
    }
}
