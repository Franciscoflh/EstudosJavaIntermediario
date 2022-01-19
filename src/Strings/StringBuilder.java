package Strings;

public class StringBuilder {
    public static void main(String[] args) {
        String[] letras = {"B","C","D","E","F"};

        String alfabeto = "";

        //forma comum
        for(String letra: letras){
            alfabeto+=letra;
            System.out.println(alfabeto);
        }

        //usando StringBuffer
        StringBuffer sb = new StringBuffer();
        for(String letra:letras){
            sb.append(letra);
        }
        alfabeto = sb.toString();

        System.out.println(alfabeto);
        alfabeto = new String(sb);
        System.out.println(alfabeto);

        System.out.println(sb.reverse());

        //usando StringBuilder
        StringBuilder sb1 = new StringBuilder();
        for(String letra:letras){
            sb1.toString();
        }
        alfabeto = sb.toString();
        System.out.println(alfabeto);
    }
}
