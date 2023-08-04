class MyThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Thread: " + Thread.currentThread().getId() + ", Count: " + i);

            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Ex45 {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();

        myThread.start();
    }
}
