public class Main {
    public static void main(String[] args) {
        NumberGenerator1 numberGenerator1 = new NumberGenerator1();
        NumberGenerator2 numberGenerator2 = new NumberGenerator2();

        Thread t1 = new Thread(numberGenerator1);
        Thread t2 = new Thread(numberGenerator2);

        t1.setPriority(1);
        t2.setPriority(2);

        t1.start();
        t2.start();
    }
}
