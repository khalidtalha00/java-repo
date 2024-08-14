// Multithreading = process of executing multiple threads simultaneously. It helps maximise the cpu usage. Threads are independent as they do not affect the execution of other thread



public class Mythread extends Thread{

    @Override  // the run method overrides the run method of the thread class
    public void run(){
        try {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread #1:"+i);
            Thread.sleep(1000); // 1000 ms is equivalent to 1 seconds.
        }

        }
        catch (InterruptedException IE){
            System.out.println(IE);
        }
    }

    public static void main(String[] args) {
        Mythread thread1 = new Mythread();
        thread1.start();
    }

}




