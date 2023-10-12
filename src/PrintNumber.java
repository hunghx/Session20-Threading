public class PrintNumber implements Runnable{
    private int max;

    public PrintNumber(int max) {
        this.max = max;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 1; i <= max; i++) {
            System.out.println(i);
        }
    }
}
