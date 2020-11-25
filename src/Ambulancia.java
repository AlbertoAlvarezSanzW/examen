


public class Ambulancia extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("voy a curarte");
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
