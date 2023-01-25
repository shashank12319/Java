package daemon;
//This code creates a user thread and sets it as a 
//daemon thread using the setDaemon method. 
//It then starts the thread and waits for it to
//finish using the join method. The main thread will 
//not reach the line of code that prints 
//"Main thread completed." until the user 
//thread has completed.

public class Daemon {
    public static void main(String[] args) throws InterruptedException {
        // Create a user thread
        Thread userThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // Perform some task
                System.out.println("User thread starting...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // Ignore exception
                }
                System.out.println("User thread completed.");
            }
        });

        // Set the user thread to be a daemon thread
        userThread.setDaemon(true);

        // Start the user thread
        userThread.start();

        // Wait for the user thread to complete
        userThread.join();

        // The main thread will not reach this point until the user thread has completed
        System.out.println("Main thread completed.");
    }
}
