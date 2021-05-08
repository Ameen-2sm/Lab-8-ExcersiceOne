public class ThreadExampleOne {

    public static void main(String args[]) {

        ThreadUsingExtend exOneThread = new ThreadUsingExtend();
        exOneThread.start();
        ThreadUsingExtend exTwoThread = new ThreadUsingExtend();
        exTwoThread.start();

    }

}
