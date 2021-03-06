package Threads.Runnable;

import Threads.MinhaThread;

public class Teste {

    public static void main(String[] args) {
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 600);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 800);

        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();

        t1.start();
        t2.start();
        t3.start();

        for (int i = 0; i < 15; i++) {
            try{
                Thread.sleep(200);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            
        }
        
        System.out.println("programa finalizado");
    }
}
