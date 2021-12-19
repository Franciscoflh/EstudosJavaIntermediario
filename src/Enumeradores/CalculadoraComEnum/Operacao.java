package Enumeradores.CalculadoraComEnum;

public enum Operacao {
    SOMA("+"){
        public double executaOperacao(double x, double y){
            return x+y;
        }
    }, SUBTRACAO("-"){
        public double executaOperacao(double x, double y){
            return x+y;
        }
    }, MULTIPLICACAO("*"){
        public double executaOperacao(double x, double y){
            return x*y;
        }
    }, DIVISAO("/"){
        public double executaOperacao(double x, double y){
            return x/y;
        }
    };

    private String simbolo;

    Operacao(String simbolo){
        this.simbolo = simbolo;
    }

    public abstract double executaOperacao(double x, double y);

    public String toString(){
        return this.simbolo;
    }

}
