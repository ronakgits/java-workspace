
class TestDaemonThread2 extends Thread {

    @Override
    public void run() {

        if (isDaemon()) {

            System.out.println("This is a Daemon Thread.");

        } else {

            System.out.println("This is a User Thread.");
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Ex48 {

    public static void main(String[] args) {

        TestDaemonThread2 t1 = new TestDaemonThread2();
        TestDaemonThread2 t2 = new TestDaemonThread2();

        t1.start();
        t1.setDaemon(true); // throw an IllegalThreadStateException 
        t2.start();
    }
}
