class FooBar {
    private static final Phaser phaser = new Phaser(2);

    private int n;

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n * 2; i++) {
            if (i % 2 == 0) {
        	  // printFoo.run() outputs "foo". Do not change or remove this line.
        	  printFoo.run();
            }
            phaser.arriveAndAwaitAdvance();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n * 2; i++) {
            if (i % 2 != 0) {
                // printBar.run() outputs "bar". Do not change or remove this line.
        	    printBar.run();
            }
            phaser.arriveAndAwaitAdvance();
        }
    }
}