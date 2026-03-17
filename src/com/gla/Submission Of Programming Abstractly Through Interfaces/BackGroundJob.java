public class BackGroundJob {
    public static void main(String[] args) {

        // Lambda expression for Runnable
        Runnable task = () -> {
            System.out.println("Background job is running...");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {}
            System.out.println("Job completed!");
        };

        // Run in new thread
        Thread t = new Thread(task);
        t.start();
    }
}