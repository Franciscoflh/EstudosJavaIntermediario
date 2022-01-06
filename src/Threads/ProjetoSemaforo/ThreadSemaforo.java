package Threads.ProjetoSemaforo;

public class ThreadSemaforo implements Runnable{
    private CorSemaforo cor;
    private boolean parar;
    private boolean isCorMudou;

    public ThreadSemaforo(){
        this.cor = CorSemaforo.VERMELHO;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while(!parar){
            try {
                Thread.sleep(this.cor.getTempoEspera());
                this.mudarCor();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private synchronized void mudarCor(){
        switch (this.cor){
            case VERMELHO:
                this.cor = CorSemaforo.VERDE;
                break;
            case AMARELO:
                this.cor = CorSemaforo.VERMELHO;
                break;
            case VERDE:
                this.cor = CorSemaforo.AMARELO;
                break;
            default:
                break;
        }
        this.isCorMudou = true;
        notify();
    }

    public synchronized void esperaCorMudar(){
        while(!this.isCorMudou){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.isCorMudou = false;
    }

    public synchronized void desligaSemaforo(){
        this.parar = true;
    }

    public CorSemaforo getCor() {
        return cor;
    }

    public void setCor(CorSemaforo cor) {
        this.cor = cor;
    }
}
