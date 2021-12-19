package EscopoDeVariaveis;

public class EscopoVariaveis {
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int calculaValor(int valor){
        valor = valor + 10;
        return valor;
    }
    public int Teste(){
        int valor = 5;

        if(true){
            valor--;
        }
        return valor;
    }
    public void outroTeste(){
        for(int i = 0; i<10; i++){
            System.out.println(i);
        }
        for(int j=0; j<10;j++){
            System.out.println(j);
        }
    }
    public void teste3(){
        boolean flag = true;
        if(flag){
            int variavel1 = 10;
            variavel1 ++;
            System.out.println(variavel1);
        }
    }
    public void teste4(int num){
        int total = 0;

        try{
            int OutroNumero = 0;
            total = num/OutroNumero;
        }catch (Exception e){
            e.printStackTrace();
        } finally{
            total++;
        }

        num++;

    }
}
