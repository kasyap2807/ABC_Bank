public class Main {
    public static void main(String[] args) {
        Runnable t1 = new test1();
        Runnable t2 = new test2();

        Thread th1 = new Thread(t1,"threadone");
        Thread th2 = new Thread(t2,"threadTWO");

        th1.setPriority(10);
        th1.start();


        th2.start();


//        System.out.println(th1.getName());

    }
}

class test1 implements Runnable{

    public void run(){
        try {
            method();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void method() throws InterruptedException {
        for(int i = 0; i< 10; i++){
            System.out.println("hi");
            Thread.sleep(10);
        }

    }
}

class test2 implements Runnable{
    public void run(){
        try {
            method();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void method() throws InterruptedException {
        for(int i = 0; i< 10; i++){
            System.out.println("Bye");
            Thread.sleep(10);
        }

    }
}