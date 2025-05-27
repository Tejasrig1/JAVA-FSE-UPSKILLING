class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " says Hello " + i);
        }
    }
}

public class ThreadCreation {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread A");
        MyThread thread2 = new MyThread("Thread B");

        thread1.start();
        thread2.start();
    }
}