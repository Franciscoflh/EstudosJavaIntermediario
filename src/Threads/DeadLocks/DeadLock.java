package Threads.DeadLocks;

public class DeadLock {
    public static void main(String[] args) {
        final String RECURSO1 = "Recurso 1";
        final String RECURSO2 = "Recurso 2";

        Thread t1 = new Thread(){
            public void run(){
                synchronized (RECURSO1){
                    System.out.println("Thread 1: bloqueou o recurso 1");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread 1: tentando acessar o recurso 1");

                    synchronized (RECURSO2){
                        System.out.println("Thread 1: bloqueou o recurso 2");
                    }
                }

            }
        };

        Thread t2 = new Thread(){
            public void run(){
                synchronized (RECURSO2){
                    System.out.println("Thread 2: bloqueou o recurso 1");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread 2: tentando acessar o recurso 1");

                    synchronized (RECURSO1){
                        System.out.println("Thread 2: bloqueou o recurso 2");
                    }
                }

            }
        };

        t1.start();
        t2.start();
    }
}
