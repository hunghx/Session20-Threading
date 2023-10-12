public class PrintCharacter implements Runnable{
    private int max;
    private char c;

    public PrintCharacter(int max, char c) {
        this.max = max;
        this.c = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < max; i++) {
            System.out.println(c);
        }
    }
}
