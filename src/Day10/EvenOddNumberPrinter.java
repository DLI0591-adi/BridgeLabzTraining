package Day10;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class EvenOddNumberPrinter {
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();

        Thread evenThread = new Thread(new EvenNumberTask(printer));
        Thread oddThread = new Thread(new OddNumberTask(printer));

        evenThread.start();
        oddThread.start();
    }
}

class NumberPrinter {
    private int number = 1;
    private final Lock lock = new ReentrantLock();
    private final Condition evenCondition = lock.newCondition();
    private final Condition oddCondition = lock.newCondition();
    private boolean evenTurn = false;

    public void printEvenNumber() {
        lock.lock();
        try {
            while (!evenTurn) {
                evenCondition.await();
            }
            System.out.println("Even: " + number++);
            evenTurn = false;
            oddCondition.signal();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }

    public void printOddNumber() {
        lock.lock();
        try {
            while (evenTurn) {
                oddCondition.await();
            }
            System.out.println("Odd: " + number++);
            evenTurn = true;
            evenCondition.signal();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }
}

class EvenNumberTask implements Runnable {
    private final NumberPrinter printer;

    public EvenNumberTask(NumberPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            printer.printEvenNumber();
        }
    }
}

class OddNumberTask implements Runnable {
    private final NumberPrinter printer;

    public OddNumberTask(NumberPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            printer.printOddNumber();
        }
    }
}