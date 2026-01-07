public class Threads {

    public static void main(String[] args) {
        

        MyThread task1 = new MyThread("ChefA");
        MyThread task2 = new MyThread("ChefB");
        MyThread task3 = new MyThread("ChefC");
        MyThread task4 = new MyThread("ChefD");

        task1.start();
        task2.start();
        task3.start();
        task4.start();

    }
    
}


class MyThread extends Thread{

    private String task;

     MyThread(String task) {
            this.task = task;
    }


    public void run(){
        System.out.println("Task "+ task + " is starting.");
        try {
            Thread.sleep(2000); // Simulate a task taking some time
        } catch (InterruptedException e) {
            System.out.println("Task " + task + " was interrupted.");
        }
        System.out.println("Task "+ task + " is completed.");
    }
    

}


class MyRunnableThread implements Runnable {
    private String task;

     MyRunnableThread(String task) {
            this.task = task;
    }


  public void run(){
        System.out.println("Task "+ task + " is starting.");
        try {
            Thread.sleep(2000); // Simulate a task taking some time
        } catch (InterruptedException e) {
            System.out.println("Task " + task + " was interrupted.");
        }
        System.out.println("Task "+ task + " is completed.");
    }
}
