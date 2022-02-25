package ClassesUtilitarias;

public class ClasseMath {
    public static void main(String[] args) {
        //calcula potencia
        System.out.println(Math.pow(2,3));
        //arredonda para cima se o número depois da virgula for maior que 5 e arrendonda para baixo se for menor
        System.out.println(Math.round(4.7));
        //arredonda sempre para cima
        System.out.println(Math.ceil(4.4));
        //arredonda sempre para baixo
        System.out.println(Math.floor(4.7));
        //Gera numeros aleatórios
        System.out.println(Math.round(Math.random()*10));
        //calcula seno de um numero
        System.out.println(Math.round(Math.sin(Math.toRadians(30))));
        //calcula cosseno
        System.out.println(Math.round(Math.cos(Math.toRadians(1))));
        //calcula tangente
        System.out.println(Math.tan(Math.toRadians(45)));
    }
}
