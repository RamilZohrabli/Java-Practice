package week13;
public class Task3 {

    static class Counter {
        private int count = 0;

        public synchronized void increment() {
            count++; 
        }

        public synchronized int getValue() {
            return count; 
        }
    }

    static class Incrementor extends Thread {
        private final Counter counter;
        private final int N;

        public Incrementor(Counter counter, int N) {
            this.counter = counter;
            this.N = N;
        }

        @Override
        public void run() {
            for (int i = 0; i < N; i++) {
                counter.increment(); 
            }
            System.out.println("Finished incrementing " + N + " times.");
        }
    }

    static class Reader extends Thread {
        private final Counter counter;
        private final int N;

        public Reader(Counter counter, int N) {
            this.counter = counter;
            this.N = N;
        }

        @Override
        public void run() {
            for (int i = 0; i < N; i++) {
                System.out.println("Reader read value: " + counter.getValue());
            }
            System.out.println("Reader finished reading " + N + " times.");
        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter(); 

        Incrementor incrementor = new Incrementor(counter, 10);
        Reader reader = new Reader(counter, 10);

        incrementor.start();
        reader.start();

        try {
            incrementor.join();
            reader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads have completed.");
    }
}
