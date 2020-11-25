

public class Corredor extends Thread{
    @Override
    public void run() {
        System.out.println(getName());


        try {
            start();
            join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
