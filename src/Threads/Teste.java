package Threads;

public class Teste {
    public static void main(String[] args) {
        MinhaThread thread = new MinhaThread("Thread1", 600);

        MinhaThread thread2 = new MinhaThread("Thread2", 900);

        MinhaThread thread3 = new MinhaThread("Thread3", 500);
    }
}
