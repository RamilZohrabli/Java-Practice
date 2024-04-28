package week13;

import java.util.LinkedList;
import java.util.Queue;

public class Task4 {

    static class ShoeShop {
        private final Queue<String> stock = new LinkedList<>(); 
        private final int capacity; 

        public ShoeShop(int capacity) {
            this.capacity = capacity; 
        }

        public synchronized void produce(String shoe) throws InterruptedException {
            while (stock.size() >= capacity) {
                wait(); 
            }
            stock.add(shoe); 
            System.out.println("Produced: " + shoe);
            notifyAll(); 
        }

        public synchronized String consume() throws InterruptedException {
            while (stock.isEmpty()) {
                wait();
            }
            String shoe = stock.poll(); 
            System.out.println("Consumed: " + shoe);
            notifyAll(); 
            return shoe;
        }
    }

    static class Producer extends Thread {
        private final ShoeShop shoeShop;
        private final int count;

        public Producer(ShoeShop shoeShop, int count) {
            this.shoeShop = shoeShop;
            this.count = count;
        }

        @Override
        public void run() {
            try {
                for (int i = 1; i <= count; i++) {
                    shoeShop.produce("Shoe " + i); 
                    Thread.sleep(100); 
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Consumer extends Thread {
        private final ShoeShop shoeShop;
        private final int count;

        public Consumer(ShoeShop shoeShop, int count) {
            this.shoeShop = shoeShop;
            this.count = count;
        }

        @Override
        public void run() {
            try {
                for (int i = 1; i <= count; i++) {
                    shoeShop.consume(); 
                    Thread.sleep(200);
                }
            } catch (InterruptedException e) {
                e.printStackTrace(); 
            }
        }
    }

    public static void main(String[] args) {
        int capacity = 5; 
        int totalShoes = 10; 

        ShoeShop shop1 = new ShoeShop(capacity);
        Producer producer1 = new Producer(shop1, totalShoes);
        Consumer consumer1 = new Consumer(shop1, totalShoes);

        producer1.start(); 
        consumer1.start();

        try {
            producer1.join();
            consumer1.join();
        } catch (InterruptedException e) {
            e.printStackTrace(); 
        }

        System.out.println("Scenario 1 complete.");

        ShoeShop shop2 = new ShoeShop(capacity);
        Producer producer2 = new Producer(shop2, totalShoes);
        Consumer consumer2a = new Consumer(shop2, totalShoes / 2);
        Consumer consumer2b = new Consumer(shop2, totalShoes / 2);

        producer2.start(); 
        consumer2a.start(); 
        consumer2b.start(); 

        try {
            producer2.join();
            consumer2a.join();
            consumer2b.join();
        } catch (InterruptedException e) {
            e.printStackTrace(); 
        }

        System.out.println("Scenario 2 complete.");

        ShoeShop shop3 = new ShoeShop(capacity);
        Producer producer3a = new Producer(shop3, totalShoes / 2);
        Producer producer3b = new Producer(shop3, totalShoes / 2);
        Consumer consumer3 = new Consumer(shop3, totalShoes);

        producer3a.start();
        producer3b.start();
        consumer3.start();

        try {
            producer3a.join();
            producer3b.join();
            consumer3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Scenario 3 complete.");
    }
}
