public class BackgroundJobExecution {
    public static void main(String[] args) {
        Runnable job = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Running job step " + i);
            }
        };
        Thread t = new Thread(job);
        t.start();
    }
}
