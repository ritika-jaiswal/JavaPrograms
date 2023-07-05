
class X implements Runnable {

    int a, b;

    public void run() {

        for (int i = 0; i < 1000; i++)

            synchronized (this) {

                a = 18;

                b = 18;

            }

        System.out.print(a + " " + b + " ");

    }

    public static void main(String args[]) {

        X test = new X();

        Thread x1 = new Thread(test);

        Thread x2 = new Thread(test);

        x1.start();

        x2.start();

    }

}
