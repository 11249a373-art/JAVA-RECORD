class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(
            Thread.currentThread().getName() +" - Priority: " +Thread.currentThread().getPriority());
    }
}

public class PriorityThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.setPriority(3);
        t2.setPriority(5);
        t3.setPriority(8);

        t1.start();
        t2.start();
        t3.start();
    }
}
