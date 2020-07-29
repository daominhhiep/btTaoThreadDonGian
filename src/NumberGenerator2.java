public class NumberGenerator2 implements Runnable {
    @Override
    synchronized public void run() {
        for (int i = 10; i > 0; i--) {
            System.err.println(i);
            System.err.println(hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("LOI");
            }
        }
    }
}
