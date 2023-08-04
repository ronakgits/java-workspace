
class MyRunnable implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Thread: " + Thread.currentThread().getId() + ", Count: " + i);

            try {

                Thread.sleep(2000); 

            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}

public class Ex46 {

    public static void main(String[] args) {

        MyRunnable myRunnable1 = new MyRunnable();
        MyRunnable myRunnable2 = new MyRunnable();

        Thread thread1 = new Thread(myRunnable1);
        Thread thread2 = new Thread(myRunnable2);

        thread1.start();
        thread2.start();
    }
}
