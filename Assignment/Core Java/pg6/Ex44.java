class MyRunnable implements Runnable {

    @Override
    public void run() {
        
        for (int i = 1; i <= 5; i++) {

            System.out.println("Thread: " + Thread.currentThread().getId() + ", Count: " + i);

            try {

                Thread.sleep(1000); // Simulate some work for 1 second

            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}

public class Ex44 {

    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();

        Thread thread = new Thread(myRunnable);

        thread.start();
    }
}
