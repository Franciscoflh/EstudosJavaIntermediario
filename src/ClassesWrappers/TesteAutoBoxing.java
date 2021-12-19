package ClassesWrappers;

public class TesteAutoBoxing {
    public static void main(String[] args) {

        //autoboxing
        Short num7 = 1;
        Byte num8 = 10;
        Integer num9 = 100;
        Long num10 = 10000l;
        Float num11 = 3.5f;
        Double num12 = 3.5555;
        Boolean flag2 = true;
        Character b = 'b';

        //auto un-boxing
        int num13 = num9;

        //autoboxing em expressões
        num9++;

        System.out.println(num9);

        //auto unboxing num9 => autoboxing num13/num9 => num14
        Integer num14 = num13/num9;
    }
}
