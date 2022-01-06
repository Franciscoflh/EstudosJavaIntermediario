package Threads.SuspendResumeStop;

public class MinhaThread implements Runnable{

    private String nome;
    private boolean isSuspensa;
    private boolean isTerminada;

    public MinhaThread(String nome){
        this.nome = nome;
        this.isSuspensa = false;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {
        System.out.println("Executando "+ this.nome);

        try {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread " + nome + ", " + i);
            Thread.sleep(300);
            synchronized (this){
                while(isSuspensa){
                    wait();

                }
                if(this.isTerminada){
                    break;
                }
            }
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + this.nome + " terminada");
    }
    void suspend(){
        this.isSuspensa=true;
    }
    synchronized void resume(){
        this.isSuspensa = false;
        notify();
    }
    synchronized void stop(){
        this.isTerminada = true;
        notify();
    }
}
